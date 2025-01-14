package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewInscriptionAdminFrame extends MyFrame {
    public JPanel inscriptionAdminpanel;
    public JLabel inscriptionAdminLabel;
    public JLabel inscriptionAdminnomLabel;
    public JTextField inscriptionAdminnomField;
    public JLabel inscriptionAdminprenomLabel;
    public JTextField inscriptionAdminprenomField;
    public JLabel jourAdminLabel;
    public JTextField jourAdminField;
    public JLabel moisAdminLabel;
    public JTextField moisAdminField;
    public JLabel anneeAdminLabel;
    public JTextField anneeAdminField;
    public JLabel inscriptionAdmintelLabel;
    public JTextField inscriptionAdmintelField;
    public JLabel inscriptionAdminemailLabel;
    public JTextField inscriptionAdminemailField;
    public JButton inscriptionAdminButton;
    public JButton retourAccueilAdminInscription;

    public ViewInscriptionAdminFrame() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcone = new ImageIcon("h3.png");
        this.setIconImage(imageIcone.getImage());
        this.setTitle("Gestion Hotel");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        inscriptionAdminpanel = new JPanel();
        inscriptionAdminpanel.setLayout(null);
        inscriptionAdminLabel = new JLabel("MENU INSCRIPTION");
        inscriptionAdminLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        inscriptionAdminLabel.setBounds(0, 10, 500, 50);
        inscriptionAdminLabel.setHorizontalAlignment(JLabel.CENTER);
        inscriptionAdminpanel.add(inscriptionAdminLabel);
        inscriptionAdminnomLabel = new JLabel("Nom:");
        inscriptionAdminnomLabel.setBounds(50, 100, 100, 20);
        inscriptionAdminnomField = new JTextField(20);
        inscriptionAdminnomField.setBounds(160, 100, 200, 20);
        inscriptionAdminpanel.add(inscriptionAdminnomLabel);
        inscriptionAdminpanel.add(inscriptionAdminnomField);
        inscriptionAdminprenomLabel = new JLabel("Prénom:");
        inscriptionAdminprenomLabel.setBounds(50, 150, 100, 20);
        inscriptionAdminprenomField = new JTextField(20);
        inscriptionAdminprenomField.setBounds(160, 150, 200, 20);
        inscriptionAdminpanel.add(inscriptionAdminprenomLabel);
        inscriptionAdminpanel.add(inscriptionAdminprenomField);
        jourAdminLabel = new JLabel("Jour:");
        jourAdminLabel.setBounds(50, 200, 50, 20);
        jourAdminField = new JTextField(2);
        jourAdminField.setBounds(110, 200, 50, 20);
        inscriptionAdminpanel.add(jourAdminLabel);
        inscriptionAdminpanel.add(jourAdminField);
        moisAdminLabel = new JLabel("Mois:");
        moisAdminLabel.setBounds(170, 200, 50, 20);
        moisAdminField = new JTextField(2);
        moisAdminField.setBounds(230, 200, 50, 20);
        inscriptionAdminpanel.add(moisAdminLabel);
        inscriptionAdminpanel.add(moisAdminField);
        anneeAdminLabel = new JLabel("Année:");
        anneeAdminLabel.setBounds(290, 200, 50, 20);
        anneeAdminField = new JTextField(4);
        anneeAdminField.setBounds(350, 200, 80, 20);
        inscriptionAdminpanel.add(anneeAdminLabel);
        inscriptionAdminpanel.add(anneeAdminField);
        inscriptionAdmintelLabel = new JLabel("Numéro de téléphone:");
        inscriptionAdmintelLabel.setBounds(50, 250, 150, 20);
        inscriptionAdmintelField = new JTextField(20);
        inscriptionAdmintelField.setBounds(210, 250, 150, 20);
        inscriptionAdminpanel.add(inscriptionAdmintelLabel);
        inscriptionAdminpanel.add(inscriptionAdmintelField);
        inscriptionAdminemailLabel = new JLabel("E-mail:");
        inscriptionAdminemailLabel.setBounds(50, 300, 100, 20);
        inscriptionAdminemailField = new JTextField(20);
        inscriptionAdminemailField.setBounds(160, 300, 200, 20);
        inscriptionAdminpanel.add(inscriptionAdminemailLabel);
        inscriptionAdminpanel.add(inscriptionAdminemailField);
        inscriptionAdminButton = new JButton("Valider");
        inscriptionAdminButton.setBounds(200, 350, 100, 30);
        inscriptionAdminpanel.add(inscriptionAdminButton);
        retourAccueilAdminInscription = new JButton("Accueil");
        retourAccueilAdminInscription.setBounds(10, 400, 90, 40);
        inscriptionAdminpanel.setBackground(Color.decode("#D6EAF8"));
        inscriptionAdminpanel.add(retourAccueilAdminInscription);
        this.setContentPane(inscriptionAdminpanel);
        this.setVisible(false);
    }

}
