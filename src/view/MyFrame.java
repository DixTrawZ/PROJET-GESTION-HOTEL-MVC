package view;

import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame{
	
	MyFrame()
	{
		this.setSize(500, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon imageIcone = new ImageIcon("/mvc_poo/src/view/h3.png");
		this.setIconImage(imageIcone.getImage());
		this.setTitle("Gestion Hotel");
		this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.decode("#D6EAF8"));
	}
	}