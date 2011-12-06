package Fenetre;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

import Main.Generateur;


public class PanelMenu extends JPanel implements ActionListener
{
	private JMenuBar menuBar;
	
	private JMenu menuFile;
	private JMenu menuEdit;
	
	// item pour le menu Fichiers
	private JMenuItem itemNew;
	private JMenuItem itemOpen;
	private JMenuItem itemSaveAs;
	private JMenuItem itemSave;
	
	// item pour le menu Edition
	private JMenuItem itemClose;
	private JMenuItem itemUndo;
	private JMenuItem itemRedo;
	
	public PanelMenu()
	{
		// initialisation de la bar de Menu
		menuBar = new JMenuBar();
		// initialisation des Menus
		menuFile = new JMenu("Fichier");
		menuEdit = new JMenu("Edition");
		
		// initialisation des items pour le menu Fichier
		itemNew = new JMenuItem("Nouveau Projet");
		itemNew.addActionListener(this);
		itemOpen = new JMenuItem("Ouvrir un Projet");
		itemOpen.addActionListener(this);
		itemSaveAs = new JMenuItem("Enregistrer Sous");
		itemSaveAs.addActionListener(this);
		itemSave = new JMenuItem("Enregistrer");
		itemSave.addActionListener(this);
		itemClose = new JMenuItem("Quitter");
		itemClose.addActionListener(this);
		
		// initialisation des items pour le menu Edition
		itemUndo = new JMenuItem("Annuler");
		itemUndo.addActionListener(this);
		itemRedo = new JMenuItem("Retablir");
		itemRedo.addActionListener(this);
		
		// ajout des items dans le menu Fichier
		menuFile.add(itemNew);
		menuFile.add(itemOpen);
		menuFile.addSeparator();
		menuFile.add(itemSaveAs);
		menuFile.add(itemSave);
		menuFile.addSeparator();
		menuFile.add(itemClose);
		
		// ajout des items dans le menu Edition
		menuEdit.add(itemUndo);
		menuEdit.add(itemRedo);
		
		// Ajout des menus dans la bar de Menu
		menuBar.add(menuFile);
		menuBar.add(menuEdit);	
	}
	
	// permet d'ajouter la bar de menu dans la frame
	public void addMenuInFrame(JFrame f)
	{
		f.setJMenuBar(menuBar);
	}

	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		JMenuItem mi = (JMenuItem) e.getSource();
		String label = mi.getLabel();
		if (label.equals("Nouveau Projet"))
			newProject();
		if (label.equals("Ouvrir un Projet"))
			openProject();
		if (label.equals("Quitter"))
			closeFrame();
	}

	private void newProject()
	{
		// TODO Auto-generated method stub
		new FenetreCreationProjet();
	}
	
	private void openProject()
	{
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("/"));
		chooser.changeToParentDirectory();
		chooser.showOpenDialog(null);
	}

	private void closeFrame()
	{
		// TODO Auto-generated method stub
		System.exit(0);
	}
	
	public void attendre()
	{
		try
		{
			Thread.sleep(2000);
		} catch (Exception e){}
	}
}

