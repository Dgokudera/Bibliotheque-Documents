package projet;

public class DisqueCompact extends Multimedia {
protected String auteur;
protected String groupe;
protected int nbrPistes;
public DisqueCompact() {
	super();
	auteur="";
	groupe="";
	nbrPistes=0;

}
public DisqueCompact(ClDate date, String titre, int coteDewey, int nbrCopies, int valeur,String _auteur,String _groupe,int nPistes) {
	super(date, titre, coteDewey, nbrCopies, valeur, _groupe, _groupe, nPistes);
	auteur=_auteur;
	groupe=_groupe;
	nbrPistes=nPistes;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public String getGroupe() {
	return groupe;
}
public void setGroupe(String groupe) {
	this.groupe = groupe;
}
public int getNbrPistes() {
	return nbrPistes;
}
public void setNbrPistes(int nbrPistes) {
	this.nbrPistes = nbrPistes;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((auteur == null) ? 0 : auteur.hashCode());
	result = prime * result + ((groupe == null) ? 0 : groupe.hashCode());
	result = prime * result + nbrPistes;
	return result;
}

public boolean equals(DisqueCompact obj) {
	return(super.equals(obj) &&auteur.equals(obj.getAuteur())&&groupe.equals(obj.getGroupe())&&this.nbrPistes==obj.getNbrPistes());
}
@Override
public String toString() {
	return "DisqueCompact [auteur=" + auteur + ", groupe=" + groupe + ", nbrPistes=" + nbrPistes + ", titre=" + titre
			+ ", coteDewey=" + coteDewey + ", nbrCopies=" + nbrCopies + ", valeur=" + valeur + "]";
}


	

}
