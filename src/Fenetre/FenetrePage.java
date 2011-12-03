package Fenetre;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import Main.Generateur;

public class FenetrePage extends JPanel implements ActionListener
{
	private JPanel panel;
	private JTextField txTitre;
	private JTextField txAuteur;
	private JLabel l;
	
	public FenetrePage()
	{
		setLayout(new GridLayout(3, 1));
		
		panel = new JPanel();
		l = new JLabel("Titre de la page");
		panel.add(l);
		txTitre = new JTextField(30);
		panel.add(txTitre);
		
		add(panel);
		
		panel = new JPanel();
		l = new JLabel("Auteur");
		panel.add(l);
		txAuteur = new JTextField(30);
		panel.add(txAuteur);
		
		add(panel);
		
		JButton button = new JButton("Valider");
		button.addActionListener(this);
		add(button);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		String titre = txTitre.getText();
		String auteur = txAuteur.getText();
		Generateur.CreerPage(titre, auteur, null, null);
	}

}
