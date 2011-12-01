package Fenetre;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class FenetreArbre extends JPanel implements TreeSelectionListener
{
	private JTree arbre;
	
	public FenetreArbre()
	{
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("The Java Series");
		DefaultMutableTreeNode black = new DefaultMutableTreeNode("Black");
		
		arbre = new JTree(top);
		top.add(black);
		arbre.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		arbre.addTreeSelectionListener(this);
		
		add(arbre);
	}

	@Override
	public void valueChanged(TreeSelectionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
