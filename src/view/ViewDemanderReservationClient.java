package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewDemanderReservationClient extends MyFrame {
    public JLabel demanderReservationClientLabel;
    public JButton demanderReservationClientButton2;
    public JLabel demanderReservationClient2;
    public JTextField numeroChambreDemande;
    public JLabel dateDebut;
    public JLabel jourDebutLabel;
    public JTextField jourDebutField;
    public JLabel moisDebutLabel;
    public JTextField moisDebutField;
    public JLabel anneeDebutLabel;
    public JTextField anneeDebutField;
    public JLabel dateFin;
    public JLabel jourFinLabel;
    public JTextField jourFinField;
    public JLabel moisFinLabel;
    public JTextField moisFinField;
    public JLabel anneeFinLabel;
    public JTextField anneeFinField;
    public JButton retourAccueildemanderReservationClient;
    public JButton retourMenudemanderReservationClient;

    public ViewDemanderReservationClient() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        demanderReservationClientLabel = new JLabel("DEMANDER UNE RESERVATION");
        demanderReservationClientLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        demanderReservationClientLabel.setBounds(10, 10, 500, 50);
        demanderReservationClientLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(demanderReservationClientLabel);
        demanderReservationClientButton2 = new JButton("Demander");
        demanderReservationClientButton2.setBounds(145, 330, 200, 50);
        this.add(demanderReservationClientButton2);
        demanderReservationClient2 = new JLabel("Entrez le numéro de la chambre");
        demanderReservationClient2.setBounds(0, 70, 500, 30);
        demanderReservationClient2.setHorizontalAlignment(JLabel.CENTER);
        this.add(demanderReservationClient2);
        numeroChambreDemande = new JTextField(20);
        numeroChambreDemande.setBounds(180, 110, 150, 20);
        this.add(numeroChambreDemande);
        dateDebut = new JLabel("Entrez la date du début");
        dateDebut.setBounds(0, 140, 500, 30);
        dateDebut.setHorizontalAlignment(JLabel.CENTER);
        this.add(dateDebut);
        jourDebutLabel = new JLabel("Jour:");
        jourDebutLabel.setBounds(50, 180, 50, 20);
        this.add(jourDebutLabel);
        jourDebutField = new JTextField(2);
        jourDebutField.setBounds(110, 180, 50, 20);
        this.add(jourDebutField);
        moisDebutLabel = new JLabel("Mois:");
        moisDebutLabel.setBounds(170, 180, 50, 20);
        this.add(moisDebutLabel);
        moisDebutField = new JTextField(2);
        moisDebutField.setBounds(230, 180, 50, 20);
        this.add(moisDebutField);
        anneeDebutLabel = new JLabel("Année:");
        anneeDebutLabel.setBounds(290, 180, 50, 20);
        this.add(anneeDebutLabel);
        anneeDebutField = new JTextField(4);
        anneeDebutField.setBounds(350, 180, 80, 20);
        this.add(anneeDebutField);
        dateFin = new JLabel("Entrez la date de fin");
        dateFin.setBounds(0, 220, 500, 30);
        dateFin.setHorizontalAlignment(JLabel.CENTER);
        this.add(dateFin);
        jourFinLabel = new JLabel("Jour:");
        jourFinLabel.setBounds(50, 260, 50, 20);
        this.add(jourFinLabel);
        jourFinField = new JTextField(2);
        jourFinField.setBounds(110, 260, 50, 20);
        this.add(jourFinField);
        moisFinLabel = new JLabel("Mois:");
        moisFinLabel.setBounds(170, 260, 50, 20);
        this.add(moisFinLabel);
        moisFinField = new JTextField(2);
        moisFinField.setBounds(230, 260, 50, 20);
        this.add(moisFinField);
        anneeFinLabel = new JLabel("Année:");
        anneeFinLabel.setBounds(290, 260, 50, 20);
        this.add(anneeFinLabel);
        anneeFinField = new JTextField(4);
        anneeFinField.setBounds(350, 260, 80, 20);
        this.add(anneeFinField);
        retourAccueildemanderReservationClient = new JButton("Accueil");
        retourAccueildemanderReservationClient.setBounds(10, 400, 90, 40);
        this.add(retourAccueildemanderReservationClient);
        retourMenudemanderReservationClient = new JButton("Menu");
        retourMenudemanderReservationClient.setBounds(380, 400, 90, 40);
        this.add(retourMenudemanderReservationClient);
        this.setVisible(false);
    }
}