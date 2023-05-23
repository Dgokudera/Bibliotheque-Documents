package projet;

public class Revue extends periodique {
protected String sujet;

public Revue() {
	super();
	sujet="";
}

public Revue(ClDate date, String titre, int coteDewey, int nbrCopies, int valeur, int perio, int numPer, String _issn,String _sujet) {
	super();
	sujet=_sujet;
	}

public String getSujet() {
	return sujet;
}

public void setSujet(String sujet) {
	this.sujet = sujet;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((sujet == null) ? 0 : sujet.hashCode());
	return result;
}


public boolean equals(Revue obj) {
return (super.equals(obj) &&sujet.equals(obj.getSujet()));
}

@Override
public String toString() {
	return "Revue [sujet=" + sujet + ", periodicite=" + periodicite + ", numPeriode=" + numPeriode + ", issn=" + issn
			+ ", titre=" + titre + ", coteDewey=" + coteDewey + ", nbrCopies=" + nbrCopies + ", valeur=" + valeur + "]";
}

	

}
