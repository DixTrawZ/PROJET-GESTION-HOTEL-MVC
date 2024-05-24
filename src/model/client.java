package model;

import java.util.Map;
import java.util.Scanner;

public class client extends utilisateur {
	public boolean reservationeffectuer;

    public client(String nom,String prenom,date datenaissance,String numtel,String email){
        super(nom,prenom,datenaissance,numtel,email);
        this.reservationeffectuer=false;
    }
    
    public String idclient()
    {
    	return "C."+super.idutilisateur();
    }
    public String toString()
    {
    	return super.toString()+idclient();
    }

    //RETURN NOMBRE DE CHAMBRE DISPO
    //FINI
    public int afficherChambresDisponibles(Map<Integer, chambre> chambres,String idc) {
        int nbrchmbrdispo=0;
    	for (Map.Entry<Integer, chambre> chdisp : chambres.entrySet()) {
            chambre chambreCourante = chdisp.getValue();
            if (chambreCourante.estdispo()) {
            	nbrchmbrdispo++;
            }
        }
		return nbrchmbrdispo;
    }
    //DEMANDER UNE RESERVATION
    //FINI
    public boolean effectuerDemandeReservation(Map<Integer, chambre> chambres, Map<Integer, reservation> reservations,int numchambre,String idc,date debut,date fin){
        chambre chambredemandee = chambres.get(numchambre);
        if (chambredemandee == null) {
            return false;
        } else if (!chambredemandee.estdispo()) {
            return false;
        }
        reservation nouvelleReservation = new reservation(this.idclient(), numchambre, debut, fin);
        reservations.put(nouvelleReservation.getId(), nouvelleReservation);
        chambredemandee.setDisponibilite(false);
        return true;
    }
    
    //VERIFIE SI LE CLIENT A UNE RESERVATION
    //FINI
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
    
    //ANNULER RESERVATION
    //FINI
    //RENDRE LA CHAMBRE DISPONIBLE
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

    //MODIFIER RESERVATION
    //FINI
    public boolean modifierReservation(Map<Integer, reservation> reservations, String idc, date nouvelleDateFin) {
        for (reservation reservation : reservations.values()) {
            if (reservation.getIdClient().equals(idc)) {
                reservation.setDateFin(nouvelleDateFin);
                return true;
            }
        }
        return false;
    }
    //DATE DE FIN
    //FINI
    public date datereservationactuelle(Map<Integer, reservation> reservations, String idc) {
        for (reservation reserv : reservations.values()) {
            if (reserv.getIdClient().equals(idc)) {
                return reserv.getDateFin();
            }
        }
        return null;
    }
    
    
}