package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewFrameClient extends MyFrame {
    public JLabel ClientbienvenueLabel;
    public JButton ClientconnectionButton;
    public JButton ClientinscriptionButton;
    public JLabel ClientchoixLabel;
    public JButton retourAccueilClient;

    public ViewFrameClient() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        ClientbienvenueLabel = new JLabel("MENU CLIENT");
        ClientbienvenueLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        ClientbienvenueLabel.setBounds(0, 10, 500, 50);
        ClientbienvenueLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(ClientbienvenueLabel);
        ClientconnectionButton = new JButton("Se connecter");
        ClientconnectionButton.setBounds(20, 300, 200, 50);
        this.add(ClientconnectionButton);
        ClientinscriptionButton = new JButton("S'inscrire");
        ClientinscriptionButton.setBounds(260, 300, 200, 50);
        this.add(ClientinscriptionButton);
        ClientchoixLabel = new JLabel("Veuillez choisir");
        ClientchoixLabel.setBounds(0, 250, 500, 30);
        ClientchoixLabel.setHorizontalAlignment(JLabel.CENTER);
        retourAccueilClient = new JButton("Accueil");
        retourAccueilClient.setBounds(10, 400, 90, 40);
        this.add(retourAccueilClient);
        this.add(ClientchoixLabel);
        this.setVisible(false);
    }
}
