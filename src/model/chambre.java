package model;

public class chambre {
	private int numchambre;
	private boolean disponibilite;
	
	 public chambre(int numchambre, boolean disponibilite) {
	        this.numchambre = numchambre;
	        this.disponibilite = disponibilite;
	    }
	
	public int getNumchambre() {
		return numchambre;
	}
	public void setNumchambre(int numchambre) {
		this.numchambre = numchambre;
	}
	
	
	public boolean getDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
	
	public boolean estdispo()
	{
		return disponibilite;
	}
	
	public String toString()
	{
		return "la chambre numéro "+numchambre+",Disponibilité: "+disponibilite; 
	}

}
