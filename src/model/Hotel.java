package model;
import java.util.*;

import model.reservation.etatreservation;

public class Hotel {
	public Map<Integer, chambre> chambres; 
	public Map<Integer, reservation> reservations; 
	public Map<String, administrateur> administrateurs; 
	public Map<String, client> clients; 
	public Scanner scanner;
	
	public Hotel()
	{
		chambres = new HashMap<>();
        reservations = new HashMap<>();
        administrateurs = new HashMap<>();
        clients = new HashMap<>();
        scanner = new Scanner(System.in);
        for(int i=0;i<10;i++) {
        	chambre chambreExemple = new chambre(i+1, true);
            chambres.put(i+1, chambreExemple);
        }
        
        administrateur adminExemple = new administrateur("a", "a", new date(1, 1, 1), "01111111", "admin@gmail.com");
        administrateurs.put("A.a.a.1", adminExemple);
        client clientExemple = new client("c", "c", new date(1, 1, 1), "02222222", "client@gmail.com");
        clients.put("C.c.c.1", clientExemple);
	}
	
	//FINI ET UTILISEE
	public boolean créationAdmin(String nom,String prenom,date g,String num,String mail){

		        administrateur admin = new administrateur(nom,prenom,g,num,mail);
		        if (administrateurs.containsKey(admin.idadmin())) {
		            return false;
		        } else {
		            administrateurs.put(admin.idadmin(), admin);
		            return true;
		        }
		

    }
	//FINI ET UTILISEE
	public boolean créationClient(String nom,String prenom,date g,String num,String mail){
		while(true)
		{
		        client cli = new client(nom,prenom,g,num,mail);
		        if (clients.containsKey(cli.idclient())) {
		            return false;
		        } else {
		            clients.put(cli.idclient(), cli);
		            return true;
		        }
		}
    }
	//FINI ET UTILISE
	public boolean connexionAdmin(String idadmin)
	{
		    if(administrateurs.containsKey(idadmin))
			{
				return true;
			}
		    else
		    {
		    	return false;
		    }
	}
	//FINI ET UTILISEE
	public boolean connexionClient(String idclient){

		    if(clients.containsKey(idclient))
			{
				return true;
			}
		    else
		    {
		    	return false;
		    }
		
	}
	//FINI ET UTILISEE
	public boolean ajoutChambre(Map<Integer, chambre> chambres) {
				int nchambre=nbrChambre(chambres)+1;
        		chambres.put(nchambre, new chambre(nchambre, true));
	            return true; 
	    }
	//FINI ET UTILISEE
    public int nbrChambre(Map<Integer,chambre> chambres)
    {
    	int nchmbr=0;
    	for(chambre chambre : chambres.values())
    	{
    		nchmbr++;
    	}
		return nchmbr;
    }
	//FINI ET UTILISEE
    public boolean modificationChambreDispo(Map<Integer, chambre> chambres,int numchambre) 
    {
        chambre chambre = chambres.get(numchambre);
        if (chambre != null)
        {
            chambre.setDisponibilite(true);
            return true;
        } 
        else 
        {
            return false;
        }
    }
	//FINI ET UTILISEE
    public boolean modificationChambreNONDispo(Map<Integer, chambre> chambres,int numchambre) 
    {
        chambre chambre = chambres.get(numchambre);
        if (chambre != null)
        {
            chambre.setDisponibilite(false);
            return true;
        } 
        else 
        {
            return false;
        }
    }
	//FINI ET UTILISEE
    public boolean supprimerChambre(Map<Integer, chambre> chambres,int numsuppr) 
    {
        if (chambres.containsKey(numsuppr)) 
        {
            chambre chambre = chambres.get(numsuppr);
            if(chambre.getDisponibilite())
        	{
            chambres.remove(numsuppr);
            return true;
        	}
        }
            return false;
    }
	//FINI ET UTILISEE
    public int nombreReservation(Map<Integer, reservation> reservations)
    {
    	int nreserv=0;
    	for(reservation reservation : reservations.values())
    	{
    		if(reservation.getEtat() == etatreservation.En_Attente)
    		{
    		nreserv++;
    		}
    	}
    		
    	return nreserv;
    }
	//FINI ET UTILISEE
    public boolean accepterReservation(Map<Integer, reservation> reservations, int idReservation) {
        reservation resAccepter = reservations.get(idReservation);
        if (resAccepter != null) {
        	if(resAccepter.getEtat()==etatreservation.En_Attente) 
        	{
            resAccepter.setEtat(etatreservation.Acceptée);
            return true;
        	}
        	return false;
        }
        return false;
    }
	//FINI ET UTILISEE
    public boolean refuserReservation(Map<Integer, reservation> reservations, int idReservation) {
        reservation resR = reservations.get(idReservation);
        if (resR != null) 
        {
        	if(resR.getEtat()==etatreservation.En_Attente) 
        	{
            resR.setEtat(etatreservation.Refusée);
            return true;
        	}
        	return false;
        }
        return false;
    }
    //FINI ET UTILISEE
    public int afficherChambresDisponibles(Map<Integer, chambre> chambres) {
        int nbrchmbrdispo=0;
    	for (Map.Entry<Integer, chambre> chdisp : chambres.entrySet()) {
            chambre chambreCourante = chdisp.getValue();
            if (chambreCourante.estdispo()) {
            	nbrchmbrdispo++;
            }
        }
		return nbrchmbrdispo;
    }
    //FINI ET UTILISEE
    public boolean effectuerDemandeReservation(Map<Integer, chambre> chambres, Map<Integer, reservation> reservations,int numchambre,String idc,date debut,date fin){
        chambre chambredemandee = chambres.get(numchambre);
        if (chambredemandee == null) {
            return false;
        } else if (!chambredemandee.estdispo()) {
            return false;
        }
        reservation nouvelleReservation = new reservation(idc, numchambre, debut, fin);
        reservations.put(nouvelleReservation.getId(), nouvelleReservation);
        chambredemandee.setDisponibilite(false);
        return true;
    }
    
