package Utilitaire;

import java.io.*;

public class Generator
{
	private File file;
	private String xmlCode;
	
	public Generator()
	{
		file = new File("site.xml");
		try
		{
			file.createNewFile();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		xmlCode = "";
	}
	
	private void header() 
	{
		xmlCode += "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n";
		dtd();
		xmlCode += "<?xml-stylesheet type=\"text/xsl\" href=\"site.xsl\" ?>\n\n" +
				"<site>\n" +
				"\t<page ";
	}
	
	private void dtd() 
	{
		xmlCode +=
		"<!DOCTYPE site [\n" +
			"\t<!ELEMENT site (page+)>\n" +
				"\t\t<!ELEMENT page(contenu) >\n" +
					"\t\t\t<!ATTLIST page titre CDATA #REQUIRED " +
								 "auteur CDATA #IMPLIED " + 
								 "date CDATA #IMPLIED >\n" +
					"\t\t\t<!ELEMENT contenu (sous-titre+, paragraphe+)>\n " +
						"\t\t\t\t<!ELEMENT sous-titre (#PCDATA) >\n" +
						"\t\t\t\t<!ELEMENT paragraphe(#PCDATA) >\n" +
		"]>\n\n";
	}
	
	public void ajouterTitre(String titre)		{	xmlCode += "titre='" 	+ titre 	+ "' ";		}	
	public void ajouterAuteur(String auteur)	{	xmlCode += "auteur='" 	+ auteur 	+ "' ";		}
	public void ajouterDate(String date)		{	xmlCode += "date='" 	+ date 		+ "' ";		}
	
	public void finBalisePage()
	{
		xmlCode += ">\n" + 
					"\t\t<contenu>\n";
	}
	
	public void footer()
	{
		xmlCode += "\t\t</contenu>\n" +
				"\t</page>\n" +
				"</site>";
	}
	
	public void GenererCodeXML(String titre, String auteur, String date)
	{
		header();
		if (titre != null)
			ajouterTitre(titre);
		if (auteur != null)
			ajouterAuteur(auteur);
		if (date != null)
			ajouterDate(date);
		finBalisePage();
		
		
		footer();
	}
	
	public void creerFichier()
	{		
		try {
			BufferedWriter fichier = new BufferedWriter(new FileWriter(file));
			fichier.write(xmlCode);
			
			fichier.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*public String code()
	{
		return "<?xml-stylesheet type=\"text/xsl\" href=\"site.xsl\" ?>\n\n" +
		"<site>\n" +
			"\t<page titre=... auteur=... date=... >\n" +
				"\t\t<contenu>\n" +
					"\t\t\t<sous-titre>chapitre 1 : ...</sous-titre>\n" +
					"\t\t\t<paragraphe>Lorem ipsum...</paragraphe>\n" +
					"\t\t\t<sous-titre>chapitre 2 : ...</sous-titre>\n" +
					"\t\t\t<paragraphe>Lorem ipsum...</paragraphe>\n" +
				"\t\t</contenu>\n" +
			"\t</page>\n" +
		"</site>";
	}*/
	
	public String toString()
	{
		return xmlCode;
	}
	
	public static void main(String [] args)
	{		
		Generator g = new Generator();
		
		System.out.println(g.toString());
		g.creerFichier();
	}
}