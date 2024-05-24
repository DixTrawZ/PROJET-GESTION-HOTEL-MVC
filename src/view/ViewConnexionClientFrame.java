package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewConnexionClientFrame extends MyFrame {
    public JLabel menuconnexionClient;
    public JLabel identifiantClientLabel;
    public JTextField identifiantClientField;
    public JButton validerClientButton;
    public JButton retourAccueilClientConnexion;

    public ViewConnexionClientFrame() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("/mvc_poo/src/view/h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        JPanel panelClient = new JPanel();
        panelClient.setLayout(null);
        this.add(panelClient);
        menuconnexionClient = new JLabel("MENU CONNEXION");
        menuconnexionClient.setFont(new Font("Helvetica", Font.BOLD, 16));
        menuconnexionClient.setBounds(0, 10, 500, 50);
        menuconnexionClient.setHorizontalAlignment(JLabel.CENTER);
        panelClient.add(menuconnexionClient);
        identifiantClientLabel = new JLabel("Veuillez entrer votre identifiant :");
        identifiantClientLabel.setBounds(160, 150, 200, 20);
        panelClient.add(identifiantClientLabel);
        identifiantClientField = new JTextField();
        identifiantClientField.setBounds(150, 200, 200, 30);
        panelClient.add(identifiantClientField);
        validerClientButton = new JButton("Valider");
        validerClientButton.setBounds(200, 250, 100, 30);
        retourAccueilClientConnexion = new JButton("Accueil");
        retourAccueilClientConnexion.setBounds(10, 400, 90, 40);
        panelClient.add(retourAccueilClientConnexion);
        panelClient.add(validerClientButton);
        panelClient.setBackground(Color.decode("#D6EAF8"));
        this.setContentPane(panelClient);
        this.setVisible(false);
    }
}
