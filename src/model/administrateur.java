package model;
import java.util.*;

import model.reservation.etatreservation;
public class administrateur extends utilisateur {
 
    public administrateur(String nom,String prenom,date datenaissance,String numtel,String email) {
        super(nom,prenom,datenaissance,numtel,email);
    }
    
    public String idadmin()
    {
    	return "A."+super.idutilisateur();
    }
    
    public String toString()
    {
    	return super.toString()+idadmin();
    }
    //FINI ET MARCHE
    public int nbrChambre(Map<Integer,chambre> chambres)
    {
    	int nchmbr=0;
    	for(chambre chambre : chambres.values())
    	{
    		nchmbr++;
    	}
		return nchmbr;
    }
    //FINI ET MARCHE
    public int ajoutChambre(Map<Integer, chambre> chambres) 
    {
        int nchambre=nbrChambre(chambres)+1;
        chambres.put(nchambre, new chambre(nchambre, true));
        return nchambre;
    }
    //FINI ET MARCHE
    public boolean modificationChambreDispo(Map<Integer, chambre> chambres,int numchambre,String ida) 
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
    //FINI ET MARCHE
    public boolean modificationChambreNONDispo(Map<Integer, chambre> chambres,int numchambre,String ida) 
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
    //FINI ET MARCHE 
    public boolean supprimerChambre(Map<Integer, chambre> chambres,int numsuppr ,String ida) {
        if (chambres.containsKey(numsuppr)) {
            chambres.remove(numsuppr);
            return true;
        } else {
            return false;
        }
    }
    //FINI ET MARCHE
    public int nombreReservation(Map<Integer, reservation> reservations)
    {
    	int nreserv=0;
    	for(reservation reservation : reservations.values())
    	{
    		nreserv++;
    	}
    	return nreserv;
    }
    //FINI ET MARCHE 
    public boolean accepterReservation(Map<Integer, reservation> reservations, int idReservation) {
        reservation resAccepter = reservations.get(idReservation);
        if (resAccepter != null) {
            resAccepter.setEtat(etatreservation.Acceptée);
            return true;
        }
        return false;
    }
    //FINI ET MARCHE 
    public boolean refuserReservation(Map<Integer, reservation> reservations, int idReservation) {
        reservation resR = reservations.get(idReservation);
        if (resR != null) {
            resR.setEtat(etatreservation.Refusée);
            return true;
        }
        return false;
    }
}
