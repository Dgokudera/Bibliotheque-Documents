package projet;

public abstract class Multimedia extends Document {

protected String sujet;
protected int duree;
protected String isbn;
public Multimedia() {
	super();
	sujet="";
	duree=0;
	isbn="";
}
public Multimedia(ClDate date, String titre, int coteDewey, int nbrCopies, int valeur,String _sujet,String _isbn,int _duree) {
	super(date, titre, coteDewey, nbrCopies, valeur);
	sujet=_sujet;
	isbn=_isbn;
	duree=_duree;

}
public String getSujet() {
	return sujet;
}
public void setSujet(String sujet) {
	this.sujet = sujet;
}
public int getDuree() {
	return duree;
}
public void setDuree(int duree) {
	this.duree = duree;
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
	result = prime * result + duree;
	result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
	result = prime * result + ((sujet == null) ? 0 : sujet.hashCode());
	return result;
}
public boolean equals (Multimedia obj) {
return(super.equals(obj) &&sujet.equals(obj.getSujet()) && this.duree==obj.getDuree() && isbn.equals(obj.getIsbn()));
}
@Override
public String toString() {
	return "Multimedia [sujet=" + sujet + ", duree=" + duree + ", isbn=" + isbn + ", titre=" + titre + ", coteDewey="
			+ coteDewey + ", nbrCopies=" + nbrCopies + ", valeur=" + valeur + "]";
}





}
