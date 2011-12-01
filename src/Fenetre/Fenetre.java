package Fenetre;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Fenetre extends JFrame
{
	MenuFenetre menu;
	
	public Fenetre()
	{
		setTitle("Générateur de site");
		setSize(1024, 700);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		menu = new MenuFenetre();
		menu.addMenuInFrame(this);
		
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
	
	public static void creerNouveauProjet()
	{
		// TODO Auto-generated method stub
		System.out.println(CreationProjet.nomProjet);
	}
	
	public static void main(String[] argv)
	{
		new Fenetre();
	}
}
