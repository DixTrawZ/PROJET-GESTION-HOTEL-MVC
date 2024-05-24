package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewGestionReservationClient extends MyFrame {
    public JLabel gestionReservationClientLabel;
    public JButton demanderReservationClientButton;
    public JButton modifierReservationClientButton;
    public JButton supprimerréservationClientButton;
    public JLabel gestionreservationClientchoixLabel;
    public JButton retourAccueilGestionReservationClient;

    public ViewGestionReservationClient() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        gestionReservationClientLabel = new JLabel("MENU CLIENT DES RÉSERVATIONS");
        gestionReservationClientLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        gestionReservationClientLabel.setBounds(0, 10, 500, 50);
        gestionReservationClientLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(gestionReservationClientLabel);
        demanderReservationClientButton = new JButton("Demander une réservation");
        demanderReservationClientButton.setBounds(150, 160, 200, 50);
        this.add(demanderReservationClientButton);
        modifierReservationClientButton = new JButton("Modifier une réservation");
        modifierReservationClientButton.setBounds(150, 230, 200, 50);
        this.add(modifierReservationClientButton);
        supprimerréservationClientButton = new JButton("Supprimer une réservation");
        supprimerréservationClientButton.setBounds(150, 300, 200, 50);
        this.add(supprimerréservationClientButton);
        gestionreservationClientchoixLabel = new JLabel("Veuillez choisir");
        gestionreservationClientchoixLabel.setBounds(0, 80, 500, 30);
        gestionreservationClientchoixLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(gestionreservationClientchoixLabel);
        retourAccueilGestionReservationClient = new JButton("Accueil");
        retourAccueilGestionReservationClient.setBounds(10, 400, 90, 40);
        this.add(retourAccueilGestionReservationClient);
        this.setVisible(false);
    }
}
