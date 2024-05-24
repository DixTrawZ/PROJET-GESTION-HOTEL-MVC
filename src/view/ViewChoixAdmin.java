package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewChoixAdmin extends MyFrame {
    public JLabel adminMenuLabel;
    public JButton gestionChambreButton;
    public JButton gestionReservationButton;
    public JLabel adminchoixChReLabel;
    public JButton retourAccueilChoixAdmin;

    public ViewChoixAdmin() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        adminMenuLabel = new JLabel("MENU ADMINISTRATEUR");
        adminMenuLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        adminMenuLabel.setBounds(10, 10, 500, 50);
        adminMenuLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(adminMenuLabel);
        gestionChambreButton = new JButton("Gestion des chambres");
        gestionChambreButton.setBounds(20, 300, 200, 50);
        this.add(gestionChambreButton);
        gestionReservationButton = new JButton("Gestion des réservations");
        gestionReservationButton.setBounds(260, 300, 200, 50);
        this.add(gestionReservationButton);
        adminchoixChReLabel = new JLabel("Veuillez choisir");
        adminchoixChReLabel.setBounds(0, 250, 500, 30);
        adminchoixChReLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(adminchoixChReLabel);
        retourAccueilChoixAdmin = new JButton("Accueil");
        retourAccueilChoixAdmin.setBounds(10, 400, 90, 40);
        this.add(retourAccueilChoixAdmin);
        this.setVisible(false);
    }
}
