package Fenetre;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class CreationProjet extends JFrame implements ActionListener
{	
	public static String nomProjet;
	
	public CreationProjet()
	{
		setTitle("Nouveau Projet");
		setLocation(100, 100);
		setSize(500, 400);
		
		JLabel labelDescription = new JLabel("Creer votre projet");
		add(labelDescription, BorderLayout.NORTH);
		
		JLabel label = new JLabel("Nom du projet");
		JPanel panel = new JPanel();
		panel.add(label);
		JTextField tx = new JTextField(30);
		tx.addActionListener(this);
		
		panel.add(tx);
		
		add(panel);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		JTextField jtx = (JTextField)e.getSource();
		nomProjet = jtx.getText();
	}
}
