package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import controler.MyException;
import model.Hotel;
import view.ViewAcceptResAdmin;
import view.ViewAnnulerResClient;
import view.ViewBienvenueFrame;
import view.ViewChoixAdmin;
import view.ViewChoixModifAdmin;
import view.ViewConnexionAdministrateurFrame;
import view.ViewConnexionClientFrame;
import view.ViewDeclineResAdmin;
import view.ViewDemanderReservationClient;
import view.ViewFrameAdmin;
import view.ViewFrameClient;
import view.ViewGestionChambre;
import view.ViewGestionReservation;
import view.ViewGestionReservationClient;
import view.ViewInscriptionAdminFrame;
import view.ViewInscriptionClientFrame;
import view.ViewModifierReservationClient;
import view.ViewSupprChambreAdmin;
import model.date;
public class Controler {
	Hotel hotel=new Hotel();
	String idActuel;
	ViewAcceptResAdmin acceptResAdmin = new ViewAcceptResAdmin();
	ViewAnnulerResClient annulerResClient = new ViewAnnulerResClient();
	ViewBienvenueFrame bienvenueFrame = new ViewBienvenueFrame();
	ViewChoixAdmin choixAdmin = new ViewChoixAdmin();
	ViewChoixModifAdmin choixModifAdmin = new ViewChoixModifAdmin();
	ViewConnexionAdministrateurFrame connexionAdministrateurFrame = new ViewConnexionAdministrateurFrame();
	ViewConnexionClientFrame connexionClientFrame = new ViewConnexionClientFrame();
	ViewDeclineResAdmin declineResAdmin = new ViewDeclineResAdmin();
	ViewDemanderReservationClient demanderReservationClient = new ViewDemanderReservationClient();
	ViewFrameAdmin frameAdmin = new ViewFrameAdmin();
	ViewFrameClient frameClient = new ViewFrameClient();
	ViewGestionChambre gestionChambre = new ViewGestionChambre();
	ViewGestionReservation gestionReservation = new ViewGestionReservation();
	ViewGestionReservationClient gestionReservationClient = new ViewGestionReservationClient();
	ViewInscriptionAdminFrame inscriptionAdminFrame = new ViewInscriptionAdminFrame();
	ViewInscriptionClientFrame inscriptionClientFrame = new ViewInscriptionClientFrame();
	ViewModifierReservationClient modifierReservationClient = new ViewModifierReservationClient();
	ViewSupprChambreAdmin supprChambreAdmin = new ViewSupprChambreAdmin();
	
