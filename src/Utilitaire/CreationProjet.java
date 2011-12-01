package Utilitaire;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

import Main.*;

public class CreationProjet extends JFrame implements ActionListener
{	
	private JTextField txNom;
	
	public CreationProjet()
	{
		setTitle("Nouveau Projet");
		setLocation(100, 100);
		setSize(500, 400);
		
		JLabel labelDescription = new JLabel("Creer votre projet");
		add(labelDescription, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Nom du projet");
		panel.add(label);
		txNom = new JTextField(30);
		
		panel.add(txNom);
		
		add(panel);
		JButton button = new JButton("Valider");
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub		
		this.dispose();
		Generateur.CreerUnProjet(txNom.getText());
	}
}
