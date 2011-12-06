package Fenetre;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame
{
	private PanelMenu 			menu;
	private PanelArbre			arborescence;
	private PanelListeAction	listeAction;
	private PanelEditeur		editeur;
	
	public Fenetre()
	{
		setTitle("Generateur de site");
		setSize(1024, 700);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		menu = new PanelMenu();
		menu.addMenuInFrame(this);
		
		arborescence = new PanelArbre();
		add(arborescence, BorderLayout.WEST);
		
		JPanel panelCentre = new JPanel();
		
		listeAction = new PanelListeAction();
		panelCentre.add(listeAction, BorderLayout.NORTH);
		
		editeur = new PanelEditeur();
		panelCentre.add(editeur, BorderLayout.CENTER);
		
		add(panelCentre);
		
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
}