	public Controler()
	{
		bienvenueFrame.clientButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e1) {
		    	frameClient.setVisible(true);
		    	bienvenueFrame.setVisible(false);
		    }
		});
		
		bienvenueFrame.adminButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	frameAdmin.setVisible(true);
		    	bienvenueFrame.setVisible(false);
		    }
		});
		
		frameClient.retourAccueilClient.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	frameClient.setVisible(false);
		    	bienvenueFrame.setVisible(true);		    	
		    }
		});
		
		frameClient.ClientconnectionButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e4) {
		    	connexionClientFrame.setVisible(true);
		    	frameClient.setVisible(false);
		    }
		});
		
		frameClient.ClientinscriptionButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e4) {
		    	inscriptionClientFrame.setVisible(true);
		    	frameClient.setVisible(false);
		    }
		});
		
		frameAdmin.adminconnectionButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e3) {
		    	connexionAdministrateurFrame.setVisible(true);
		    	frameAdmin.setVisible(false);
		    }
		});
		
		frameAdmin.admininscriptionButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e3) {
		    	inscriptionAdminFrame.setVisible(true);
		    	frameAdmin.setVisible(false);
		    }
		});
		
		frameAdmin.retourAccueilAdmin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	frameAdmin.setVisible(false);
		    	bienvenueFrame.setVisible(true);
		    }
		});

		choixAdmin.gestionChambreButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e5) {
		    	gestionChambre.setVisible(true);
		    	choixAdmin.setVisible(false);
		    }
		});
		
		choixAdmin.gestionReservationButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e6) {
		    	gestionReservation.setVisible(true);
		    	choixAdmin.setVisible(false);
		    }
		});
		
		choixAdmin.retourAccueilChoixAdmin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	choixAdmin.setVisible(false);
		    	bienvenueFrame.setVisible(true);
		    }
		});
		
		acceptResAdmin.acceptResAdminButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	if(hotel.accepterReservation(hotel.reservations,Integer.parseInt(acceptResAdmin.numeroacceptRes.getText()) )==true)
		    	{
		            JOptionPane.showMessageDialog(null, "La réservation "+Integer.parseInt(acceptResAdmin.numeroacceptRes.getText()) +" a été acceptée.", "Information", JOptionPane.INFORMATION_MESSAGE);
		            gestionReservation.setVisible(true);
			    	acceptResAdmin.setVisible(false);
		    	}
		    	else
		    	{
		            JOptionPane.showMessageDialog(null, "Erreur, la réservation n'a pas été acceptée", "Erreur", JOptionPane.ERROR_MESSAGE);
		            gestionReservation.setVisible(true);
			    	acceptResAdmin.setVisible(false);
		    	}
		    }
		});
		
		acceptResAdmin.retourAccueilacceptResAdmin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	acceptResAdmin.setVisible(false);
		    	choixAdmin.setVisible(true);
		    }
		});
		
		acceptResAdmin.retourMenuacceptRes.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	acceptResAdmin.setVisible(false);
		    	choixAdmin.setVisible(true);
		    }
		});
		
		annulerResClient.annulerResClientButton2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) { 	
		    		JOptionPane.showMessageDialog(null, "Vous avez annulé la suppression de votre réservation !", "Information", JOptionPane.INFORMATION_MESSAGE);
		    		annulerResClient.setVisible(false);
		    		gestionReservationClient.setVisible(true);
		    }
		});
		annulerResClient.retourAccueilannulerResClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
			annulerResClient.setVisible(false);
			bienvenueFrame.setVisible(true);
			}
		});
		annulerResClient.retourMenuannulerResClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
			annulerResClient.setVisible(false);
			gestionReservationClient.setVisible(true);
			}
		});

		choixModifAdmin.dispoChambreButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	if(hotel.modificationChambreDispo(hotel.chambres,Integer.parseInt(choixModifAdmin.numeroChambre.getText()))==true)
		    	{
		            JOptionPane.showMessageDialog(null, "La chambre a été rendue disponible.", "Information", JOptionPane.INFORMATION_MESSAGE);
		            gestionChambre.setVisible(true);
		            choixModifAdmin.setVisible(false);
		    	}
		    	else
		    	{
		            JOptionPane.showMessageDialog(null, "Erreur lors de la modification", "Erreur", JOptionPane.ERROR_MESSAGE);
		            gestionChambre.setVisible(true);
		            choixModifAdmin.setVisible(false);
		    	}
		    }
		});
		choixModifAdmin.nondispoReservationButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	if(hotel.modificationChambreNONDispo(hotel.chambres,Integer.parseInt(choixModifAdmin.numeroChambre.getText()))==true)
		    	{
		            JOptionPane.showMessageDialog(null, "La chambre a été rendue indisponible.", "Information", JOptionPane.INFORMATION_MESSAGE);
		            gestionChambre.setVisible(true);
		            choixModifAdmin.setVisible(false);
		    	}
		    	else
		    	{
		            JOptionPane.showMessageDialog(null, "Erreur lors de la modification", "Erreur", JOptionPane.ERROR_MESSAGE);
		            gestionChambre.setVisible(true);
		            choixModifAdmin.setVisible(false);
		    	}
		    }
		});
		choixModifAdmin.retourAccueilChambreAdmin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	choixModifAdmin.setVisible(false);
		    	bienvenueFrame.setVisible(true);
		    }
		});
		choixModifAdmin.retourMenuModifChambre.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	choixModifAdmin.setVisible(false);
		    	choixAdmin.setVisible(true);
		    }
		});

		connexionAdministrateurFrame.validerAdminButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e3) {
		    	String idAdmin = connexionAdministrateurFrame.identifiantAdminField.getText();
		    	if(hotel.connexionAdmin(idAdmin)==true)
		    	{
		    		String idActuel=idAdmin;
		    		choixAdmin.setVisible(true);
		    		connexionAdministrateurFrame.setVisible(false);
		    	}
		    	else 
		    	{
		    		JOptionPane.showMessageDialog(null, "Erreur lors de la connexion. Veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
		    	}
		    	}
		    	
		});
		
		connexionAdministrateurFrame.retourAccueilAdminConnexion.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	connexionAdministrateurFrame.setVisible(false);
		    	bienvenueFrame.setVisible(true);
		    }
		});

		connexionClientFrame.validerClientButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e3) {
				String idClient = connexionClientFrame.identifiantClientField.getText();
				if(hotel.connexionClient(idClient)==true)
				{
						String idActuel=idClient;
						gestionReservationClient.setVisible(true);
						connexionClientFrame.setVisible(false);
						demanderReservationClient.demanderReservationClientButton2.addActionListener(new ActionListener() {
						    public void actionPerformed(ActionEvent e2) {
						    	date dateDebut=null;
						    	date dateFin=null;
						    	try
						    	{
							    	dateDebut=new date(Integer.parseInt(demanderReservationClient.jourDebutField.getText()),Integer.parseInt(demanderReservationClient.moisDebutField.getText()),Integer.parseInt(demanderReservationClient.anneeDebutField.getText()));
							    	dateFin=new date(Integer.parseInt(demanderReservationClient.jourFinField.getText()),Integer.parseInt(demanderReservationClient.moisFinField.getText()),Integer.parseInt(demanderReservationClient.anneeFinField.getText()));
							    	VerifDate(dateDebut);
						    		VerifDate(dateFin);
						    		VerifDateReservation(dateDebut,dateFin);
						    	}
						    	catch(MyException e)
						    	{
						            JOptionPane.showMessageDialog(null, "Erreur, la date de la réservation est invalide", "Erreur", JOptionPane.ERROR_MESSAGE);
						            demanderReservationClient.setVisible(false);
						            gestionReservationClient.setVisible(true);
						            return;
						    	}
						    	if(hotel.verifClientReservation(hotel.reservations,idActuel)==true)
						    	{
						    		JOptionPane.showMessageDialog(null, "Erreur, la chambre n'a pas été réservée", "Erreur", JOptionPane.ERROR_MESSAGE);
						            demanderReservationClient.setVisible(false);
						            gestionReservationClient.setVisible(true);
						    	}
						    	else
						    	{
						    		if(hotel.effectuerDemandeReservation(hotel.chambres,hotel.reservations,Integer.parseInt(demanderReservationClient.numeroChambreDemande.getText()), idActuel, dateDebut, dateFin)==true)
							    	{
							            JOptionPane.showMessageDialog(null, "La chambre a été réservée", "Information", JOptionPane.INFORMATION_MESSAGE);
							            demanderReservationClient.setVisible(false);
							            gestionReservationClient.setVisible(true);
							    	}
							    	else
							    	{
							            JOptionPane.showMessageDialog(null, "Erreur, la chambre n'a pas été réservée", "Erreur", JOptionPane.ERROR_MESSAGE);
							            demanderReservationClient.setVisible(false);
							            gestionReservationClient.setVisible(true);
							    	}
						    	}
						    	
						    }
						});
						
						gestionReservationClient.supprimerréservationClientButton.addActionListener(new ActionListener() {
						    public void actionPerformed(ActionEvent e2) {
						    	if(hotel.verifClientReservation(hotel.reservations, idActuel)==true)
						    	{
						    		JOptionPane.showMessageDialog(null, "Vous avez une réservation ! Confirmez sa suppression.", "Information", JOptionPane.INFORMATION_MESSAGE);
						    		annulerResClient.setVisible(true);
						    		gestionReservationClient.setVisible(false);
						    	}
						    	else
						    	{
						            JOptionPane.showMessageDialog(null, "Erreur, vous n'avez pas de réservation.", "Erreur", JOptionPane.ERROR_MESSAGE);
						    	}
						    }
						});
						
						annulerResClient.annulerResClientButton2.addActionListener(new ActionListener() {
						    public void actionPerformed(ActionEvent e2) { 	
						    		JOptionPane.showMessageDialog(null, "Vous avez annulé la suppression de votre réservation !", "Information", JOptionPane.INFORMATION_MESSAGE);
						    		annulerResClient.setVisible(false);
						    		gestionReservationClient.setVisible(true);
						    }
						});
						
						annulerResClient.annulerResClientButton1.addActionListener(new ActionListener() {
						    public void actionPerformed(ActionEvent e2) { 	
						    	if(hotel.annulerReservation(hotel.reservations,hotel.chambres, idClient)==true)
						    	{
						    		JOptionPane.showMessageDialog(null, "Vous avez annulé votre réservation !", "Information", JOptionPane.INFORMATION_MESSAGE);
						    		annulerResClient.setVisible(false);
						    		gestionReservationClient.setVisible(true);
						    	}
						    	else
						    	{
									JOptionPane.showMessageDialog(null, "La suppression de votre réservation a échoué", "Erreur", JOptionPane.ERROR_MESSAGE);
						    	}
						    	}
						});
						
						gestionReservationClient.modifierReservationClientButton.addActionListener(new ActionListener() {
					    public void actionPerformed(ActionEvent e2) {
					    	if(hotel.verifClientReservation(hotel.reservations, idActuel)==true)
					    	{
					    	date dateFinActuelle=hotel.datereservationactuelle(hotel.reservations, idClient);
					    	gestionReservationClient.setVisible(false);
					    	modifierReservationClient.setVisible(true);
				            JOptionPane.showMessageDialog(null, "Vous avez une réservation ! Sa date de fin actuelle est :\n \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t"+dateFinActuelle.getJour()+" / "+dateFinActuelle.getMois()+" / "+dateFinActuelle.getAnnee(), "Information", JOptionPane.INFORMATION_MESSAGE);
					    	}
					    	else
					    	{
					            JOptionPane.showMessageDialog(null, "Erreur, vous n'avez pas de réservation.", "Erreur", JOptionPane.ERROR_MESSAGE);
					    	}
					    	}
					});
						
						modifierReservationClient.modifierReservationClientButton2.addActionListener(new ActionListener() {
						    public void actionPerformed(ActionEvent e2) {
						    	date dateFinNouvelle=null;
						    	try
						    	{
							    	dateFinNouvelle=new date(Integer.parseInt(modifierReservationClient.nouveauJourFinField.getText()),Integer.parseInt(modifierReservationClient.nouveauMoisFinField.getText()),Integer.parseInt(modifierReservationClient.nouveauAnneeFinField.getText()));
							    	VerifDate(dateFinNouvelle);
							    	VerifDateReservation(hotel.datereservationactuelle(hotel.reservations, idActuel),dateFinNouvelle);
						    	}
						    	catch(MyException e)
						    	{
						            JOptionPane.showMessageDialog(null, "Erreur, date invalide", "Erreur", JOptionPane.ERROR_MESSAGE);
						            gestionReservationClient.setVisible(true);
							    	modifierReservationClient.setVisible(false);
							    	return;
						    	}
						    	if(hotel.modifierReservation(hotel.reservations, idActuel, dateFinNouvelle)==true)
						    	{
						    	gestionReservationClient.setVisible(true);
						    	modifierReservationClient.setVisible(false);
					            JOptionPane.showMessageDialog(null, "Réservation modifiée avec succès !", "Information", JOptionPane.INFORMATION_MESSAGE);
						    	}
						    	else
						    	{
						            JOptionPane.showMessageDialog(null, "Erreur, modification échouée", "Erreur", JOptionPane.ERROR_MESSAGE);
						            gestionReservationClient.setVisible(true);
							    	modifierReservationClient.setVisible(false);
						    	}
						    	}
						});
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Erreur lors de la connexion. Veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
				}
			});
		
		connexionClientFrame.retourAccueilClientConnexion.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	connexionClientFrame.setVisible(false);
		    	bienvenueFrame.setVisible(true);
		    }
		});
		
		supprChambreAdmin.supprChambreAdminButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	if(hotel.supprimerChambre(hotel.chambres,Integer.parseInt(supprChambreAdmin.numeroSupprChambre.getText()))==true)
		    	{
		        JOptionPane.showMessageDialog(null, "La chambre a été supprimée, le nombre de chambres restantes est : " + hotel.nbrChambre(hotel.chambres), "Information", JOptionPane.INFORMATION_MESSAGE);
		    	gestionChambre.setVisible(true);
		    	supprChambreAdmin.setVisible(false);
		    }
		    	else
		    	{
		            JOptionPane.showMessageDialog(null, "Erreur lors de la suppresion", "Erreur", JOptionPane.ERROR_MESSAGE);
		            gestionChambre.setVisible(true);
		            supprChambreAdmin.setVisible(false);
		    	}
		    }
		});
		supprChambreAdmin.retourAccueilSupprChambreAdmin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	supprChambreAdmin.setVisible(false);
		    	bienvenueFrame.setVisible(true);
		    }
		});
		supprChambreAdmin.retourMenuSupprChambre.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	supprChambreAdmin.setVisible(false);
		    	choixAdmin.setVisible(true);
		    }
		});
		
		modifierReservationClient.retourAccueilmodifierReservationClient.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	modifierReservationClient.setVisible(false);
		    	bienvenueFrame.setVisible(true);
		    }
		});
		modifierReservationClient.retourMenumodifierReservationClient.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e2) {
		    	modifierReservationClient.setVisible(false);
		    	gestionReservationClient.setVisible(true);
		    }
		});

		inscriptionClientFrame.inscriptionClientButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e3) {
				String nomClient = inscriptionClientFrame.inscriptionClientnomField.getText();
				try 
				{
					VerifValidNom(nomClient);
				}
				catch(MyException e)
				{
					JOptionPane.showMessageDialog(null, "Le nom que vous avez saisie est incorrecte, veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
					inscriptionAdminFrame.setVisible(false);	
					bienvenueFrame.setVisible(true);
		            return;
				}
				
				String prenomClient = inscriptionClientFrame.inscriptionClientprenomField.getText();
				try 
				{
					VerifValidNom(prenomClient);
				}
				catch(MyException e)
				{
					JOptionPane.showMessageDialog(null, "Le prénom que vous avez saisie est incorrecte, veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
					inscriptionAdminFrame.setVisible(false);	
					bienvenueFrame.setVisible(true);
		            return;
				}
				
				date dateNaissanceClient = null;
				try {
				dateNaissanceClient=new date(Integer.parseInt(inscriptionClientFrame.jourClientField.getText()),Integer.parseInt(inscriptionClientFrame.moisClientField.getText()),Integer.parseInt(inscriptionClientFrame.anneeClientField.getText()));
				VerifDateB(dateNaissanceClient);
				}
				catch(MyException e)
				{
					JOptionPane.showMessageDialog(null, "La date que vous avez saisie est incorrecte, veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
					inscriptionAdminFrame.setVisible(false);	
					bienvenueFrame.setVisible(true);
		            return;
				}
				
				String telClient = inscriptionClientFrame.inscriptionClienttelField.getText();
				try
				{
					VerifNumero(telClient);
				}
				catch(MyException e)
				{
					JOptionPane.showMessageDialog(null, "Le numéro que vous avez saisie est incorrecte, veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
					inscriptionAdminFrame.setVisible(false);	
					bienvenueFrame.setVisible(true);
		            return;
				}
				
				String emailClient = inscriptionClientFrame.inscriptionClientemailField.getText();
				try
				{
					VerifValidEmail(emailClient);
				}
				catch(MyException e)
				{
					JOptionPane.showMessageDialog(null, "L'email que vous avez saisie est incorrecte, veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
					inscriptionAdminFrame.setVisible(false);	
					bienvenueFrame.setVisible(true);
		            return;
				}
			if(hotel.créationClient(nomClient,prenomClient,dateNaissanceClient,telClient,emailClient)==true)
				{
					String idActuel="C."+nomClient+"."+prenomClient+"."+dateNaissanceClient.getAnnee();
					JOptionPane.showMessageDialog(null, "Inscription réussi votre identifiant est : " +idActuel , "Information", JOptionPane.INFORMATION_MESSAGE);
					gestionReservationClient.setVisible(true);
					inscriptionClientFrame.setVisible(false);	
					demanderReservationClient.demanderReservationClientButton2.addActionListener(new ActionListener() {
					    public void actionPerformed(ActionEvent e2) {
					    	date dateDebut=null;
					    	date dateFin=null;
					    	try
					    	{
						    	dateDebut=new date(Integer.parseInt(demanderReservationClient.jourDebutField.getText()),Integer.parseInt(demanderReservationClient.moisDebutField.getText()),Integer.parseInt(demanderReservationClient.anneeDebutField.getText()));
						    	dateFin=new date(Integer.parseInt(demanderReservationClient.jourFinField.getText()),Integer.parseInt(demanderReservationClient.moisFinField.getText()),Integer.parseInt(demanderReservationClient.anneeFinField.getText()));
						    	VerifDate(dateDebut);
					    		VerifDate(dateFin);
					    		VerifDateReservation(dateDebut,dateFin);
					    	}
					    	catch(MyException e)
					    	{
					            JOptionPane.showMessageDialog(null, "Erreur, la date de la réservation est invalide", "Erreur", JOptionPane.ERROR_MESSAGE);
					            demanderReservationClient.setVisible(false);
					            gestionReservationClient.setVisible(true);
					            return;
					    	}
					    	if(hotel.verifClientReservation(hotel.reservations,idActuel)==true)
					    	{
					    		JOptionPane.showMessageDialog(null, "Erreur, la chambre n'a pas été réservée", "Erreur", JOptionPane.ERROR_MESSAGE);
					            demanderReservationClient.setVisible(false);
					            gestionReservationClient.setVisible(true);
					    	}
					    	else {
					    	if(hotel.effectuerDemandeReservation(hotel.chambres,hotel.reservations,Integer.parseInt(demanderReservationClient.numeroChambreDemande.getText()), idActuel, dateDebut, dateFin)==true)
					    	{
					            JOptionPane.showMessageDialog(null, "La chambre a été réservée", "Information", JOptionPane.INFORMATION_MESSAGE);
					            demanderReservationClient.setVisible(false);
					            gestionReservationClient.setVisible(true);
					    	}
					    	else
					    	{
					            JOptionPane.showMessageDialog(null, "Erreur, la chambre n'a pas été réservée", "Erreur", JOptionPane.ERROR_MESSAGE);
					            demanderReservationClient.setVisible(false);
					            gestionReservationClient.setVisible(true);
					    	}}
					    }
					});
					
					gestionReservationClient.supprimerréservationClientButton.addActionListener(new ActionListener() {
					    public void actionPerformed(ActionEvent e2) {
					    	if(hotel.verifClientReservation(hotel.reservations, idActuel)==true)
					    	{
					    		JOptionPane.showMessageDialog(null, "Vous avez une réservation ! Confirmez sa suppression.", "Information", JOptionPane.INFORMATION_MESSAGE);
					    		annulerResClient.setVisible(true);
					    		gestionReservationClient.setVisible(false);
					    	}
					    	else
					    	{
					            JOptionPane.showMessageDialog(null, "Erreur, vous n'avez pas de réservation.", "Erreur", JOptionPane.ERROR_MESSAGE);
					    	}
					    }
					});
					
					annulerResClient.annulerResClientButton2.addActionListener(new ActionListener() {
					    public void actionPerformed(ActionEvent e2) { 	
					    		JOptionPane.showMessageDialog(null, "Vous avez annulé la suppression de votre réservation !", "Information", JOptionPane.INFORMATION_MESSAGE);
					    		annulerResClient.setVisible(false);
					    		gestionReservationClient.setVisible(true);
					    }
					});
					
					annulerResClient.annulerResClientButton1.addActionListener(new ActionListener() {
					    public void actionPerformed(ActionEvent e2) { 	
					    	if(hotel.annulerReservation(hotel.reservations,hotel.chambres, idActuel)==true)
					    	{
					    		JOptionPane.showMessageDialog(null, "Vous avez annulé votre réservation !", "Information", JOptionPane.INFORMATION_MESSAGE);
					    		annulerResClient.setVisible(false);
					    		gestionReservationClient.setVisible(true);
					    	}
					    	else
					    	{
								JOptionPane.showMessageDialog(null, "La suppression de votre réservation a échoué", "Erreur", JOptionPane.ERROR_MESSAGE);
					    	}
					    	}
					});
					
					gestionReservationClient.modifierReservationClientButton.addActionListener(new ActionListener() {
					    public void actionPerformed(ActionEvent e2) {
					    	if(hotel.verifClientReservation(hotel.reservations, idActuel)==true)
					    	{
					    	date dateFinActuelle=hotel.datereservationactuelle(hotel.reservations, idActuel);
					    	gestionReservationClient.setVisible(false);
					    	modifierReservationClient.setVisible(true);
				            JOptionPane.showMessageDialog(null, "Vous avez une réservation ! Sa date de fin actuelle est :\n \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t"+dateFinActuelle.getJour()+" / "+dateFinActuelle.getMois()+" / "+dateFinActuelle.getAnnee(), "Information", JOptionPane.INFORMATION_MESSAGE);
					    	}
					    	else
					    	{
					            JOptionPane.showMessageDialog(null, "Erreur, vous n'avez pas de réservation.", "Erreur", JOptionPane.ERROR_MESSAGE);
					    	}
					    	}
					});
					
					modifierReservationClient.modifierReservationClientButton2.addActionListener(new ActionListener() {
					    public void actionPerformed(ActionEvent e2) {
					    	date dateFinNouvelle=null;
					    	try
					    	{
						    	dateFinNouvelle=new date(Integer.parseInt(modifierReservationClient.nouveauJourFinField.getText()),Integer.parseInt(modifierReservationClient.nouveauMoisFinField.getText()),Integer.parseInt(modifierReservationClient.nouveauAnneeFinField.getText()));
						    	VerifDate(dateFinNouvelle);
						    	VerifDateReservation(hotel.datereservationactuelle(hotel.reservations, idActuel),dateFinNouvelle);
					    	}
					    	catch(MyException e)
					    	{
					            JOptionPane.showMessageDialog(null, "Erreur, date invalide", "Erreur", JOptionPane.ERROR_MESSAGE);
					            gestionReservationClient.setVisible(true);
						    	modifierReservationClient.setVisible(false);
						    	return;
					    	}
					    	if(hotel.modifierReservation(hotel.reservations, idActuel, dateFinNouvelle)==true)
					    	{
					    	gestionReservationClient.setVisible(true);
					    	modifierReservationClient.setVisible(false);
				            JOptionPane.showMessageDialog(null, "Réservation modifiée avec succès !", "Information", JOptionPane.INFORMATION_MESSAGE);
					    	}
					    	else
					    	{
					            JOptionPane.showMessageDialog(null, "Erreur, modification échouée", "Erreur", JOptionPane.ERROR_MESSAGE);
					            gestionReservationClient.setVisible(true);
						    	modifierReservationClient.setVisible(false);
					    	}
					    	}
					});
				}
			else
				{
					JOptionPane.showMessageDialog(null, "Erreur lors de la création du Client. Veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
					
			}});
		
			inscriptionClientFrame.retourAccueilClientInscription.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	inscriptionClientFrame.setVisible(false);
			    	bienvenueFrame.setVisible(true);
			    }
			});
			
			declineResAdmin.declineResAdminButton.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	if(hotel.refuserReservation(hotel.reservations,Integer.parseInt(declineResAdmin.numerodeclineRes.getText()) )==true)
			    	{
			            JOptionPane.showMessageDialog(null, "La réservation "+Integer.parseInt(acceptResAdmin.numeroacceptRes.getText()) +" a été déclinée.", "Information", JOptionPane.INFORMATION_MESSAGE);
			            declineResAdmin.setVisible(false);
				    	gestionReservation.setVisible(true);
			    	}
			    	else
			    	{
			            JOptionPane.showMessageDialog(null, "Erreur, la réservation n'a pas été déclinée", "Erreur", JOptionPane.ERROR_MESSAGE);
			            declineResAdmin.setVisible(false);
				    	gestionReservation.setVisible(true);
			    	}
			    }
			});
			declineResAdmin.retourAccueildeclineResAdmin.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	declineResAdmin.setVisible(false);
			    	choixAdmin.setVisible(true);
			    }
			});
			declineResAdmin.retourMenudeclineRes.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	declineResAdmin.setVisible(false);
			    	choixAdmin.setVisible(true);
			    }
			});
			
			gestionReservationClient.retourAccueilGestionReservationClient.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	gestionReservationClient.setVisible(false);
			    	bienvenueFrame.setVisible(true);
			    }
			});
			
			gestionChambre.creerChambreButton.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	if(hotel.ajoutChambre(hotel.chambres)==true)
			    	{
			            JOptionPane.showMessageDialog(null, "Une chambre a été ajoutée, son numéro est : "+hotel.nbrChambre(hotel.chambres), "Information", JOptionPane.INFORMATION_MESSAGE);
			    	}
			    	else
			    	{
			            JOptionPane.showMessageDialog(null, "Erreur lors de l'ajout de la chambre.", "Erreur", JOptionPane.ERROR_MESSAGE);
			    	}
			    }
			});
			gestionChambre.modifierChambreButton.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	if(hotel.nbrChambre(hotel.chambres)==0)
			    	{
			            JOptionPane.showMessageDialog(null, "Erreur, il n'y pas de chambres.", "Erreur", JOptionPane.ERROR_MESSAGE);

			    	}
			    	else
			    	{
				        JOptionPane.showMessageDialog(null, "Les chambres disponibles sont :"+hotel.chambreDispoString(hotel.chambres), "Information", JOptionPane.INFORMATION_MESSAGE);
				    	choixModifAdmin.setVisible(true);
				    	gestionChambre.setVisible(false);
			    	}
			    }
			});
			gestionChambre.supprimerChambreButton.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	if(hotel.nbrChambre(hotel.chambres)==0)
			    	{
			            JOptionPane.showMessageDialog(null, "Erreur, il n'y pas de chambres.", "Erreur", JOptionPane.ERROR_MESSAGE);

			    	}
			    	else
			    	{
				        JOptionPane.showMessageDialog(null, "Les chambres disponibles sont :"+hotel.chambreDispoString(hotel.chambres), "Information", JOptionPane.INFORMATION_MESSAGE);
				        supprChambreAdmin.setVisible(true);
				    	gestionChambre.setVisible(false);
			    	}
			    }
			});
			gestionChambre.retourAccueilGestionChambre.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	gestionChambre.setVisible(false);
			    	bienvenueFrame.setVisible(true);
			    }
			});
			gestionChambre.retourMenuGestionChambre.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	gestionChambre.setVisible(false);
			    	choixAdmin.setVisible(true);
			    }
			});
			
			gestionReservation.creerréservationButton.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	JOptionPane.showMessageDialog(null, "Le nombre de réservation : "+hotel.nombreReservation(hotel.reservations), "Information", JOptionPane.INFORMATION_MESSAGE);
			    }
			});
			gestionReservation.modifierréservationButton.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	if(hotel.nombreReservation(hotel.reservations)==0)
			    	{
			            JOptionPane.showMessageDialog(null, "Erreur, il n'y a pas de réservation.", "Erreur", JOptionPane.ERROR_MESSAGE);
			    	}
			    	else 
			    	{
			    	JOptionPane.showMessageDialog(null, "Les réservations en attentes sont : "+hotel.reservationAttenteString(hotel.reservations), "Information", JOptionPane.INFORMATION_MESSAGE);
			    	gestionReservation.setVisible(false);
			    	acceptResAdmin.setVisible(true);
			    	}
		    	}
			});
			gestionReservation.supprimerréservationButton.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	if(hotel.nombreReservation(hotel.reservations)==0)
			    	{
			            JOptionPane.showMessageDialog(null, "Erreur, il n'y a pas de réservation.", "Erreur", JOptionPane.ERROR_MESSAGE);
			    	}
			    	else 
			    	{
			    	JOptionPane.showMessageDialog(null, "Les réservations en attentes sont : "+hotel.reservationAttenteString(hotel.reservations), "Information", JOptionPane.INFORMATION_MESSAGE);
			    	gestionReservation.setVisible(false);
			    	declineResAdmin.setVisible(true);
			    	}
			    }
			});
			gestionReservation.retourAccueilGestionReservation.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	gestionReservation.setVisible(false);
			    	bienvenueFrame.setVisible(true);
			    }
			});
			gestionReservation.retourMenuGestionReservation.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	gestionReservation.setVisible(false);
			    	choixAdmin.setVisible(true);
			    }
			});
			
			gestionReservationClient.demanderReservationClientButton.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	gestionReservationClient.setVisible(false);
			    	demanderReservationClient.setVisible(true);
		            JOptionPane.showMessageDialog(null, "Les chambres disponibles sont : "+hotel.chambreDispoString(hotel.chambres), "Information", JOptionPane.INFORMATION_MESSAGE);
			    }
			});
			gestionReservationClient.retourAccueilGestionReservationClient.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	gestionReservationClient.setVisible(false);
			    	bienvenueFrame.setVisible(true);
			    }
			});
			inscriptionAdminFrame.inscriptionAdminButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e3) {
					String nomAdmin = inscriptionAdminFrame.inscriptionAdminnomField.getText();
					try 
					{
						VerifValidNom(nomAdmin);
					}
					catch(MyException e)
					{
						JOptionPane.showMessageDialog(null, "Le nom que vous avez saisie est incorrecte, veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
						inscriptionAdminFrame.setVisible(false);	
						bienvenueFrame.setVisible(true);
			            return;
					}
					
					String prenomAdmin = inscriptionAdminFrame.inscriptionAdminprenomField.getText();
					try 
					{
						VerifValidNom(prenomAdmin);
					}
					catch(MyException e)
					{
						JOptionPane.showMessageDialog(null, "Le prénom que vous avez saisie est incorrecte, veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
						inscriptionAdminFrame.setVisible(false);	
						bienvenueFrame.setVisible(true);
			            return;
					}
					
					date dateNaissanceAdmin = null;
					try {
					dateNaissanceAdmin = new date(Integer.parseInt(inscriptionAdminFrame.jourAdminField.getText()),Integer.parseInt(inscriptionAdminFrame.moisAdminField.getText()),Integer.parseInt(inscriptionAdminFrame.anneeAdminField.getText()));
					VerifDateB(dateNaissanceAdmin);
					}
					catch(MyException e)
					{
						JOptionPane.showMessageDialog(null, "La date que vous avez saisie est incorrecte, veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
						inscriptionAdminFrame.setVisible(false);	
						bienvenueFrame.setVisible(true);
			            return;
					}	
					
					String telAdmin = inscriptionAdminFrame.inscriptionAdmintelField.getText();
					try
					{
						VerifNumero(telAdmin);
					}
					catch(MyException e)
					{
						JOptionPane.showMessageDialog(null, "Le numéro que vous avez saisie est incorrecte, veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
						inscriptionAdminFrame.setVisible(false);	
						bienvenueFrame.setVisible(true);
			            return;
					}
					
					String emailAdmin = inscriptionAdminFrame.inscriptionAdminemailField.getText();
					try
					{
						VerifValidEmail(emailAdmin);
					}
					catch(MyException e)
					{
						JOptionPane.showMessageDialog(null, "L'email que vous avez saisie est incorrecte, veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
						inscriptionAdminFrame.setVisible(false);	
						bienvenueFrame.setVisible(true);
			            return;
					}
					if(hotel.créationAdmin(nomAdmin,prenomAdmin,dateNaissanceAdmin,telAdmin,emailAdmin)==true)
						{
						String id="A."+nomAdmin+"."+prenomAdmin+"."+dateNaissanceAdmin.getAnnee();
						String idActuel=id;
						JOptionPane.showMessageDialog(null, "Inscription réussi votre identifiant est : " +idActuel , "Information", JOptionPane.INFORMATION_MESSAGE);
						choixAdmin.setVisible(true);
						inscriptionAdminFrame.setVisible(false);	
						
						    }
						else
						{
						JOptionPane.showMessageDialog(null, "Erreur lors de la création de l'Administrateur. Veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
						}
				}});
			inscriptionAdminFrame.retourAccueilAdminInscription.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	inscriptionAdminFrame.setVisible(false);
			    	bienvenueFrame.setVisible(true);
			    }
			});
			
			demanderReservationClient.retourAccueildemanderReservationClient.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	demanderReservationClient.setVisible(false);
			    	bienvenueFrame.setVisible(true);
			    }
			});
			
			demanderReservationClient.retourMenudemanderReservationClient.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e2) {
			    	demanderReservationClient.setVisible(false);
			    	gestionReservationClient.setVisible(true);
			    }
			});
			

	}
	static void VerifNumero(String num) throws MyException
	{
		if(num.length()==10)
		{
			if(num.matches("[0-9]+"))
			{
				if(num.substring(0, 2).equals("06") || num.substring(0, 2).equals("07") || num.substring(0, 2).equals("05") )
				{
					
				}
				else
				{
					throw new MyException("Le numéro de téléphone que vous avez saisi est incorrecte");
				}
			}
			else
			{
				throw new MyException("Le numéro de téléphone que vous avez saisi est incorrecte");
			}
		}
		else
		{
			throw new MyException("Le numéro de téléphone que vous avez saisi est incorrecte");
		}
	}

	static void VerifDate(date madate) throws MyException
	{
		if (madate.getMois() < 1 || madate.getMois() > 12) {
            throw new MyException("Mois invalide.");
        }
        if (madate.getJour() < 1 || madate.getJour() > madate.getNombreJoursDansMois(madate.getMois(), madate.getAnnee())) {
            throw new MyException("Jour invalide pour le mois et l'année donnés.");
        }
        if (madate.getAnnee() < 2024 || madate.getAnnee()>2050) {
            throw new MyException("Année invalide.");
        }
	}

	static void VerifValidNom(String nom) throws MyException
	{
		if(nom.isEmpty() || !nom.matches("^[a-zA-Z]+$"))
		{
			throw new MyException("Nom/Prenom invalide.");
		}
	}

	static void VerifValidEmail(String nom) throws MyException
	{
		if(nom.isEmpty() || !nom.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"))
		{
			throw new MyException("Email invalide.");
		}
	}
	static boolean VerifDateBool(date madate) 
	{
		if (madate.getMois() < 1 || madate.getMois() > 12) {
			return false;        
		}
        if (madate.getJour() < 1 || madate.getJour() > madate.getNombreJoursDansMois(madate.getMois(), madate.getAnnee())) {
			return false;        
        }
        if (madate.getAnnee() <= 2024 || madate.getAnnee()>2050) {
			return false;        
        }
        return true;
	}
	
	static void VerifDateReservation(date dateDebut,date dateFin) throws MyException
	{
		if(VerifDateBool(dateDebut) && VerifDateBool(dateFin))
		{
			if(dateDebut.getAnnee()>dateFin.getAnnee())
			{
				throw new MyException("Dates invalides!");
			}
			else
			{
				if(dateDebut.getAnnee()==dateFin.getAnnee())
				{
					if(dateDebut.getMois()>dateFin.getMois())
					{
						throw new MyException("Dates invalides!");
					}
					else
					{
						if(dateDebut.getMois()==dateFin.getMois())
						{
							if(dateDebut.getJour()>=dateFin.getJour())
							{
								throw new MyException("Dates invalides!");
							}
					
						}
					}
				}
			}
			
		}
	}
	
	static void VerifDateB(date madate) throws MyException
	{
		if (madate.getMois() < 1 || madate.getMois() > 12) {
            throw new MyException("Mois invalide.");
        }
        if (madate.getJour() < 1 || madate.getJour() > madate.getNombreJoursDansMois(madate.getMois(), madate.getAnnee())) {
            throw new MyException("Jour invalide pour le mois et l'année donnés.");
        }
        if (madate.getAnnee() < 1900 || madate.getAnnee()>2024) {
            throw new MyException("Année invalide.");
        }
	}
	
}
