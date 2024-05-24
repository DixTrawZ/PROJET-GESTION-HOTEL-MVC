package model;

public class date  {
	private int jour;
	private int mois;
	private int annee;
	
	public date(int jour,int mois,int annee)
	{		 
		this.jour=jour;
		this.mois=mois;
		this.annee=annee;
	}
	public date()
	{
		
	}
	public int getJour()
	{
		return this.jour;
	}
	public void setJour(int jour)
	{
		this.jour=jour;
	}
	
	public int getMois()
	{
		return this.mois;
	}
	public void setMois(int mois)
	{
		this.mois=mois;
	}
	
	public int getAnnee()
	{
		return this.annee;
	}
	public void setAnnee(int annee)
	{
		this.annee=annee;
	}

	
	
	public int comparerdate(date d)
	{
		if(this.annee != d.annee)
		{
			return Integer.compare(this.annee, d.annee);
		}
		else if(this.mois !=d.mois)
		{
			return Integer.compare(this.mois, d.mois);
		}
		else
		{
			return Integer.compare(this.jour, d.jour);
		}
	}
	
	public boolean datevalide(int jour, int mois, int annee)throws DateIncorrectException {
        if (mois < 1 || mois > 12) {
            throw new DateIncorrectException("Mois invalide.");
        }
        if (jour < 1 || jour > getNombreJoursDansMois(mois, annee)) {
            throw new DateIncorrectException("Jour invalide pour le mois et l'année donnés.");
        }
        if (annee < 0) {
            throw new DateIncorrectException("Année invalide.");
        }
        return true;
    }
	
	 public int getNombreJoursDansMois(int mois, int annee) {
	        switch (mois) {
	            case 1:  
	            case 3: 
	            case 5: 
	            case 7:  
	            case 8: 
	            case 10:
	            case 12: 
	                return 31;
	            case 4: 
	            case 6:  
	            case 9: 
	            case 11: 
	                return 30;
	            case 2:  
	                return AnneeBissextile(annee) ? 29 : 28;
	            default:
	                //throw new DateIncorrectException("Mois invalide.")
	            	return 0;
	        }
	    }
	 
	  private boolean AnneeBissextile(int annee) {
	        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
	    }
	
	public String toString()
	{
		return String.format("%02d/%02d/%02d",this.jour,this.mois,this.annee);
	}
}
