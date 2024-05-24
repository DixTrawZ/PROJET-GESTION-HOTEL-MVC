package model;

public class reservation {
	public enum etatreservation{
		Acceptée,Refusée,En_Attente;
	}
	 private static int count = 0;

	    private int id;
	    private String idclient;
	    private int numchambre;
	    private date dateDebut;
	    private date dateFin;
	    private etatreservation etat;

	    public reservation(String idclient, int numchambre, date dateDebut, date dateFin) {
	        this.id = ++count;
	        this.idclient = idclient;
	        this.numchambre = numchambre;
	        this.dateDebut = dateDebut;
	        this.dateFin = dateFin;
	        this.etat = etatreservation.En_Attente;
	    }

	   

	    public int getId() {
	        return id;
	    }

	    public String getIdClient() {
	        return idclient;
	    }

	    public void setIdClient(String idclient) {
	        this.idclient = idclient;
	    }

	    public int getNumchambre() {
	        return numchambre;
	    }

	    public void setNumchambre(int numchambre) {
	        this.numchambre = numchambre;
	    }

	    public date getDateDebut() {
	        return dateDebut;
	    }

	    public void setDateDebut(date dateDebut) {
	        this.dateDebut = dateDebut;
	    }

	    public date getDateFin() {
	        return dateFin;
	    }

	    public void setDateFin(date dateFin) {
	        this.dateFin = dateFin;
	    }

	    public etatreservation getEtat() {
	        return etat;
	    }

	    public void setEtat(etatreservation etat) {
	        this.etat = etat;
	    }

	    
	    @Override
	    public String toString() {
	        return "Réservation [id=" + id + ", idclient=" + idclient + ", idChambre=" + numchambre + ", dateDebut="
	                + dateDebut + ", dateFin=" + dateFin + ", état=" + etat + "]";
	    }

}
