package model;

public abstract class utilisateur {
	protected String nom;
	protected String prenom;
	protected date datenaissance;
	protected String numtel;
	protected String email;
	protected String id;
	public utilisateur (String nom,String prenom,date datenaissance,String numtel,String email)
	{
		this.nom=nom;
		this.prenom=prenom;
		this.datenaissance=datenaissance;
		this.numtel=numtel;
		this.email=email;
		this.id=idutilisateur();
	}
	public String idutilisateur()
	{
		return this.nom+"."+this.prenom+"."+this.datenaissance.getAnnee();
	}
	
    public void gererChambres() {}

    public void gererReservations() {}
    
    public void demanderReservation() {}

    public void modifierReservation() {}
        
    public void annulerReservation() {}
    public String toString()
    {
    	return this.nom+"\n"+this.prenom+"\n"+this.datenaissance+"\n"+this.numtel+"\n"+this.email+"\n";
    }

}
