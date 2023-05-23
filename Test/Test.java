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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Test {

	  public static void main(String[] args) {
		  JTextField text1,text3,text5,text7,text9,text11,text13,text15,text17,text19,text21;
		  JTextArea text2,text4,text6,text8,text10,text12,text14,text16,text18,text20,text22;
		  
		  
		  Journal unjournal=new Journal();
		  Livre unlivre=new Livre();
		  Revue unerevue=new Revue();
		  Dictionnaire unDictionnaire= new Dictionnaire();
		  DisqueCompact undisque= new DisqueCompact();
		  DVD undvd= new DVD();

		  BDDocument liste = new BDDocument();
		  	Journal deuxjournal = new Journal();
		  liste.Ajouter(deuxjournal);
		  	text1 = new JTextField();
		    text2 = new JTextArea();
		    text3 = new JTextField();
		    text4 = new JTextArea();
		    text5 = new JTextField();
		    text6 = new JTextArea();
		    text7 = new JTextField();
		    text8 = new JTextArea();
		    text9 = new JTextField();
		    text10 = new JTextArea();
		    text11 = new JTextField();
		    text12 = new JTextArea();
		    text13 = new JTextField();
		    text14 = new JTextArea();
		    text15 = new JTextField();
		    text16 = new JTextArea();
		    text17 = new JTextField();
		    text18 = new JTextArea();
		    text19 = new JTextField();
		    text20 = new JTextArea();
		    text21 = new JTextField();
		    text22 = new JTextArea();


		    

		    text1.setBounds(20,50,280,30);
		    text2.setBounds(20,90,280,30);
		    text3.setBounds(20,50,280,30);
		    text4.setBounds(20,90,280,30);
		    text5.setBounds(20,50,280,30);
		    text6.setBounds(20,90,280,30);
		    text7.setBounds(20,50,280,30);
		    text8.setBounds(20,90,280,30);
		    text9.setBounds(20,50,280,30);
		    text10.setBounds(20,90,280,30);
		    text11.setBounds(20,50,280,30);
		    text12.setBounds(20,90,280,30);
		    text13.setBounds(20,50,280,30);
		    text14.setBounds(20,90,280,30);
		    text15.setBounds(20,50,280,30);
		    text16.setBounds(20,90,280,30);
		    text17.setBounds(20,90,280,30);
		    text18.setBounds(20,90,280,30);
		    text19.setBounds(20,90,280,30);
		    text20.setBounds(20,90,280,30);
		    text21.setBounds(20,90,280,30);
		    text22.setBounds(20,90,280,30);
		    
		    text2.setPreferredSize(new Dimension(100,20));
		    text4.setPreferredSize(new Dimension(100,20));
		    text6.setPreferredSize(new Dimension(100,20));
		    text8.setPreferredSize(new Dimension(100,20));
		    text10.setPreferredSize(new Dimension(100,20));
		    text12.setPreferredSize(new Dimension(100,20));
		    text14.setPreferredSize(new Dimension(100,20));
		    text16.setPreferredSize(new Dimension(100,20));
		    text18.setPreferredSize(new Dimension(100,20));
		    text20.setPreferredSize(new Dimension(100,20));
		    text22.setPreferredSize(new Dimension(100,20));
		    

		    text1.setEditable(false);
		    text3.setEditable(false);
		    text5.setEditable(false);
		    text7.setEditable(false);
		    text9.setEditable(false);
		    text11.setEditable(false);
		    text13.setEditable(false);
		    text15.setEditable(false);
		    text17.setEditable(false);
		    text19.setEditable(false);
		    text21.setEditable(false);

		    text1.setText("titre");
    		text3.setText("cote Dewey");
    		text5.setText("nombre de copies");
    		text7.setText("valeur");
    	

		  
		  JFrame f=new JFrame();
		  JFrame remplissage = new JFrame();
		  JFrame remplissage1 = new JFrame();
		  JFrame remplissage2 = new JFrame();
		  JFrame remplissage3 = new JFrame();
		  JFrame remplissage4 = new JFrame();
		  JFrame remplissage5 = new JFrame();


		  JFrame ajouter=new JFrame();
		  JFrame supprimer=new JFrame();
		  JFrame modifier=new JFrame();
		  JFrame rechercher=new JFrame();
		  JFrame console=new JFrame();
		  JFrame ecrire=new JFrame();
		  
		  f.setLocationRelativeTo(null);
		  ajouter.setLocationRelativeTo(null);
		  supprimer.setLocationRelativeTo(null);
		  modifier.setLocationRelativeTo(null);
		  rechercher.setLocationRelativeTo(null);
		  console.setLocationRelativeTo(null);
		  ecrire.setLocationRelativeTo(null);
		 
		  

		  f.setVisible(true);
		  f.setTitle("Bibliotheque");
		  
		    JPanel pan = new JPanel();
		    JPanel pan2 = new JPanel();
		    JPanel ajout = new JPanel();
		    JPanel suppr = new JPanel();
		    JPanel mod = new JPanel();
		    JPanel visualiser = new JPanel();
		    JPanel cons = new JPanel();
		    JPanel ecr = new JPanel();
		    JPanel journ = new JPanel();
		    JPanel rev = new JPanel();
		    JPanel dvvd = new JPanel();
		    JPanel disque = new JPanel();
		    JPanel liv = new JPanel();
		    JPanel dico = new JPanel();

		    f.setSize(400,200);
		    f.setContentPane(pan);
		    
		    JButton a = new JButton("Ajouter");
		    JButton s = new JButton("Supprimer");
		    JButton m = new JButton("Modifier");
		    JButton r = new JButton("Rechercher/Visualiser");
		    JButton c = new JButton("Mode Console"); 
		    JButton e = new JButton("Ecrire");
		    JButton journal = new JButton("Journal");
		    JButton revue = new JButton("revue");
		    JButton dvd = new JButton("DVD");
		    JButton dc = new JButton("Disque Compact");
		    JButton livre= new JButton("Livre");
		    JButton dictionnaire = new JButton("Dictionnaire");
		    JButton journal1 = new JButton("Journal");
		    JButton revue1 = new JButton("revue");
		    JButton dvd1 = new JButton("DVD");
		    JButton dc1 = new JButton("Disque Compact");
		    JButton livre1= new JButton("Livre");
		    JButton dictionnaire1 = new JButton("Dictionnaire");
		    JButton journal2 = new JButton("Journal");
		    JButton revue2 = new JButton("revue");
		    JButton dvd2 = new JButton("DVD");
		    JButton dc2 = new JButton("Disque Compact");
		    JButton livre2= new JButton("Livre");
		    JButton dictionnaire2 = new JButton("Dictionnaire");
		    JButton journal3 = new JButton("Journal");
		    JButton revue3 = new JButton("revue");
		    JButton dvd3 = new JButton("DVD");
		    JButton dc3 = new JButton("Disque Compact");
		    JButton livre3= new JButton("Livre");
		    JButton dictionnaire3 = new JButton("Dictionnaire");
		    JButton journal4 = new JButton("Journal");
		    JButton revue4 = new JButton("revue");
		    JButton dvd4 = new JButton("DVD");
		    JButton dc4 = new JButton("Disque Compact");
		    JButton livre4= new JButton("Livre");
		    JButton dictionnaire4 = new JButton("Dictionnaire");
		    JButton journal5 = new JButton("Journal");
		    JButton revue5 = new JButton("revue");
		    JButton dvd5 = new JButton("DVD");
		    JButton dc5 = new JButton("Disque Compact");
		    JButton livre5= new JButton("Livre");
		    JButton dictionnaire5 = new JButton("Dictionnaire");
		    JButton valider= new JButton("Valider");
		    JButton valider1= new JButton("Valider");
		    JButton valider2= new JButton("Valider");
		    JButton valider3= new JButton("Valider");
		    JButton valider4= new JButton("Valider");
		    JButton valider5= new JButton("Valider");
		    JButton valider6= new JButton("Valider");
		    JButton valider7= new JButton("Valider");
		    JButton valider8= new JButton("Valider");
		    JButton valider9= new JButton("Valider");
		    JButton valider10= new JButton("Valider");
		    JButton valider11= new JButton("Valider");
		    JButton valider12= new JButton("Valider");
		    JButton valider13= new JButton("Valider");
		    JButton valider14= new JButton("Valider");
		    JButton valider15= new JButton("Valider");
		    JButton valider16= new JButton("Valider");
		    JButton valider17= new JButton("Valider");
		    JButton valider18= new JButton("Valider");
		    JButton valider19= new JButton("Valider");
		    JButton valider20= new JButton("Valider");
		    JButton valider21= new JButton("Valider");
		    JButton valider22= new JButton("Valider");
		    JButton valider23= new JButton("Valider");
		    JButton valider24= new JButton("Valider");
		    JButton valider25= new JButton("Valider");
		    JButton valider26= new JButton("Valider");
		    JButton valider27= new JButton("Valider");
		    JButton valider28= new JButton("Valider");
		    JButton valider29= new JButton("Valider");
		    JButton valider30= new JButton("Valider");
		    JButton valider31= new JButton("Valider");
		    JButton valider32= new JButton("Valider");
		    JButton valider33= new JButton("Valider");
		    JButton valider34= new JButton("Valider");
		    JButton valider35= new JButton("Valider");

		    JButton fermer= new JButton("FermerFenetre");
		    JButton quitter= new JButton("Quitter");

		    f.getContentPane().add(a);
		    f.getContentPane().add(s);
		    f.getContentPane().add(m);
		    f.getContentPane().add(r);
		    f.getContentPane().add(c);
		    f.getContentPane().add(e);
		    f.getContentPane().add(quitter);

		    quitter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				System.exit(0);
				}
					});

		    
		    a.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ajouter.setVisible(true);
				    ajouter.setTitle("Ajouter");
				    ajouter.setContentPane(ajout);
				    ajouter.setSize(400,200);
				    ajouter.getContentPane().add(journal);
				    ajouter.getContentPane().add(revue);
				    ajouter.getContentPane().add(dvd);
				    ajouter.getContentPane().add(dc);
				    ajouter.getContentPane().add(livre);
				    ajouter.getContentPane().add(dictionnaire);
				    ajouter.getContentPane().add(quitter);
				    ajouter.getContentPane().add(fermer);
				    fermer.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		ajouter.dispose();
				    		}
				    	});
		    	}});

				    journal.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage.setVisible(true);
				    		remplissage.setSize(400,200);
				    		remplissage.setContentPane(journ);
				    		text2.setText("");
				    		text4.setText("");
				    		text6.setText("");
				    		text8.setText("");
				    		text10.setText("");
				    		text12.setText("");
				    		text14.setText("");
				    		text16.setText("");
				    		text18.setText("");
				    		text20.setText("");
				    		text22.setText("");
				    		remplissage.add(text1);
				    		remplissage.add(text2);
				    		remplissage.add(text3);
				    		remplissage.add(text4);
				    		remplissage.add(text5);
				    		remplissage.add(text6);
				    		remplissage.add(text7);
				    		remplissage.add(text8);
				    		remplissage.add(text9);
				    		remplissage.add(text10);
				    		remplissage.add(text11);
				    		remplissage.add(text12);
				    		remplissage.add(text13);
				    		remplissage.add(text14);
				    	    remplissage.add(text15);
				    	    remplissage.add(text16);

				    		


				    		text9.setText("periodicite");
				    		text11.setText("numero de periode");
				    		text13.setText("issn");
				    		text15.setText("region");
				   
				    		remplissage.getContentPane().add(valider);
				    	
				    	    valider.addActionListener(new ActionListener() {
						    	public void actionPerformed(ActionEvent e) {
						    		unjournal.setTitre(text2.getText());
						    		unjournal.setCoteDewey(Integer.parseInt(text4.getText()));
						    		unjournal.setNbrCopies(Integer.parseInt(text6.getText()));
						    		unjournal.setValeur(Integer.parseInt(text8.getText()));
						    		unjournal.setPeriodicite(text10.getText());
						    		unjournal.setNumPeriode(text12.getText());
						    		unjournal.setIssn(text14.getText());
						    		unjournal.setRegion(text16.getText());
						    		liste.Ajouter(unjournal);
						    		JOptionPane.showMessageDialog(null, "Le journal a été ajouté");
						    		remplissage.dispose();
						    	}
				    	
				    });}});
				    revue.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage.setVisible(true);
				    		remplissage.setSize(400,200);
				    		remplissage.setContentPane(rev);
				    		text2.setText("");
				    		text4.setText("");
				    		text6.setText("");
				    		text8.setText("");
				    		text10.setText("");
				    		text12.setText("");
				    		text14.setText("");
				    		text16.setText("");
				    		text18.setText("");
				    		text20.setText("");
				    		text22.setText("");
				    		
				    		remplissage.add(text1);
				    		remplissage.add(text2);
				    		remplissage.add(text3);
				    		remplissage.add(text4);
				    		remplissage.add(text5);
				    		remplissage.add(text6);
				    		remplissage.add(text7);
				    		remplissage.add(text8);
				    		remplissage.add(text9);
				    		remplissage.add(text10);
				    
	

				    		
				    		text9.setText("sujet");

				    		remplissage.getContentPane().add(valider1);
				    	    valider1.addActionListener(new ActionListener() {
						    	public void actionPerformed(ActionEvent e) {
						    		unerevue.setTitre(text2.getText());
						    		unerevue.setCoteDewey(Integer.parseInt(text4.getText()));
						    		unerevue.setNbrCopies(Integer.parseInt(text6.getText()));
						    		unerevue.setValeur(Integer.parseInt(text8.getText()));
						    		unerevue.setPeriodicite(text10.getText());
						    	
						    		liste.Ajouter(unerevue);
						    		JOptionPane.showMessageDialog(null, "La revue a été ajoutée");
						    		remplissage.dispose();
						    	}
				    	});
				    	}});
				    dvd.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage.setVisible(true);
				    		remplissage.setSize(400,200);
				    		remplissage.setContentPane(dvvd);
				    		text2.setText("");
				    		text4.setText("");
				    		text6.setText("");
				    		text8.setText("");
				    		text10.setText("");
				    		text12.setText("");
				    		text14.setText("");
				    		text16.setText("");
				    		text18.setText("");
				    		text20.setText("");
				    		text22.setText("");
				    		
				    		remplissage.add(text1);
				    		remplissage.add(text2);
				    		remplissage.add(text3);
				    		remplissage.add(text4);
				    		remplissage.add(text5);
				    		remplissage.add(text6);
				    		remplissage.add(text7);
				    		remplissage.add(text8);
				    		remplissage.add(text9);
				    		remplissage.add(text10);
				    		remplissage.add(text11);
				    		remplissage.add(text12);
				    		remplissage.add(text13);
				    		remplissage.add(text14);
				    	    remplissage.add(text15);
				    	    remplissage.add(text16);
		
				    		
				    		text9.setText("sujet");
				    		text11.setText("duree");
				    		text13.setText("isbn");
				    		text15.setText("cineaste");

				    		

				    		remplissage.getContentPane().add(valider2);
				    	    valider2.addActionListener(new ActionListener() {
						    	public void actionPerformed(ActionEvent e) {
						    		undvd.setTitre(text2.getText());
						    		undvd.setCoteDewey(Integer.parseInt(text4.getText()));
						    		undvd.setNbrCopies(Integer.parseInt(text6.getText()));
						    		undvd.setValeur(Integer.parseInt(text8.getText()));
						    		undvd.setSujet(text10.getText());
						    		undvd.setDuree(Integer.parseInt(text12.getText()));
						    		undvd.setIsbn(text14.getText());
						    		undvd.setCineaste(text16.getText());
						    		liste.Ajouter(undvd);
						    		JOptionPane.showMessageDialog(null, "Le dvd a été ajouté");
						    		remplissage.dispose();
						    	}
				    	});
				    	}});
				    	
				    dc.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage.setVisible(true);
				    		remplissage.setSize(400,200);
				    		remplissage.setContentPane(disque);
				    		text2.setText("");
				    		text4.setText("");
				    		text6.setText("");
				    		text8.setText("");
				    		text10.setText("");
				    		text12.setText("");
				    		text14.setText("");
				    		text16.setText("");
				    		text18.setText("");
				    		text20.setText("");
				    		text22.setText("");
				    		
				    		remplissage.add(text1);
				    		remplissage.add(text2);
				    		remplissage.add(text3);
				    		remplissage.add(text4);
				    		remplissage.add(text5);
				    		remplissage.add(text6);
				    		remplissage.add(text7);
				    		remplissage.add(text8);
				    		remplissage.add(text9);
				    		remplissage.add(text10);
				    		remplissage.add(text11);
				    		remplissage.add(text12);
				    		remplissage.add(text13);
				    		remplissage.add(text14);
				    	    remplissage.add(text15);
				    	    remplissage.add(text16);
				    	    remplissage.add(text17);
				    		remplissage.add(text18);
				    	    remplissage.add(text19);
				    	    remplissage.add(text20);

				    		
				    		text9.setText("sujet");
				    		text11.setText("duree");
				    		text13.setText("isbn");
				    		text15.setText("auteur");
				    		text17.setText("groupe");
				    		text19.setText("nombre de piste");

				    		

				    		remplissage.getContentPane().add(valider3);
				    	    valider3.addActionListener(new ActionListener() {
						    	public void actionPerformed(ActionEvent e) {
						    		undisque.setTitre(text2.getText());
						    		undisque.setCoteDewey(Integer.parseInt(text4.getText()));
						    		undisque.setNbrCopies(Integer.parseInt(text6.getText()));
						    		undisque.setValeur(Integer.parseInt(text8.getText()));
						    		undisque.setSujet(text10.getText());
						    		undisque.setDuree(Integer.parseInt(text12.getText()));
						    		undisque.setIsbn(text14.getText());
						    		undisque.setAuteur(text16.getText());
						    		undisque.setGroupe(text18.getText());
						    		undisque.setNbrPistes(Integer.parseInt(text20.getText()));


						    		liste.Ajouter(undisque);
						    		JOptionPane.showMessageDialog(null, "Le disque compact a été ajouté");
						    		remplissage.dispose();
						    	}
				    	});
				    	}});
				
				    livre.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		
				    		remplissage.setVisible(true);
				    		remplissage.setSize(400,200);
				    		remplissage.setContentPane(liv);
				    		text2.setText("");
				    		text4.setText("");
				    		text6.setText("");
				    		text8.setText("");
				    		text10.setText("");
				    		text12.setText("");
				    		text14.setText("");
				    		text16.setText("");
				    		text18.setText("");
				    		text20.setText("");
				    		text22.setText("");
				    		
				    		remplissage.add(text1);
				    		remplissage.add(text2);
				    		remplissage.add(text3);
				    		remplissage.add(text4);
				    		remplissage.add(text5);
				    		remplissage.add(text6);
				    		remplissage.add(text7);
				    		remplissage.add(text8);
				    		remplissage.add(text9);
				    		remplissage.add(text10);
				    		remplissage.add(text11);
				    		remplissage.add(text12);
				    		remplissage.add(text13);
				    		remplissage.add(text14);
				    	    remplissage.add(text15);
				    	    remplissage.add(text16);
				    	    remplissage.add(text17);
				    		remplissage.add(text18);
				    	    remplissage.add(text19);
				    	    remplissage.add(text20);

				    		
				    		text9.setText("Editeur");
				    		text11.setText("isbn");
				    		text13.setText("Categorie");
				    		text15.setText("Collection");
				    		text17.setText("auteur");
				    		text19.setText("nombre de pages");


				    		

				    		remplissage.getContentPane().add(valider4);
				    	    valider4.addActionListener(new ActionListener() {
						    	public void actionPerformed(ActionEvent e) {
						    		unlivre.setTitre(text2.getText());
						    		unlivre.setCoteDewey(Integer.parseInt(text4.getText()));
						    		unlivre.setNbrCopies(Integer.parseInt(text6.getText()));
						    		unlivre.setValeur(Integer.parseInt(text8.getText()));
						    		unlivre.setEditeur(text10.getText());
						    		unlivre.setIsbn(text12.getText());
						    		unlivre.setCategorie(text14.getText());
						    		unlivre.setCollection(text16.getText());
						    		unlivre.setAuteur(text18.getText());
						    		unlivre.setNbrPages(Integer.parseInt(text20.getText()));


						    		liste.Ajouter(unlivre);
						    		JOptionPane.showMessageDialog(null, "Le livre a été ajouté");
						    		remplissage.dispose();
						    	}
				    	});
				    	}});
				    dictionnaire.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage.setVisible(true);
				    		remplissage.setSize(400,200);
				    		remplissage.setContentPane(dico);
				    		text2.setText("");
				    		text4.setText("");
				    		text6.setText("");
				    		text8.setText("");
				    		text10.setText("");
				    		text12.setText("");
				    		text14.setText("");
				    		text16.setText("");
				    		text18.setText("");
				    		text20.setText("");
				    		text22.setText("");
				    		
				    		remplissage.add(text1);
				    		remplissage.add(text2);
				    		remplissage.add(text3);
				    		remplissage.add(text4);
				    		remplissage.add(text5);
				    		remplissage.add(text6);
				    		remplissage.add(text7);
				    		remplissage.add(text8);
				    		remplissage.add(text9);
				    		remplissage.add(text10);
				    		remplissage.add(text11);
				    		remplissage.add(text12);
				    		remplissage.add(text13);
				    		remplissage.add(text14);
				   

				    		
				    		text9.setText("Editeur");
				    		text11.setText("isbn");
				    		text13.setText("Type");
				    	;


				    		

				    		remplissage.getContentPane().add(valider5);
				    	    valider5.addActionListener(new ActionListener() {
						    	public void actionPerformed(ActionEvent e) {
						    		unDictionnaire.setTitre(text2.getText());
						    		unDictionnaire.setCoteDewey(Integer.parseInt(text4.getText()));
						    		unDictionnaire.setNbrCopies(Integer.parseInt(text6.getText()));
						    		unDictionnaire.setValeur(Integer.parseInt(text8.getText()));
						    		unDictionnaire.setEditeur(text10.getText());
						    		unDictionnaire.setIsbn(text12.getText());
						    		unDictionnaire.setType(text14.getText());
				

						    		liste.Ajouter(unDictionnaire);
						    		JOptionPane.showMessageDialog(null, "Le dictionnaire a été ajouté");
						    		remplissage.dispose();
						    	}
				    	});
				   

				}
		    	
		 
				;
	  });
		    
		    s.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					supprimer.setVisible(true);
					supprimer.setTitle("Supprimer");
					supprimer.setContentPane(suppr);
					supprimer.setSize(400,200);
					supprimer.getContentPane().add(journal1);
					supprimer.getContentPane().add(revue1);
					supprimer.getContentPane().add(dvd1);
					supprimer.getContentPane().add(dc1);
					supprimer.getContentPane().add(livre1);
					supprimer.getContentPane().add(dictionnaire1);
					supprimer.getContentPane().add(fermer);

		    		 fermer.addActionListener(new ActionListener() {
					    	public void actionPerformed(ActionEvent e) {
					    		supprimer.dispose();
					    	}
		    		 });
				} });

					journal1.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage1.setVisible(true);
				    		remplissage1.setSize(400,200);
				    		remplissage1.setContentPane(pan2);
				    		
				    		remplissage1.add(text21);
				    		remplissage1.add(text22);
				    		text21.setText("position");
				    		remplissage1.getContentPane().add(valider6);


				    		 valider6.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    		liste.Supprimer(Integer.parseInt(text22.getText()));
							    		JOptionPane.showMessageDialog(null, "Le journal a éte supprimé");
							    		remplissage1.dispose();
							    	}
					    	});
					    	}});
				    
					revue1.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage1.setVisible(true);
				    		remplissage1.setSize(400,200);
				    		remplissage1.setContentPane(pan2);
				    		
				    		remplissage1.add(text21);
				    		remplissage1.add(text22);
				    		text21.setText("position");
				    		remplissage1.getContentPane().add(valider7);

				    		 valider7.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    		liste.Supprimer(Integer.parseInt(text22.getText()));
							    		JOptionPane.showMessageDialog(null, "La revue a éte supprimé");
							    		remplissage1.dispose();
							    	}
					    	});
					    	}});
					dvd1.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage1.setVisible(true);
				    		remplissage1.setSize(400,200);
				    		remplissage1.setContentPane(pan2);
				    		
				    		remplissage1.add(text21);
				    		remplissage1.add(text22);
				    		text21.setText("position");
				    		remplissage1.getContentPane().add(valider8);

				    		 valider8.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    		liste.Supprimer(Integer.parseInt(text22.getText()));
							    		JOptionPane.showMessageDialog(null, "Le dvd a éte supprimé");
							    		remplissage1.dispose();
							    	}
					    	});
					    	}});
					dc1.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage1.setVisible(true);
				    		remplissage1.setSize(400,200);
				    		remplissage1.setContentPane(pan2);
				    		
				    		remplissage1.add(text21);
				    		remplissage1.add(text22);
				    		text21.setText("position");
				    		remplissage1.getContentPane().add(valider9);

				    		 valider9.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    		liste.Supprimer(Integer.parseInt(text22.getText()));
							    		JOptionPane.showMessageDialog(null, "Le disque compact a éte supprimé");
							    		remplissage1.dispose();
							    	}
					    	});
					    	}});
					livre1.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage1.setVisible(true);
				    		remplissage1.setSize(400,200);
				    		remplissage1.setContentPane(pan2);
				    		
				    		remplissage1.add(text21);
				    		remplissage1.add(text22);
				    		text21.setText("position");
				    		remplissage1.getContentPane().add(valider10);

				    		 valider10.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    		liste.Supprimer(Integer.parseInt(text22.getText()));
							    		JOptionPane.showMessageDialog(null, "Le livre a éte supprimé");
							    		remplissage1.dispose();
							    	}
					    	});
					    	}});
					
					dictionnaire1.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage1.setVisible(true);
				    		remplissage1.setSize(400,200);
				    		remplissage1.setContentPane(pan2);
				    		
				    		remplissage1.add(text21);
				    		remplissage1.add(text22);
				    		text21.setText("position");
				    		remplissage1.getContentPane().add(valider11);

				    		 valider11.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    		liste.Supprimer(Integer.parseInt(text22.getText()));
							    		JOptionPane.showMessageDialog(null, "Le dictionnaire a éte supprimé");
							    		remplissage1.dispose();
							    	}
					    	});
					    	}});
				
				

		    
		    m.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		modifier.setVisible(true);
		    		modifier.setTitle("Modifier");
		    		modifier.setContentPane(mod);
		    		modifier.setSize(400,200);
		    		text2.setText("");
		    		text4.setText("");
		    		text6.setText("");
		    		text8.setText("");
		    		text10.setText("");
		    		text12.setText("");
		    		text14.setText("");
		    		text16.setText("");
		    		text18.setText("");
		    		text20.setText("");
		    		text22.setText("");
		    		modifier.getContentPane().add(journal2);
		    		modifier.getContentPane().add(revue2);
		    		modifier.getContentPane().add(dvd2);
		    		modifier.getContentPane().add(dc2);
		    		modifier.getContentPane().add(livre2);
		    		modifier.getContentPane().add(dictionnaire2);
		    		modifier.getContentPane().add(quitter);
		    		modifier.getContentPane().add(fermer);
		    	

				    fermer.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		modifier.dispose();
				    		}
				    	});
		    	}});
				    journal2.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage2.setVisible(true);
				    		remplissage2.setSize(400,200);
				    		remplissage2.setContentPane(rev);
				    		text2.setText("");
				    		text4.setText("");
				    		text6.setText("");
				    		text8.setText("");
				    		text10.setText("");
				    		text12.setText("");
				    		text14.setText("");
				    		text16.setText("");
				    		text18.setText("");
				    		text20.setText("");
				    		text22.setText("");
				    		remplissage2.add(text21);
				    		remplissage2.add(text22);
				    		remplissage2.add(text1);
				    		remplissage2.add(text2);
				    		remplissage2.add(text3);
				    		remplissage2.add(text4);
				    		remplissage2.add(text5);
				    		remplissage2.add(text6);
				    		remplissage2.add(text7);
				    		remplissage2.add(text8);
				    		remplissage2.add(text9);
				    		remplissage2.add(text10);
				    		remplissage2.add(text11);
				    		remplissage2.add(text12);
				    		remplissage2.add(text13);
				    		remplissage2.add(text14);
				    	    remplissage2.add(text15);
				    	    remplissage2.add(text16);

				    		


				    	    text9.setText("periodicite");
				    		text11.setText("numero de periode");
				    		text13.setText("issn");
				    		text15.setText("region");
				    		text21.setText("position a supprimer");

				    		
				    		
				    	
				    		remplissage2.getContentPane().add(valider12);


				    		 valider12.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    	liste.Supprimer(Integer.parseInt(text22.getText()));
						    		unjournal.setTitre(text2.getText());
						    		unjournal.setCoteDewey(Integer.parseInt(text4.getText()));
						    		unjournal.setNbrCopies(Integer.parseInt(text6.getText()));
						    		unjournal.setValeur(Integer.parseInt(text8.getText()));
						    		unjournal.setPeriodicite(text10.getText());
						    		unjournal.setNumPeriode(text12.getText());
						    		unjournal.setIssn(text14.getText());
						    		unjournal.setRegion(text16.getText());
						    		liste.Modifier(unjournal,Integer.parseInt(text22.getText()));
						    		JOptionPane.showMessageDialog(null, "Le journal a été modifié");
						    		remplissage2.dispose();
						    	}
				    	
				    });}});
				    
				    revue2.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage2.setVisible(true);
				    		remplissage2.setSize(400,200);
				    		remplissage2.setContentPane(rev);
				    		text2.setText("");
				    		text4.setText("");
				    		text6.setText("");
				    		text8.setText("");
				    		text10.setText("");
				    		text12.setText("");
				    		text14.setText("");
				    		text16.setText("");
				    		text18.setText("");
				    		text20.setText("");
				    		text22.setText("");
				    		remplissage2.add(text21);
				    		remplissage2.add(text22);
				    		remplissage2.add(text1);
				    		remplissage2.add(text2);
				    		remplissage2.add(text3);
				    		remplissage2.add(text4);
				    		remplissage2.add(text5);
				    		remplissage2.add(text6);
				    		remplissage2.add(text7);
				    		remplissage2.add(text8);
				    		remplissage2.add(text9);
				    		remplissage2.add(text10);
				    		remplissage2.add(text11);
				    		remplissage2.add(text12);
				    		remplissage2.add(text13);
				    		remplissage2.add(text14);
				    	    remplissage2.add(text15);
				    	    remplissage2.add(text16);

				    		

				    		text21.setText("position a supprimer");
				    	    text9.setText("periodicite");
				    		text11.setText("numero de periode");
				    		text13.setText("issn");
				    		text15.setText("sujet");
				
				    		
				    		
				    		remplissage2.getContentPane().add(valider13);


				    		 valider13.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    	liste.Supprimer(Integer.parseInt(text22.getText()));
						    		unerevue.setTitre(text2.getText());
						    		unerevue.setCoteDewey(Integer.parseInt(text4.getText()));
						    		unerevue.setNbrCopies(Integer.parseInt(text6.getText()));
						    		unerevue.setValeur(Integer.parseInt(text8.getText()));
						    		unerevue.setPeriodicite(text10.getText());
						    		unerevue.setNumPeriode(text12.getText());
						    		unerevue.setIssn(text14.getText());
						    		unerevue.setSujet(text16.getText());
						    		liste.Modifier(unerevue,Integer.parseInt(text22.getText()));
						    		JOptionPane.showMessageDialog(null, "La revue a été modifié");
						    		remplissage2.dispose();
						    	}
				    	
				    });}});
				    dvd2.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage2.setVisible(true);
				    		remplissage2.setSize(400,200);
				    		remplissage2.setContentPane(dvvd);
				    		text2.setText("");
				    		text4.setText("");
				    		text6.setText("");
				    		text8.setText("");
				    		text10.setText("");
				    		text12.setText("");
				    		text14.setText("");
				    		text16.setText("");
				    		text18.setText("");
				    		text20.setText("");
				    		text22.setText("");
				    		remplissage2.add(text21);
				    		remplissage2.add(text22);
				    		remplissage2.add(text1);
				    		remplissage2.add(text2);
				    		remplissage2.add(text3);
				    		remplissage2.add(text4);
				    		remplissage2.add(text5);
				    		remplissage2.add(text6);
				    		remplissage2.add(text7);
				    		remplissage2.add(text8);
				    		remplissage2.add(text9);
				    		remplissage2.add(text10);
				    

				    		

				    		text21.setText("position a supprimer");
				    	    text9.setText("cineaste");
				    
				
				    		
				    		
				    		remplissage2.getContentPane().add(valider14);


				    		 valider14.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    	liste.Supprimer(Integer.parseInt(text22.getText()));
						    		undvd.setTitre(text2.getText());
						    		undvd.setCoteDewey(Integer.parseInt(text4.getText()));
						    		undvd.setNbrCopies(Integer.parseInt(text6.getText()));
						    		undvd.setValeur(Integer.parseInt(text8.getText()));
						    		undvd.setCineaste(text10.getText());

						    		liste.Modifier(undvd,Integer.parseInt(text22.getText()));
						    		JOptionPane.showMessageDialog(null, "Le dvd a été modifié");
						    		remplissage2.dispose();
						    	}
				    	
				    });}});
				    dc2.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage2.setVisible(true);
				    		remplissage2.setSize(400,200);
				    		remplissage2.setContentPane(dvvd);
				    		text2.setText("");
				    		text4.setText("");
				    		text6.setText("");
				    		text8.setText("");
				    		text10.setText("");
				    		text12.setText("");
				    		text14.setText("");
				    		text16.setText("");
				    		text18.setText("");
				    		text20.setText("");
				    		text22.setText("");
				    		remplissage2.add(text21);
				    		remplissage2.add(text22);
				    		remplissage2.add(text1);
				    		remplissage2.add(text2);
				    		remplissage2.add(text3);
				    		remplissage2.add(text4);
				    		remplissage2.add(text5);
				    		remplissage2.add(text6);
				    		remplissage2.add(text7);
				    		remplissage2.add(text8);
				    		remplissage2.add(text9);
				    		remplissage2.add(text10);
				    		remplissage2.add(text11);
				    		remplissage2.add(text12);
				    		remplissage2.add(text13);
				    		remplissage2.add(text14);
				    

				    		

				    		text21.setText("position a supprimer");
				    	    text9.setText("auteur");
				    	    text11.setText("groupe");
				    	    text13.setText("Nombre de piste");

				    
				
				    		
				    		
				    		remplissage2.getContentPane().add(valider15);


				    		 valider15.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    	liste.Supprimer(Integer.parseInt(text22.getText()));
						    		undisque.setTitre(text2.getText());
						    		undisque.setCoteDewey(Integer.parseInt(text4.getText()));
						    		undisque.setNbrCopies(Integer.parseInt(text6.getText()));
						    		undisque.setValeur(Integer.parseInt(text8.getText()));
						    		undisque.setAuteur(text10.getText());
						    		undisque.setGroupe(text12.getText());
						    		undisque.setNbrPistes(Integer.parseInt(text14.getText()));



						    		liste.Modifier(undisque,Integer.parseInt(text22.getText()));
						    		JOptionPane.showMessageDialog(null, "Le disque compact a été modifié");
						    		remplissage2.dispose();
						    	}
				    	
				    });}});
				    dictionnaire2.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage2.setVisible(true);
				    		remplissage2.setSize(400,200);
				    		remplissage2.setContentPane(dvvd);
				    		text2.setText("");
				    		text4.setText("");
				    		text6.setText("");
				    		text8.setText("");
				    		text10.setText("");
				    		text12.setText("");
				    		text14.setText("");
				    		text16.setText("");
				    		text18.setText("");
				    		text20.setText("");
				    		text22.setText("");
				    		remplissage2.add(text21);
				    		remplissage2.add(text22);
				    		remplissage2.add(text1);
				    		remplissage2.add(text2);
				    		remplissage2.add(text3);
				    		remplissage2.add(text4);
				    		remplissage2.add(text5);
				    		remplissage2.add(text6);
				    		remplissage2.add(text7);
				    		remplissage2.add(text8);
				    		remplissage2.add(text9);
				    		remplissage2.add(text10);
				    		remplissage2.add(text11);
				    		remplissage2.add(text12);
				    		remplissage2.add(text13);
				    		remplissage2.add(text14);
				    

				    		

				    		text21.setText("position a supprimer");
				    	    text9.setText("isbn");
				    	    text11.setText("editeur");
				    	    text13.setText("type");

				    
				
				    		
				    		
				    		remplissage2.getContentPane().add(valider16);


				    		 valider16.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    	liste.Supprimer(Integer.parseInt(text22.getText()));
						    		undisque.setTitre(text2.getText());
						    		undisque.setCoteDewey(Integer.parseInt(text4.getText()));
						    		undisque.setNbrCopies(Integer.parseInt(text6.getText()));
						    		undisque.setValeur(Integer.parseInt(text8.getText()));
						    		undisque.setAuteur(text10.getText());
						    		undisque.setGroupe(text12.getText());
						    		undisque.setNbrPistes(Integer.parseInt(text14.getText()));



						    		liste.Modifier(unDictionnaire,Integer.parseInt(text22.getText()));
						    		JOptionPane.showMessageDialog(null, "Le dictionnaire a été modifié");
						    		remplissage2.dispose();
						    	}
				    	
				    });}});
				    livre2.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		remplissage2.setVisible(true);
				    		remplissage2.setSize(400,200);
				    		remplissage2.setContentPane(dvvd);
				    		text2.setText("");
				    		text4.setText("");
				    		text6.setText("");
				    		text8.setText("");
				    		text10.setText("");
				    		text12.setText("");
				    		text14.setText("");
				    		text16.setText("");
				    		text18.setText("");
				    		text20.setText("");
				    		text22.setText("");

				    		remplissage2.add(text21);
				    		remplissage2.add(text22);
				    		
				    		remplissage2.add(text1);
				    		remplissage2.add(text2);
				    		remplissage2.add(text3);
				    		remplissage2.add(text4);
				    		remplissage2.add(text5);
				    		remplissage2.add(text6);
				    		remplissage2.add(text7);
				    		remplissage2.add(text8);
				    		remplissage2.add(text9);
				    		remplissage2.add(text10);
				    		remplissage2.add(text11);
				    		remplissage2.add(text12);
				    		remplissage2.add(text13);
				    		remplissage2.add(text14);
				    		remplissage2.add(text15);
				    		remplissage2.add(text16);
				    		remplissage2.add(text17);
				    		remplissage2.add(text18);
				    		remplissage2.add(text19);
				    		remplissage2.add(text20);

				    		

				    		

				    		text21.setText("position a supprimer");
				    	    text9.setText("isbn");
				    	    text11.setText("editeur");
				    	    text13.setText("categorie");
				    	    text15.setText("collection");
				    	    text17.setText("auteur");
				    	    text19.setText("nombre de pages");


				    
				
				    		
				    		
				    		remplissage2.getContentPane().add(valider17);
				    		

				    		 valider17.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    	
							    	liste.Supprimer(Integer.parseInt(text22.getText()));
						    		unlivre.setTitre(text2.getText());
						    		unlivre.setCoteDewey(Integer.parseInt(text4.getText()));
						    		unlivre.setNbrCopies(Integer.parseInt(text6.getText()));
						    		unlivre.setValeur(Integer.parseInt(text8.getText()));
						    		unlivre.setIsbn(text10.getText());
						    		unlivre.setEditeur(text12.getText());
						    		unlivre.setCategorie(text14.getText());
						    		unlivre.setCollection(text16.getText());
						    		unlivre.setAuteur(text18.getText());
						    		unlivre.setNbrPages(Integer.parseInt(text20.getText()));
						    	

						    		

						    		liste.Modifier(unlivre,Integer.parseInt(text22.getText()));
						    		JOptionPane.showMessageDialog(null, "Le livre a été modifié");
						    		remplissage2.dispose();
						    	}
				    	
				    });}});
				    
				    r.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
								rechercher.setVisible(true);
								rechercher.setTitle("Rechercher et Visualiser");
								rechercher.setContentPane(visualiser);
								rechercher.setSize(400,200);
								rechercher.getContentPane().add(journal3);
								rechercher.getContentPane().add(revue3);
								rechercher.getContentPane().add(dvd3);
								rechercher.getContentPane().add(dc3);
								rechercher.getContentPane().add(livre3);
								rechercher.getContentPane().add(dictionnaire3);
								rechercher.getContentPane().add(fermer);

					    		 fermer.addActionListener(new ActionListener() {
								    	public void actionPerformed(ActionEvent e) {
								    		rechercher.dispose();
								    	}
					    		 });
						}});
				    	
				    journal3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							remplissage3.setVisible(true);
							remplissage3.setContentPane(pan2);
							remplissage3.setSize(400,200);
							text10.setText(null);
							remplissage3.add(text9);
				    		remplissage3.add(text10);
				    		text9.setText("Titre");
				    		remplissage3.getContentPane().add(valider18);


				    		 valider18.addActionListener(new ActionListener() {
							    	public void actionPerformed(ActionEvent e) {
							    	liste.Rechercher(unjournal, text22.getText());							    	
						    		remplissage3.dispose();

							    	}});
							
						}});
		    	}
		    	}
	  
	  

	  
	  
	  
	  
