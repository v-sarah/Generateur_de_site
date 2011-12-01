package Main;


import java.util.*;

import Fenetre.CreationProjet;
import Fenetre.*;

public class Generateur
{
	private HashMap<String, ArrayList<Projet>> hmProjet;
	private Fenetre fenetre;
	
	public Generateur()
	{
		fenetre = new Fenetre();
		hmProjet = new HashMap<String, ArrayList<Projet>>();
		
		lireFichier();
	}
	
	private void lireFichier() 
	{

	}
	
	public static void CreerUnProjet(String titre)
	{
		Projet p = new Projet(titre);
		
	}
	
	public static void main(String[] argv)
	{
		new Generateur();
	}
}
