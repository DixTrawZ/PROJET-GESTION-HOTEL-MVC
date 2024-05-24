package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewBienvenueFrame extends MyFrame{
	JLabel bienvenueLabel;
	public JButton clientButton;
	public JButton adminButton;
	JLabel choixLabel;
	public ViewBienvenueFrame()
	{
		this.setSize(500, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon imageIcone = new ImageIcon("/mvc_poo/src/view/h3.png");
		this.setIconImage(imageIcone.getImage());
		this.setTitle("Gestion Hotel");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		bienvenueLabel = new JLabel("Bienvenue dans votre programme de gestion d'hôtel");
		bienvenueLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
		bienvenueLabel.setBounds(0, 10, 500, 50);
		bienvenueLabel.setHorizontalAlignment(JLabel.CENTER);
		this.add(bienvenueLabel);
		clientButton = new JButton("Client");
		clientButton.setBounds(20, 300, 200, 50);
		this.add(clientButton);
		adminButton = new JButton("Administrateur");
		adminButton.setBounds(260, 300, 200, 50);
		this.add(adminButton);
		choixLabel = new JLabel("Veuillez choisir");
		choixLabel.setBounds(0, 250, 500, 30);
		choixLabel.setHorizontalAlignment(JLabel.CENTER);
		this.add(choixLabel);
		this.setVisible(true);
	}

}
