package projet;
import javax.swing.*;
import projet.Document;
import java.util.Collections;
import java.util.*;


import java.util.ArrayList;
import java.util.Collection;

public class BDDocument implements Comparator{
protected ArrayList <Document> listeDocument;
	public BDDocument() {
		listeDocument=new ArrayList<Document>();
}
	public BDDocument (Document tabDoc[]) {
		listeDocument= new ArrayList<Document>();
		for(int ctr=0;ctr<tabDoc.length;ctr++) {
			listeDocument.add(tabDoc[ctr]);
		}
}
	public ArrayList<Document> getListeDocument() {
		return listeDocument;
	}
	public void setListeDocument(ArrayList<Document> listeDocument) {
		this.listeDocument = listeDocument;
	}
	public void Ajouter(Object obj) {
		Document unDocument=(Document) obj;
		listeDocument.add(unDocument);
	}
	public void Supprimer(int position) {
		listeDocument.remove(position);
	}
	public void Modifier(Object obj,int position) {
		Document unDocument=(Document) obj;
		listeDocument.remove(position);
		listeDocument.add(position,unDocument);
	}
	public void Rechercher(Document obj,String recherche) {

		 boolean documentTrouve = false;

		    for (int ctr = 0; ctr < listeDocument.size(); ctr++) {
		        Document unDoc = listeDocument.get(ctr);
		        if (unDoc.getTitre().equalsIgnoreCase(recherche)) {
		            JOptionPane.showMessageDialog(null, unDoc.toString());
		            documentTrouve = true;
		        }
		    }

		    if (!documentTrouve) {
		        JOptionPane.showMessageDialog(null, "Aucun document trouvé avec ce titre.");
		    }
            	}
      

		/*for(int ctr = 0; ctr < listeDocument.size(); ctr ++)
		{
			Document deuxDoc = (Document) listeDocument.get(ctr);

			if(deuxDoc.getTitre().equals(recherche))
			{
				JOptionPane.showMessageDialog(null,deuxDoc.toString());
			}
		}*/
			
	public void Console(Object obj) {
		Document unDocument = (Document) obj;
		
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		Document unDoc = (Document) o1;
		Document deuxDoc = (Document) o2;
		if(unDoc.getDate()>deuxDoc.getDate()) {
			return 1;
		}

		return 0;
	}
	}

		
	

