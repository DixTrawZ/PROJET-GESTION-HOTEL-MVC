package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewAcceptResAdmin extends MyFrame {
    public JLabel acceptResAdminLabel;
    public JButton acceptResAdminButton;
    public JLabel acceptResLabel;
    public JTextField numeroacceptRes;
    public JButton retourAccueilacceptResAdmin;
    public JButton retourMenuacceptRes;

    public ViewAcceptResAdmin() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        acceptResAdminLabel = new JLabel("ACCEPTER RESERVATION");
        acceptResAdminLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        acceptResAdminLabel.setBounds(10, 10, 500, 50);
        acceptResAdminLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(acceptResAdminLabel);
        acceptResAdminButton = new JButton("Accepter");
        acceptResAdminButton.setBounds(155, 300, 200, 50);
        this.add(acceptResAdminButton);
        acceptResLabel = new JLabel("Entrez le numéro de la réservation");
        acceptResLabel.setBounds(0, 100, 500, 30);
        acceptResLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(acceptResLabel);
        numeroacceptRes = new JTextField(20);
        numeroacceptRes.setBounds(180, 150, 150, 20);
        this.add(numeroacceptRes);
        retourAccueilacceptResAdmin = new JButton("Accueil");
        retourAccueilacceptResAdmin.setBounds(10, 400, 90, 40);
        this.add(retourAccueilacceptResAdmin);
        retourMenuacceptRes = new JButton("Menu");
        retourMenuacceptRes.setBounds(380, 400, 90, 40);
        this.add(retourMenuacceptRes);
        this.setVisible(false);
    }
}
