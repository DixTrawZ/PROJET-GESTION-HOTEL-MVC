package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewModifierReservationClient extends MyFrame{
	JLabel modifierReservationClientLabel;
	public JButton modifierReservationClientButton2;
	JLabel nouvelleDateFin;
	JLabel nouveauJourFinLabel;
	public JTextField nouveauJourFinField;
	JLabel nouveauMoisFinLabel;
	public JTextField nouveauMoisFinField;
	JLabel nouveauAnneeFinLabel;
	public JTextField nouveauAnneeFinField;
	public JButton retourAccueilmodifierReservationClient;
	public JButton retourMenumodifierReservationClient;
	public ViewModifierReservationClient()
	{
		this.setSize(500, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon imageIcone = new ImageIcon("h3.png");
		this.setIconImage(imageIcone.getImage());
		this.setTitle("Gestion Hotel");
		this.setLocationRelativeTo(null);
		this.setLayout(null);	
		modifierReservationClientLabel = new JLabel("MODIFIER UNE RESERVATION");
		modifierReservationClientLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
		modifierReservationClientLabel.setBounds(10, 10, 500, 50);
		modifierReservationClientLabel.setHorizontalAlignment(JLabel.CENTER);
		this.add(modifierReservationClientLabel);
		modifierReservationClientButton2 = new JButton("Modifier");
		modifierReservationClientButton2.setBounds(145, 330, 200, 50);
		this.add(modifierReservationClientButton2);
		nouvelleDateFin = new JLabel("Entrez la nouvelle date de fin");
		nouvelleDateFin.setBounds(0, 140, 500, 30);
		nouvelleDateFin.setHorizontalAlignment(JLabel.CENTER);
		this.add(nouvelleDateFin);
		nouveauJourFinLabel = new JLabel("Jour:");
		nouveauJourFinLabel.setBounds(50, 180, 50, 20);
		this.add(nouveauJourFinLabel);
		nouveauJourFinField = new JTextField(2);
		nouveauJourFinField.setBounds(110, 180, 50, 20);
		this.add(nouveauJourFinField);
		nouveauMoisFinLabel = new JLabel("Mois:");
		nouveauMoisFinLabel.setBounds(170, 180, 50, 20);
		this.add(nouveauMoisFinLabel);
		nouveauMoisFinField = new JTextField(2);
		nouveauMoisFinField.setBounds(230, 180, 50, 20);
		this.add(nouveauMoisFinField);
		nouveauAnneeFinLabel = new JLabel("Année:");
		nouveauAnneeFinLabel.setBounds(290, 180, 50, 20);
		this.add(nouveauAnneeFinLabel);
		nouveauAnneeFinField = new JTextField(4);
		nouveauAnneeFinField.setBounds(350, 180, 80, 20);
		this.add(nouveauAnneeFinField);
		retourAccueilmodifierReservationClient = new JButton("Accueil");
		retourAccueilmodifierReservationClient.setBounds(10, 400, 90, 40);
		this.add(retourAccueilmodifierReservationClient);
		retourMenumodifierReservationClient = new JButton("Menu");
		retourMenumodifierReservationClient.setBounds(380, 400, 90, 40);
		this.add(retourMenumodifierReservationClient);
		this.setVisible(false);
	}
}
