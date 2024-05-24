package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewConnexionAdministrateurFrame extends MyFrame {
    public JLabel menuconnexionAdmin;
    public JLabel identifiantAdminLabel;
    public JTextField identifiantAdminField;
    public JButton validerAdminButton;
    public JButton retourAccueilAdminConnexion;

    public ViewConnexionAdministrateurFrame() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        JPanel panelAdmin = new JPanel();
        panelAdmin.setLayout(null);
        this.add(panelAdmin);
        menuconnexionAdmin = new JLabel("MENU CONNEXION");
        menuconnexionAdmin.setFont(new Font("Helvetica", Font.BOLD, 16));
        menuconnexionAdmin.setBounds(0, 10, 500, 50);
        menuconnexionAdmin.setHorizontalAlignment(JLabel.CENTER);
        panelAdmin.add(menuconnexionAdmin);
        identifiantAdminLabel = new JLabel("Veuillez entrer votre identifiant :");
        identifiantAdminLabel.setBounds(160, 150, 200, 20);
        panelAdmin.add(identifiantAdminLabel);
        identifiantAdminField = new JTextField();
        identifiantAdminField.setBounds(150, 200, 200, 30);
        panelAdmin.add(identifiantAdminField);
        validerAdminButton = new JButton("Valider");
        validerAdminButton.setBounds(200, 250, 100, 30);
        panelAdmin.add(validerAdminButton);
        retourAccueilAdminConnexion = new JButton("Accueil");
        retourAccueilAdminConnexion.setBounds(10, 400, 90, 40);
        panelAdmin.add(retourAccueilAdminConnexion);
        panelAdmin.setBackground(Color.decode("#D6EAF8"));
        this.setContentPane(panelAdmin);
        this.setVisible(false);
    }
}
