package projet;

public class Livre extends Volume{
protected String categorie;
protected String collection;
protected String auteur;
protected int nbrPages;
public Livre() {
	super();
	categorie="";
	collection="";
	auteur="";
	nbrPages=0;
}
public Livre(ClDate date, String titre, int coteDewey, int nbrCopies, int valeur, String _isbn, String _editeur,String _categorie,String _collection,String _auteur,int nbr) {
	super(date, titre, coteDewey, nbrCopies, valeur, _isbn, _editeur);
	categorie=_categorie;
	collection=_collection;
	auteur=_auteur;
	nbrPages=nbr;
}
public String getCategorie() {
	return categorie;
}
public void setCategorie(String categorie) {
	this.categorie = categorie;
}
public String getCollection() {
	return collection;
}
public void setCollection(String collection) {
	this.collection = collection;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public int getNbrPages() {
	return nbrPages;
}
public void setNbrPages(int nbrPages) {
	this.nbrPages = nbrPages;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((auteur == null) ? 0 : auteur.hashCode());
	result = prime * result + ((categorie == null) ? 0 : categorie.hashCode());
	result = prime * result + ((collection == null) ? 0 : collection.hashCode());
	result = prime * result + nbrPages;
	return result;
}

public boolean equals(Livre obj) {

	return (super.equals(obj) &&categorie.equals(obj.getCategorie())&& collection.equals(obj.getCollection())&&auteur.equals(obj.getAuteur())&& this.nbrPages==obj.getNbrPages());
}
@Override
public String toString() {
	return "Livre [categorie=" + categorie + ", collection=" + collection + ", auteur=" + auteur + ", nbrPages="
			+ nbrPages + ", editeur=" + editeur + ", isbn=" + isbn + ", titre=" + titre + ", coteDewey=" + coteDewey
			+ ", nbrCopies=" + nbrCopies + ", valeur=" + valeur + "]";
}

	
}
