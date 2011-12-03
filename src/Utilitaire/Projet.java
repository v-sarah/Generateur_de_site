package Utilitaire;

import java.io.*;
import java.util.*;


public class Projet
{
	private String titre;
	private ArrayList<File> alF;
	
	public Projet(String titre)
	{
		this.titre = titre;
		alF = new ArrayList<File>();
	}
	
	/*
	 * Accesseur
	 */
	public String getTitre()		{	return titre;	}
	public ArrayList<File> getAlF()	{	return alF;		}
	
	/*
	 * Modificateur
	 */
	public void setAlF(ArrayList<File> alF)	{	this.alF = alF;		}
	public void setTitre(String titre)		{	this.titre = titre;	}

	public void ajouterFichier(String nomFichier)
	{
		// TODO Auto-generated method stub
		alF.add(new File(nomFichier));
	}
	
	public void supprimerFichier(String nom)
	{
		int i = 0;
		for (File f : alF)
		{
			if (f.getName().equals(nom))
				alF.remove(i);
			
			i++;
		}
	}
}
