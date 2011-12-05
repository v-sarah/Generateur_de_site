package Fenetre;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame
{
	private FenetreMenu menu;
	private FenetreArbre arbre;
	private FenetrePage fp;
	
	public Fenetre()
	{
		setTitle("Generateur de site");
		setSize(1024, 700);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		menu = new FenetreMenu();
		menu.addMenuInFrame(this);
		
		//arbre = new FenetreArbre();
		
		//add(arbre);
		
		
		// permet l'action de la croix rouge
		addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e) 
            {
                System.exit(0);
            }
        });

		setVisible(true);
	}

	public void ajouterPage()
	{
		// TODO Auto-generated method stub
		fp = new FenetrePage();
		add(fp);
		repaint();
		setVisible(true);
	}
	
	public void modifierArbre()
	{
		remove(arbre);
		// TODO Auto-generated method stub
		arbre = new FenetreArbre();
		add(arbre);
		repaint();
	}
}
