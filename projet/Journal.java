package projet;

public class Journal extends periodique{
protected String region;

public Journal() {
	super();
	region="";
}

public Journal(ClDate date, String titre, int coteDewey, int nbrCopies, int valeur, int perio, int numPer,
		String _issn,String _region) {
	super();
	region=_region;
}

public String getRegion() {
	return region;
}

public void setRegion(String region) {
	this.region = region;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((region == null) ? 0 : region.hashCode());
	return result;
}


public boolean equals(Journal obj) {
	return(super.equals(obj) &&region.equals(obj.getRegion()));
}

@Override
public String toString() {
	return "Journal [region=" + region + ", periodicite=" + periodicite + ", numPeriode=" + numPeriode + ", issn="
			+ issn + ", titre=" + titre + ", coteDewey=" + coteDewey + ", nbrCopies=" + nbrCopies + ", valeur=" + valeur
			+ "]";
}



	

}
