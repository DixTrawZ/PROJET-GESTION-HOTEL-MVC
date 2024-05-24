package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewFrameAdmin extends MyFrame{
	JLabel adminbienvenueLabel;
	public JButton adminconnectionButton;
	public JButton admininscriptionButton;
	JLabel adminchoixLabel;
	public JButton retourAccueilAdmin;
	public ViewFrameAdmin()
	{
		this.setSize(500, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon imageIcone = new ImageIcon("h3.png");
		this.setIconImage(imageIcone.getImage());
		this.setTitle("Gestion Hotel");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		adminbienvenueLabel = new JLabel("MENU ADMINISTRATEUR");
		adminbienvenueLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
		adminbienvenueLabel.setBounds(10, 10, 500, 50);
		adminbienvenueLabel.setHorizontalAlignment(JLabel.CENTER);
		this.add(adminbienvenueLabel);
		adminconnectionButton = new JButton("Se connecter");
		adminconnectionButton.setBounds(20, 300, 200, 50);
		this.add(adminconnectionButton);
		admininscriptionButton = new JButton("S'inscrire");
		admininscriptionButton.setBounds(260, 300, 200, 50);
		this.add(admininscriptionButton);
		adminchoixLabel = new JLabel("Veuillez choisir");
		adminchoixLabel.setBounds(0, 250, 500, 30);
		adminchoixLabel.setHorizontalAlignment(JLabel.CENTER);
		retourAccueilAdmin = new JButton("Accueil");
		retourAccueilAdmin.setBounds(10, 400, 90, 40);
        this.add(retourAccueilAdmin);
		this.add(adminchoixLabel);
		this.setVisible(false);
	}


}
