package Main;

import java.util.*;
import java.io.*;

import Utilitaire.*;
import Fenetre.*;

public class Generateur
{
	public static ArrayList<Projet> alProjet;
	private static Fenetre fenetre;
	private static Generator generator;
	
	public Generateur()
	{
		alProjet = new ArrayList<Projet>();
		
		lireFichier();
		fenetre = new Fenetre();
		generator = new Generator();
	}
	
	private void lireFichier() 
	{
		String nomFichier = System.getProperty("user.dir");
		// on ajoute le chemin + le nom du fichier de traces
        nomFichier += "/donnees/ListeProjet.txt";
        
        BufferedReader fichier = null;
        String ligne = null;

        try 
        { 
        	// ouverture
            fichier = new BufferedReader(
                new FileReader(nomFichier));
            
            // traitement
            while ((ligne = fichier.readLine()) != null)
                traiteLigne(ligne);
            
            // fermeture
            fichier.close();
        } 
        catch(Exception exc) 
        {
            System.out.println("Erreur fichier" + exc);
        }

	}
	
	private void traiteLigne(String ligne)
	{
		// TODO Auto-generated method stub
		String[] tabChamp = ligne.split(",");

		Projet p = new Projet(tabChamp[0]);
		for (int i = 1; i < tabChamp.length; i++)
		{
			p.ajouterFichier(tabChamp[i]);
		}
		
		alProjet.add(p);
	}

	public static void CreerUnProjet(String titre)
	{
		Projet p = new Projet(titre);
		alProjet.add(p);
		//fenetre.modifierArbre();
	}
	
	public static void ajouterPage()
	{
		// TODO Auto-generated method stub
		fenetre.ajouterPage();
	}
	
	public static void CreerPage(String titre, String auteur, String[] SousTitre, String[] paragraphe)
	{
		generator.GenererCodeXML(titre, auteur);
		generator.creerFichier();
	}
	
	public static void main(String[] argv)
	{
		new Generateur();
	}
}
