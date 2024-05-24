package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewGestionChambre extends MyFrame {
    public JLabel gestionChambreLabel;
    public JButton creerChambreButton;
    public JButton modifierChambreButton;
    public JButton supprimerChambreButton;
    public JLabel gestionchambrechoixLabel;
    public JButton retourAccueilGestionChambre;
    public JButton retourMenuGestionChambre;

    public ViewGestionChambre() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        gestionChambreLabel = new JLabel("MENU GESTION DES CHAMBRES");
        gestionChambreLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        gestionChambreLabel.setBounds(0, 10, 500, 50);
        gestionChambreLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(gestionChambreLabel);
        creerChambreButton = new JButton("Créer une chambre");
        creerChambreButton.setBounds(150, 160, 200, 50);
        this.add(creerChambreButton);
        modifierChambreButton = new JButton("Modifier une chambre");
        modifierChambreButton.setBounds(150, 230, 200, 50);
        this.add(modifierChambreButton);
        supprimerChambreButton = new JButton("Supprimer une chambre");
        supprimerChambreButton.setBounds(150, 300, 200, 50);
        this.add(supprimerChambreButton);
        gestionchambrechoixLabel = new JLabel("Veuillez choisir");
        gestionchambrechoixLabel.setBounds(0, 80, 500, 30);
        gestionchambrechoixLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(gestionchambrechoixLabel);
        retourAccueilGestionChambre = new JButton("Accueil");
        retourAccueilGestionChambre.setBounds(10, 400, 90, 40);
        this.add(retourAccueilGestionChambre);
        retourMenuGestionChambre = new JButton("Menu");
        retourMenuGestionChambre.setBounds(380, 400, 90, 40);
        this.add(retourMenuGestionChambre);
        this.setVisible(false);
    }
}
