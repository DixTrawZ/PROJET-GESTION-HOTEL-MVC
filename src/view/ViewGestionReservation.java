package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewGestionReservation extends MyFrame {
    public JLabel gestionréservationLabel;
    public JButton creerréservationButton;
    public JButton modifierréservationButton;
    public JButton supprimerréservationButton;
    public JLabel gestionreservationchoixLabel;
    public JButton retourAccueilGestionReservation;
    public JButton retourMenuGestionReservation;

    public ViewGestionReservation() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        gestionréservationLabel = new JLabel("MENU GESTION DES RÉSERVATIONS");
        gestionréservationLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        gestionréservationLabel.setBounds(0, 10, 500, 50);
        gestionréservationLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(gestionréservationLabel);
        creerréservationButton = new JButton("Nombre de réservation");
        creerréservationButton.setBounds(150, 160, 200, 50);
        this.add(creerréservationButton);
        modifierréservationButton = new JButton("Accepter une réservation");
        modifierréservationButton.setBounds(150, 230, 200, 50);
        this.add(modifierréservationButton);
        supprimerréservationButton = new JButton("Décliner une réservation");
        supprimerréservationButton.setBounds(150, 300, 200, 50);
        this.add(supprimerréservationButton);
        gestionreservationchoixLabel = new JLabel("Veuillez choisir");
        gestionreservationchoixLabel.setBounds(0, 80, 500, 30);
        gestionreservationchoixLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(gestionreservationchoixLabel);
        retourAccueilGestionReservation = new JButton("Accueil");
        retourAccueilGestionReservation.setBounds(10, 400, 90, 40);
        this.add(retourAccueilGestionReservation);
        retourMenuGestionReservation = new JButton("Menu");
        retourMenuGestionReservation.setBounds(380, 400, 90, 40);
        this.add(retourMenuGestionReservation);
        this.setVisible(false);
    }
}