    //FINI ET UTILISEE
    public boolean verifClientReservation(Map<Integer, reservation> reservations, String idc)
    {
    	for (Map.Entry<Integer, reservation> entry : reservations.entrySet()) 
    	{
            reservation reserv = entry.getValue();
            if (reserv.getIdClient().equals(idc)) 
            {
            	return true;
            }
                   
        }            	
    	return false;
    }
    
    //FINI ET UTILISEE
    //IL FAUT RENDRE LA CHAMBRE DISPONIBLE
    public boolean annulerReservation(Map<Integer, reservation> reservations,Map<Integer, chambre> chambres, String idc) {
        for (Map.Entry<Integer, reservation> entry : reservations.entrySet()) {
            reservation reserv = entry.getValue();
            if (reserv.getIdClient().equals(idc)) 
            {
            		int nc = reserv.getNumchambre();
            		chambre chreserv = chambres.get(nc);
        			chreserv.setDisponibilite(true);
                    reservations.remove(entry.getKey());
                    return true;   
            }
        }
        return false;
    }
    //FINI ET UTILISEE
    public date datereservationactuelle(Map<Integer, reservation> reservations, String idc) {
        for (reservation reserv : reservations.values()) {
            if (reserv.getIdClient().equals(idc)) {
                return reserv.getDateFin();
            }
        }
        return null;
    }
    //FINI ET UTILISEE
    public boolean modifierReservation(Map<Integer, reservation> reservations, String idc, date nouvelleDateFin) {
        for (reservation reservation : reservations.values()) {
            if (reservation.getIdClient().equals(idc)) {
                reservation.setDateFin(nouvelleDateFin);
                return true;
            }
        }
        return false;
    }
    
    public String chambreDispoString(Map<Integer, chambre> chambres)
    {
    	String s = " ";
    	for (chambre chambre : chambres.values())
    	{
    		if(chambre.getDisponibilite())
    		{
    			s = s + chambre.getNumchambre() + " / ";
    		}
    	}
    	
    	if(s.length()>1)
    	{
        	return s.substring(0, s.length()-2);
    	}
    	else
    	{
    		return " ";
    	}
    }
    
    public String reservationAttenteString(Map<Integer, reservation> reservations)
    {
    	String s = " ";
    	for (reservation reservation : reservations.values()) 
    	{
            if (reservation.getEtat()==etatreservation.En_Attente) 
            {
                s = s + reservation.getId() + " / ";
            }
        }
    	if(s.length()>1)
    	{
        	return s.substring(0, s.length()-2);
    	}
    	else
    	{
    		return " ";
    	}
    }
}
