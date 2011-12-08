package Fenetre;

import java.awt.*;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class PanelEditeur extends JPanel
{
	private JEditorPane editeurPanel;
	private JScrollPane editeurScroll;

	public PanelEditeur()
	{
		setLayout(new BorderLayout());
		editeurPanel = new JEditorPane();
		editeurScroll = new JScrollPane(editeurPanel);
		editeurScroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		editeurScroll.setPreferredSize(new Dimension(250, 145));
		editeurScroll.setBorder(
	            BorderFactory.createCompoundBorder(
	                BorderFactory.createCompoundBorder(
	                                BorderFactory.createTitledBorder("Votre site"),
	                                BorderFactory.createEmptyBorder(5,5,5,5)),
	                                editeurScroll.getBorder()));
        
		add(editeurScroll);
	}
}
