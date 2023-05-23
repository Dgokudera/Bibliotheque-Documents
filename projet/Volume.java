package projet;

public abstract class Volume extends Document{

protected String editeur;
protected String isbn;
public Volume() {
	super();
	editeur="";
	isbn="";}
public Volume(ClDate date, String titre, int coteDewey, int nbrCopies, int valeur,String _isbn,String _editeur) {
	super(date, titre, coteDewey, nbrCopies, valeur);
	editeur=_editeur;
	isbn=_isbn;
}
public String getEditeur() {
	return editeur;
}
public void setEditeur(String editeur) {
	this.editeur = editeur;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((editeur == null) ? 0 : editeur.hashCode());
	result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
	return result;
}

public boolean equals(Volume obj) {
	return (super.equals(obj) &&editeur.equals(obj.getEditeur())&&isbn.equals(obj.getIsbn()));
}
@Override
public String toString() {
	return "Volume [editeur=" + editeur + ", isbn=" + isbn + ", titre=" + titre + ", coteDewey=" + coteDewey
			+ ", nbrCopies=" + nbrCopies + ", valeur=" + valeur + "]";
}



}
