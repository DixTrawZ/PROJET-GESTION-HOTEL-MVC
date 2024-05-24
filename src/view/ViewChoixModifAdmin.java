package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewChoixModifAdmin extends MyFrame {
    public JLabel choixModifAdminLabel;
    public JButton dispoChambreButton;
    public JButton nondispoReservationButton;
    public JLabel numeroLabel;
    public JTextField numeroChambre;
    public JButton retourAccueilChambreAdmin;
    public JButton retourMenuModifChambre;

    public ViewChoixModifAdmin() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        choixModifAdminLabel = new JLabel("MODIFICATION CHAMBRE");
        choixModifAdminLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        choixModifAdminLabel.setBounds(10, 10, 500, 50);
        choixModifAdminLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(choixModifAdminLabel);
        dispoChambreButton = new JButton("Rendre disponible");
        dispoChambreButton.setBounds(20, 300, 200, 50);
        this.add(dispoChambreButton);
        nondispoReservationButton = new JButton("Rendre indisponible");
        nondispoReservationButton.setBounds(260, 300, 200, 50);
        this.add(nondispoReservationButton);
        numeroLabel = new JLabel("Entrez le numéro de la chambre");
        numeroLabel.setBounds(0, 100, 500, 30);
        numeroLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(numeroLabel);
        numeroChambre = new JTextField(20);
        numeroChambre.setBounds(180, 150, 150, 20);
        this.add(numeroChambre);
        retourAccueilChambreAdmin = new JButton("Accueil");
        retourAccueilChambreAdmin.setBounds(10, 400, 90, 40);
        this.add(retourAccueilChambreAdmin);
        retourMenuModifChambre = new JButton("Menu");
        retourMenuModifChambre.setBounds(380, 400, 90, 40);
        this.add(retourMenuModifChambre);
        this.setVisible(false);
    }
}
