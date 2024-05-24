package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewDeclineResAdmin extends MyFrame {
    public JLabel declineResAdminLabel;
    public JButton declineResAdminButton;
    public JLabel declineResLabel;
    public JTextField numerodeclineRes;
    public JButton retourAccueildeclineResAdmin;
    public JButton retourMenudeclineRes;

    public ViewDeclineResAdmin() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        declineResAdminLabel = new JLabel("DECLINER RESERVATION");
        declineResAdminLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        declineResAdminLabel.setBounds(10, 10, 500, 50);
        declineResAdminLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(declineResAdminLabel);
        declineResAdminButton = new JButton("Decliner");
        declineResAdminButton.setBounds(155, 300, 200, 50);
        this.add(declineResAdminButton);
        declineResLabel = new JLabel("Entrez le numéro de la réservation");
        declineResLabel.setBounds(0, 100, 500, 30);
        declineResLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(declineResLabel);
        numerodeclineRes = new JTextField(20);
        numerodeclineRes.setBounds(180, 150, 150, 20);
        this.add(numerodeclineRes);
        retourAccueildeclineResAdmin = new JButton("Accueil");
        retourAccueildeclineResAdmin.setBounds(10, 400, 90, 40);
        this.add(retourAccueildeclineResAdmin);
        retourMenudeclineRes = new JButton("Menu");
        retourMenudeclineRes.setBounds(380, 400, 90, 40);
        this.add(retourMenudeclineRes);
        this.setVisible(false);
    }
}
