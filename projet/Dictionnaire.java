package projet;

public class Dictionnaire extends Volume{
protected String type;

public Dictionnaire() {
	super();
	type="";
	}

public Dictionnaire(ClDate date, String titre, int coteDewey, int nbrCopies, int valeur, String _isbn,
		String _editeur,String _type) {
	super(date, titre, coteDewey, nbrCopies, valeur, _isbn, _editeur);
	type=_type;
	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
}


public boolean equals(Dictionnaire obj) {

	return (super.equals(obj) &&type.equals(obj.getType()));
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
public String toString() {
	return "Dictionnaire [type=" + type + ", editeur=" + editeur + ", isbn=" + isbn + ", titre=" + titre
			+ ", coteDewey=" + coteDewey + ", nbrCopies=" + nbrCopies + ", valeur=" + valeur + "]";
}
	

}
