package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewInscriptionClientFrame extends MyFrame{
	JPanel inscriptionClientpanel;
	JLabel inscriptionClientLabel;
	JLabel inscriptionClientnomLabel;
	public JTextField inscriptionClientnomField;
	JLabel inscriptionClientprenomLabel;
	public JTextField inscriptionClientprenomField;
	JLabel jourClientLabel;
	public JTextField jourClientField;
	JLabel moisClientLabel;
	public JTextField moisClientField;
	JLabel anneeClientLabel;
	public JTextField anneeClientField;
	JLabel inscriptionClienttelLabel;
	public JTextField inscriptionClienttelField;
	JLabel inscriptionClientemailLabel;
	public JTextField inscriptionClientemailField;
	public JButton inscriptionClientButton;
	public JButton retourAccueilClientInscription;
	public ViewInscriptionClientFrame()
	{
		this.setSize(500, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon imageIcone = new ImageIcon("h3.png");
		this.setIconImage(imageIcone.getImage());
		this.setTitle("Gestion Hotel");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		inscriptionClientpanel = new JPanel();
        inscriptionClientpanel.setLayout(null);
		inscriptionClientLabel = new JLabel("MENU INSCRIPTION");
		inscriptionClientLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
		inscriptionClientLabel.setBounds(0, 10, 500, 50);
		inscriptionClientLabel.setHorizontalAlignment(JLabel.CENTER);
		inscriptionClientpanel.add(inscriptionClientLabel);
        inscriptionClientnomLabel = new JLabel("Nom:");
        inscriptionClientnomLabel.setBounds(50, 100, 100, 20);
        inscriptionClientnomField = new JTextField(20);
        inscriptionClientnomField.setBounds(160, 100, 200, 20);
        inscriptionClientpanel.add(inscriptionClientnomLabel);
        inscriptionClientpanel.add(inscriptionClientnomField);
        inscriptionClientprenomLabel = new JLabel("Prénom:");
        inscriptionClientprenomLabel.setBounds(50, 150, 100, 20);
        inscriptionClientprenomField = new JTextField(20);
        inscriptionClientprenomField.setBounds(160, 150, 200, 20);
        inscriptionClientpanel.add(inscriptionClientprenomLabel);
        inscriptionClientpanel.add(inscriptionClientprenomField);
        jourClientLabel = new JLabel("Jour:");
        jourClientLabel.setBounds(50, 200, 50, 20);
        jourClientField = new JTextField(2);
        jourClientField.setBounds(110, 200, 50, 20);
        inscriptionClientpanel.add(jourClientLabel);
        inscriptionClientpanel.add(jourClientField);
        moisClientLabel = new JLabel("Mois:");
        moisClientLabel.setBounds(170, 200, 50, 20);
        moisClientField = new JTextField(2);
        moisClientField.setBounds(230, 200, 50, 20);
        inscriptionClientpanel.add(moisClientLabel);
        inscriptionClientpanel.add(moisClientField);
        anneeClientLabel = new JLabel("Année:");
        anneeClientLabel.setBounds(290, 200, 50, 20);
        anneeClientField = new JTextField(4);
        anneeClientField.setBounds(350, 200, 80, 20);
        inscriptionClientpanel.add(anneeClientLabel);
        inscriptionClientpanel.add(anneeClientField);
        inscriptionClienttelLabel = new JLabel("Numéro de téléphone:");
        inscriptionClienttelLabel.setBounds(50, 250, 150, 20);
        inscriptionClienttelField = new JTextField(20);
        inscriptionClienttelField.setBounds(210, 250, 150, 20);
        inscriptionClientpanel.add(inscriptionClienttelLabel);
        inscriptionClientpanel.add(inscriptionClienttelField);
        inscriptionClientemailLabel = new JLabel("E-mail:");
        inscriptionClientemailLabel.setBounds(50, 300, 100, 20);
        inscriptionClientemailField = new JTextField(20);
        inscriptionClientemailField.setBounds(160, 300, 200, 20);
        inscriptionClientpanel.add(inscriptionClientemailLabel);
        inscriptionClientpanel.add(inscriptionClientemailField);
        inscriptionClientButton = new JButton("Valider");
        inscriptionClientButton.setBounds(200, 350, 100, 30);
        inscriptionClientpanel.add(inscriptionClientButton);
        retourAccueilClientInscription = new JButton("Accueil");
        retourAccueilClientInscription.setBounds(10, 400, 90, 40);
        inscriptionClientpanel.add(retourAccueilClientInscription);
        inscriptionClientpanel.setBackground(Color.decode("#D6EAF8"));
        this.setContentPane(inscriptionClientpanel);
        this.setVisible(false);
	}
}
