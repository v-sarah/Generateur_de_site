package Utilitaire;

import java.io.*;

public class Generator
{
	private String xmlCode;
	
	public Generator()
	{
		xmlCode = header();
		xmlCode += dtd();
		xmlCode += code();
	}
	
	public String header() 
	{
		return "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n";
	}
	
	public String dtd() 
	{
		return "" +
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

	public String code()
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
	}
	
	public String toString()
	{
		return xmlCode;
	}
	
	public static void main(String [] args)
	{
		File file = new File("site.xml");
		
		FileWriter fw;
		FileReader fr;
		
		Generator g = new Generator();
		
		try {
			fw = new FileWriter(file);
			
			fw.write(g.toString());
			
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}