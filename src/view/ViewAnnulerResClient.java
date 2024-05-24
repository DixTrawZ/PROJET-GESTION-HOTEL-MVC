package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewAnnulerResClient extends MyFrame {
    public JLabel annulerResClientLabel;
    public JButton annulerResClientButton1;
    public JButton annulerResClientButton2;
    public JLabel annulerResClientLabel2;
    public JButton retourAccueilannulerResClient;
    public JButton retourMenuannulerResClient;

    public ViewAnnulerResClient() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        annulerResClientLabel = new JLabel("ANNULATION RESERVATION");
        annulerResClientLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        annulerResClientLabel.setBounds(10, 10, 500, 50);
        annulerResClientLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(annulerResClientLabel);
        annulerResClientButton1 = new JButton("Oui");
        annulerResClientButton1.setBounds(10, 250, 200, 50);
        this.add(annulerResClientButton1);
        annulerResClientButton2 = new JButton("Non");
        annulerResClientButton2.setBounds(270, 250, 200, 50);
        this.add(annulerResClientButton2);
        annulerResClientLabel2 = new JLabel("Annuler la réservation ?");
        annulerResClientLabel2.setBounds(0, 100, 500, 30);
        annulerResClientLabel2.setHorizontalAlignment(JLabel.CENTER);
        this.add(annulerResClientLabel2);
        retourAccueilannulerResClient = new JButton("Accueil");
        retourAccueilannulerResClient.setBounds(10, 400, 90, 40);
        this.add(retourAccueilannulerResClient);
        retourMenuannulerResClient = new JButton("Menu");
        retourMenuannulerResClient.setBounds(380, 400, 90, 40);
        this.add(retourMenuannulerResClient);
        this.setVisible(false);
    }
}
