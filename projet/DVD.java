package projet;

public class DVD extends Multimedia {
protected String cineaste;

public DVD() {
	super();
cineaste="";
}

public DVD(ClDate date, String titre, int coteDewey, int nbrCopies, int valeur,String _cineaste) {
	super(date, titre, coteDewey, nbrCopies, valeur, _cineaste, _cineaste, valeur);
	cineaste=_cineaste;
}

public String getCineaste() {
	return cineaste;
}

public void setCineaste(String cineaste) {
	this.cineaste = cineaste;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((cineaste == null) ? 0 : cineaste.hashCode());
	return result;
}

public boolean equals(DVD obj) {
	return (super.equals(obj) &&cineaste.equals(obj.getCineaste()));
}

@Override
public String toString() {
	return "DVD [cineaste=" + cineaste + ", titre=" + titre + ", coteDewey=" + coteDewey + ", nbrCopies=" + nbrCopies
			+ ", valeur=" + valeur + "]";
}

	

}
