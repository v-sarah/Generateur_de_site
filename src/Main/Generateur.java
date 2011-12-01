package Main;

import java.util.*;
import Utilitaire.*;
import Fenetre.*;

public class Generateur
{
	private ArrayList<Projet> alProjet;
	private Fenetre fenetre;
	
	public Generateur()
	{
		fenetre = new Fenetre();
		alProjet = new ArrayList<Projet>();
		
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
