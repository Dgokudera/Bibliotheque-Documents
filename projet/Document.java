package projet;
import projet.ClDate;
public abstract class Document {
	private ClDate  date;
	protected String titre;
	protected int coteDewey;
	protected int nbrCopies;
	protected int valeur;
	public Document() {
		titre="";
		coteDewey=0;
		nbrCopies=0;
		valeur=0;
		date = new ClDate();
		}
	
	
	public Document(ClDate date, String titre, int coteDewey, int nbrCopies, int valeur) {
		super();
		this.date = date;
		this.titre = titre;
		this.coteDewey = coteDewey;
		this.nbrCopies = nbrCopies;
		this.valeur = valeur;
	}


	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getCoteDewey() {
		return coteDewey;
	}
	public void setCoteDewey(int coteDewey) {
		this.coteDewey = coteDewey;
	}
	public int getNbrCopies() {
		return nbrCopies;
	}
	public void setNbrCopies(int nbrCopies) {
		this.nbrCopies = nbrCopies;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public ClDate getDate() {
		return date;
	}


	public void setDate(ClDate date) {
		this.date = date;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + coteDewey;
		result = prime * result + nbrCopies;
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		result = prime * result + valeur;
		return result;
	}
	public boolean equals(Document obj) {
		return(titre.equals(obj.getTitre()) && this.coteDewey==obj.getCoteDewey() && this.nbrCopies== obj.getNbrCopies() && this.valeur==obj.getValeur());
	}
	@Override
	public String toString() {
		return "Document [date=" + date + ", titre=" + titre + ", coteDewey=" + coteDewey + ", nbrCopies=" + nbrCopies
				+ ", valeur=" + valeur + "]";
	}




}
