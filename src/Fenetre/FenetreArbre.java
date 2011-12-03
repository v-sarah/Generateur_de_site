package Fenetre;

import java.io.File;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

import Main.Generateur;
import Utilitaire.*;

public class FenetreArbre extends JPanel implements TreeSelectionListener
{
	private JTree arbre;
	private DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
	private DefaultMutableTreeNode top;
	private DefaultMutableTreeNode fichier;
	
	public FenetreArbre()
	{		
		if (Generateur.alProjet != null)
		{
			for (Projet p : Generateur.alProjet)
			{
				System.out.println(p.getTitre());
				top = new DefaultMutableTreeNode(p.getTitre());
				root.add(top);
				for (File f : p.getAlF())
				{
					fichier = new DefaultMutableTreeNode(f.getName());
					top.add(fichier);
				}
				root.add(top);
			}
		}
		
		arbre = new JTree(root);
		
		//arbre.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		arbre.addTreeSelectionListener(this);
		
		add(arbre);
	}

	@Override
	public void valueChanged(TreeSelectionEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println("salut");
	}
}
