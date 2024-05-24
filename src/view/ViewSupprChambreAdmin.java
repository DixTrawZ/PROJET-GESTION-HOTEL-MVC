package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewSupprChambreAdmin extends MyFrame{
	public JLabel supprChambreAdminLabel;
	public JButton supprChambreAdminButton;
	public JLabel numeroSupprLabel;
	public JTextField numeroSupprChambre;
	public JButton retourAccueilSupprChambreAdmin;
	public JButton retourMenuSupprChambre;
	public ViewSupprChambreAdmin()
	{
		this.setSize(500, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon imageIcone = new ImageIcon("h3.png");
		this.setIconImage(imageIcone.getImage());
		this.setTitle("Gestion Hotel");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setLayout(null);
		supprChambreAdminLabel = new JLabel("SUPPRESSION CHAMBRE");
		supprChambreAdminLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
		supprChambreAdminLabel.setBounds(10, 10, 500, 50);
		supprChambreAdminLabel.setHorizontalAlignment(JLabel.CENTER);
		this.add(supprChambreAdminLabel);
		supprChambreAdminButton = new JButton("Supprimer");
		supprChambreAdminButton.setBounds(155, 300, 200, 50);
		this.add(supprChambreAdminButton);
		numeroSupprLabel = new JLabel("Entrez le numéro de la chambre");
		numeroSupprLabel.setBounds(0, 100, 500, 30);
		numeroSupprLabel.setHorizontalAlignment(JLabel.CENTER);
		this.add(numeroSupprLabel);
		numeroSupprChambre = new JTextField(20);
		numeroSupprChambre.setBounds(180, 150, 150, 20);
		this.add(numeroSupprChambre);
		retourAccueilSupprChambreAdmin = new JButton("Accueil");
		retourAccueilSupprChambreAdmin.setBounds(10, 400, 90, 40);
		this.add(retourAccueilSupprChambreAdmin);
		retourMenuSupprChambre = new JButton("Menu");
		retourMenuSupprChambre.setBounds(380, 400, 90, 40);
		this.add(retourMenuSupprChambre);
		this.setVisible(false);
	}
	
}
