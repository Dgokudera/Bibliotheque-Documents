package projet;

public abstract class periodique extends Document {

protected String periodicite;
protected String numPeriode;
protected String issn;
public periodique() {
	super();
	periodicite="";
	numPeriode="";
	issn="";
	}
public periodique(ClDate date, String titre, String coteDewey, String nbrCopies, String valeur,String perio,String numPer,String _issn) {
	super();
	periodicite=perio;
	numPeriode=numPer;
	issn=_issn;
}
public String getPeriodicite() {
	return periodicite;
}
public void setPeriodicite(String periodicite) {
	this.periodicite = periodicite;
}
public String getNumPeriode() {
	return numPeriode;
}
public void setNumPeriode(String numPeriode) {
	this.numPeriode = numPeriode;
}
public String getIssn() {
	return issn;
}
public void setIssn(String issn) {
	this.issn = issn;
}


public boolean equals(periodique obj) {
	return (super.equals(obj) && numPeriode.equals(obj.getNumPeriode()) && periodicite.equals(obj.getPeriodicite()) && issn.equals(obj.getIssn()));
}
@Override
public String toString() {
	return "periodique [periodicite=" + periodicite + ", numPeriode=" + numPeriode + ", issn=" + issn + ", titre="
			+ titre + ", coteDewey=" + coteDewey + ", nbrCopies=" + nbrCopies + ", valeur=" + valeur + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((issn == null) ? 0 : issn.hashCode());
	result = prime * result + ((numPeriode == null) ? 0 : numPeriode.hashCode());
	result = prime * result + ((periodicite == null) ? 0 : periodicite.hashCode());
	return result;
}





}
