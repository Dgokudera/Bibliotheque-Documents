package Test;
import java.util.ArrayList;

import javax.swing.*;
import projet.ClDate;
import projet.Dictionnaire;
import projet.DisqueCompact;
import projet.DVD;
import projet.Document;
import projet.Journal;
import projet.Revue;
import projet.Multimedia;
import projet.Livre;
import projet.periodique;
import projet.Volume;
import projet.BDDocument;
import javax.swing.*;
import java.awt.*;
public class TestBiblio {

	public static int MAXELEMENT = 5;

	
	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
BDDocument unDoc= new BDDocument();
		String strMenu[] = {  "Ajouter un Document",
				  "Supprimer un Document",
				  "Modifier un Document",
				  "Rechercher et Visualiser un Document",
				  "Mode Console",
				  "Ecrire",
				  "Quitter"
				};
String strChoixMenu = "";
int ChoixMenu = 0;

String strSousMenu[] = { "Trier par date de debut",
					 "Trier par nom",
					 "Trier par cout",
					 "Menu principal"
					};
String strChoixSMenu = "";
int ChoixSMenu = 0;


for(int ctr = 0; ctr < MAXELEMENT; ctr++)
{
liste.add( donnees[ctr]);
}

do
{
strChoixMenu = (String) JOptionPane.showInputDialog(null, "Selectionner une des options suivantes: ", "Menu principal", JOptionPane.QUESTION_MESSAGE, null, strMenu, strMenu[0]);

for( int ctr = 0; ctr < strMenu.length; ctr++)
{
	if( strChoixMenu.equals( (strMenu[ctr]) ))
		{
			ChoixMenu = ctr;
		}
}
switch( ChoixMenu )
{

case 0: Tache uneTache = new Tache();
		liste.add(uneTache);
		
break;

case 1: strNom = JOptionPane.showInputDialog("Entrez le nom de la tache");

		for(int ctr = 0; ctr < liste.size(); ctr ++)
		{
			Tache uneTacheTempo = (Tache) liste.get(ctr);
			
			if(uneTacheTempo.getnomTache().equals(strNom))
			{
				liste.remove(ctr);
			}
		}

break;

case 3: String strNom2 = "";
		boolean result = false; 
		
		strNom2 = JOptionPane.showInputDialog("Entrez le nom de la tache");
		
		for(int ctr = 0; ctr < liste.size(); ctr ++)
		{
			Tache deuxTacheTempo = (Tache) liste.get(ctr);
			
			if(deuxTacheTempo.getnomTache().equals(strNom2))
			{
				result = true;
			}
		}
		
		if(result)
			JOptionPane.showMessageDialog(null, "La tache est presente dans le tableau");
		else
			JOptionPane.showMessageDialog(null, "La tache n'est pas presente dans le tableau");
break;

case 4: String strNom3 = "";
		strNom3 = JOptionPane.showInputDialog("Entrez le nom de la tache");

		for(int ctr = 0; ctr < liste.size(); ctr ++)
			{
				Tache troisTacheTempo = (Tache) liste.get(ctr);
	
				if(troisTacheTempo.getnomTache().equals(strNom3))
				{
					JOptionPane.showMessageDialog(null, "Resultat recherche: " + liste.get(ctr));
				}
			}
break;
		
case 5: strChoixSMenu = (String) JOptionPane.showInputDialog(null, "Selectionner une des options suivantes: ", "Sous-menu", JOptionPane.QUESTION_MESSAGE, null, strSousMenu, strSousMenu[0]);
		
			for( int ctr = 0; ctr < strSousMenu.length; ctr++)
				{
					if( strChoixSMenu.equals( (strSousMenu[ctr]) ))
					{
						ChoixSMenu = ctr;
					}
				}
			switch( ChoixSMenu )
			{
				case 0: Collections.sort(liste);
				break;
				
				case 1: Collections.sort(liste, new Tache());
				break;
				
				case 2: Collections.sort(liste, new ComparatorCout());
				break;
				
			}
break;	
	
case 6: for(int ctr = 0; ctr < liste.size(); ctr++ )
			{
				System.out.println( "\n" + liste.get(ctr));
			}
break;
		
case 7: System.out.println(liste.size());
break;

case 8:
break;

}	
}
while(ChoixMenu != 8);






}


}
