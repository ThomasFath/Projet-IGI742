import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.Label;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
// Fenetre associe au system
public class Fenetre_system extends JFrame {
	private JTextField LoginCo;
	private JTextField NomIns;
	private JTextField PrenomIns;
	private JTextField EmailIns;
	private JTextField NumEtuIns;
	private JTextField NumTelIns;
	private JPasswordField MdpCo;
	private JTextField LoginIns;
	private JPasswordField Mdp1;
	private JPasswordField Mdp2;
	private SystemPartage s1;
	
// Constructeur fenetre	
	public Fenetre_system(SystemPartage S) {	
			s1=S;
			setResizable(false);
			setSize(542, 489);
			SpringLayout springLayout = new SpringLayout();
			getContentPane().setLayout(springLayout);
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 10, SpringLayout.NORTH, getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 75, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, -51, SpringLayout.SOUTH, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, tabbedPane, 448, SpringLayout.WEST, getContentPane());
			this.setTitle("Serveur de connexion");
			getContentPane().add(tabbedPane);
/////////////////////////////////// Partie graphique connexion ////////////////////////////////////////////////////	
			JPanel Conexion = new JPanel();
			tabbedPane.addTab("Connexion", null, Conexion, null);
			SpringLayout sl_Conexion = new SpringLayout();
			Conexion.setLayout(sl_Conexion);
			JLabel lblLogin = new JLabel("Login :");
			Conexion.add(lblLogin);
			
			JLabel lblMotDePasse = new JLabel("Mot de passe :");
			sl_Conexion.putConstraint(SpringLayout.WEST, lblLogin, 0, SpringLayout.WEST, lblMotDePasse);
			sl_Conexion.putConstraint(SpringLayout.WEST, lblMotDePasse, 62, SpringLayout.WEST, Conexion);
			sl_Conexion.putConstraint(SpringLayout.EAST, lblMotDePasse, -193, SpringLayout.EAST, Conexion);
			Conexion.add(lblMotDePasse);
			
			LoginCo = new JTextField();
			sl_Conexion.putConstraint(SpringLayout.NORTH, lblLogin, 2, SpringLayout.NORTH, LoginCo);
			sl_Conexion.putConstraint(SpringLayout.NORTH, LoginCo, 109, SpringLayout.NORTH, Conexion);
			Conexion.add(LoginCo);
			LoginCo.setColumns(10);
			
			JButton btnConnexion = new JButton("Connexion");
			sl_Conexion.putConstraint(SpringLayout.NORTH, btnConnexion, 192, SpringLayout.NORTH, Conexion);
			sl_Conexion.putConstraint(SpringLayout.WEST, btnConnexion, 113, SpringLayout.WEST, Conexion);
			sl_Conexion.putConstraint(SpringLayout.SOUTH, btnConnexion, -122, SpringLayout.SOUTH, Conexion);
			sl_Conexion.putConstraint(SpringLayout.EAST, btnConnexion, -118, SpringLayout.EAST, Conexion);
			Conexion.add(btnConnexion);
			
			MdpCo = new JPasswordField();
			sl_Conexion.putConstraint(SpringLayout.NORTH, lblMotDePasse, 3, SpringLayout.NORTH, MdpCo);
			sl_Conexion.putConstraint(SpringLayout.WEST, LoginCo, 0, SpringLayout.WEST, MdpCo);
			sl_Conexion.putConstraint(SpringLayout.SOUTH, LoginCo, -19, SpringLayout.NORTH, MdpCo);
			sl_Conexion.putConstraint(SpringLayout.EAST, LoginCo, 0, SpringLayout.EAST, MdpCo);
			sl_Conexion.putConstraint(SpringLayout.WEST, MdpCo, 205, SpringLayout.WEST, Conexion);
			sl_Conexion.putConstraint(SpringLayout.SOUTH, MdpCo, -23, SpringLayout.NORTH, btnConnexion);
			sl_Conexion.putConstraint(SpringLayout.EAST, MdpCo, -75, SpringLayout.EAST, Conexion);
			Conexion.add(MdpCo);
			
			JLabel MessageCo = new JLabel("");
			sl_Conexion.putConstraint(SpringLayout.WEST, MessageCo, 39, SpringLayout.WEST, Conexion);
			sl_Conexion.putConstraint(SpringLayout.SOUTH, MessageCo, -19, SpringLayout.NORTH, lblLogin);
			MessageCo.setForeground(Color.RED);
			MessageCo.setFont(new Font("AR JULIAN", Font.PLAIN, 24));
			Conexion.add(MessageCo);
			
////////////////////////// Partie graphique /////////////////////////////////////////////////////////////////		
			JPanel Inscription = new JPanel();
			tabbedPane.addTab("Inscription", null, Inscription, null);
			SpringLayout sl_Inscription = new SpringLayout();
			Inscription.setLayout(sl_Inscription);
			
			JButton btnInscription = new JButton("Inscription");
			sl_Inscription.putConstraint(SpringLayout.SOUTH, btnInscription, -10, SpringLayout.SOUTH, Inscription);
			sl_Inscription.putConstraint(SpringLayout.EAST, btnInscription, -81, SpringLayout.EAST, Inscription);
			Inscription.add(btnInscription);
			
			NomIns = new JTextField();
			Inscription.add(NomIns);
			NomIns.setColumns(10);
			
			PrenomIns = new JTextField();
			sl_Inscription.putConstraint(SpringLayout.WEST, PrenomIns, 156, SpringLayout.WEST, Inscription);
			sl_Inscription.putConstraint(SpringLayout.SOUTH, NomIns, -6, SpringLayout.NORTH, PrenomIns);
			sl_Inscription.putConstraint(SpringLayout.EAST, NomIns, 0, SpringLayout.EAST, PrenomIns);
			sl_Inscription.putConstraint(SpringLayout.NORTH, PrenomIns, 98, SpringLayout.NORTH, Inscription);
			PrenomIns.setColumns(10);
			Inscription.add(PrenomIns);
			
			EmailIns = new JTextField();
			sl_Inscription.putConstraint(SpringLayout.NORTH, EmailIns, 124, SpringLayout.NORTH, Inscription);
			sl_Inscription.putConstraint(SpringLayout.SOUTH, EmailIns, -217, SpringLayout.SOUTH, Inscription);
			sl_Inscription.putConstraint(SpringLayout.SOUTH, PrenomIns, -6, SpringLayout.NORTH, EmailIns);
			EmailIns.setColumns(10);
			Inscription.add(EmailIns);
			
			NumEtuIns = new JTextField();
			sl_Inscription.putConstraint(SpringLayout.NORTH, NumEtuIns, 7, SpringLayout.SOUTH, EmailIns);
			sl_Inscription.putConstraint(SpringLayout.WEST, NumEtuIns, 0, SpringLayout.WEST, NomIns);
			sl_Inscription.putConstraint(SpringLayout.EAST, NumEtuIns, 0, SpringLayout.EAST, NomIns);
			Inscription.add(NumEtuIns);
			NumEtuIns.setColumns(10);
			
			NumTelIns = new JTextField();
			sl_Inscription.putConstraint(SpringLayout.SOUTH, NumEtuIns, -8, SpringLayout.NORTH, NumTelIns);
			sl_Inscription.putConstraint(SpringLayout.NORTH, NumTelIns, 183, SpringLayout.NORTH, Inscription);
			sl_Inscription.putConstraint(SpringLayout.EAST, NumTelIns, 0, SpringLayout.EAST, NomIns);
			NumTelIns.setColumns(10);
			Inscription.add(NumTelIns);
			
			JLabel lblDescription = new JLabel("Description :");
			Inscription.add(lblDescription);
			
			JLabel lblPrenom = new JLabel("Prenom :");
			sl_Inscription.putConstraint(SpringLayout.WEST, lblPrenom, 32, SpringLayout.WEST, Inscription);
			sl_Inscription.putConstraint(SpringLayout.EAST, lblPrenom, -21, SpringLayout.WEST, PrenomIns);
			sl_Inscription.putConstraint(SpringLayout.WEST, lblDescription, 0, SpringLayout.WEST, lblPrenom);
			sl_Inscription.putConstraint(SpringLayout.NORTH, lblPrenom, 2, SpringLayout.NORTH, PrenomIns);
			Inscription.add(lblPrenom);
			
			JLabel lblNumeroEtudiant = new JLabel("Numero Etudiant :");
			sl_Inscription.putConstraint(SpringLayout.EAST, lblNumeroEtudiant, 0, SpringLayout.EAST, lblPrenom);
			Inscription.add(lblNumeroEtudiant);
			
			JLabel lblNumeroTelephone = new JLabel("Numero Telephone :");
			sl_Inscription.putConstraint(SpringLayout.NORTH, lblNumeroTelephone, 125, SpringLayout.NORTH, Inscription);
			sl_Inscription.putConstraint(SpringLayout.SOUTH, lblNumeroTelephone, -248, SpringLayout.SOUTH, Inscription);
			sl_Inscription.putConstraint(SpringLayout.WEST, EmailIns, 6, SpringLayout.EAST, lblNumeroTelephone);
			sl_Inscription.putConstraint(SpringLayout.WEST, lblNumeroTelephone, 49, SpringLayout.WEST, Inscription);
			sl_Inscription.putConstraint(SpringLayout.EAST, lblNumeroTelephone, -218, SpringLayout.EAST, Inscription);
			Inscription.add(lblNumeroTelephone);
			
			JLabel lblMotDePasse_1 = new JLabel("Mot de passe :");
			sl_Inscription.putConstraint(SpringLayout.WEST, lblMotDePasse_1, 0, SpringLayout.WEST, lblDescription);
			Inscription.add(lblMotDePasse_1);
			
			JLabel lblRetaperMdp = new JLabel("Retaper mdp :");
			sl_Inscription.putConstraint(SpringLayout.WEST, lblRetaperMdp, 0, SpringLayout.WEST, lblDescription);
			Inscription.add(lblRetaperMdp);
			
			JTextArea DescripInsPane = new JTextArea();
			sl_Inscription.putConstraint(SpringLayout.NORTH, lblDescription, 3, SpringLayout.NORTH, DescripInsPane);
			sl_Inscription.putConstraint(SpringLayout.EAST, lblDescription, -35, SpringLayout.WEST, DescripInsPane);
			sl_Inscription.putConstraint(SpringLayout.NORTH, DescripInsPane, 267, SpringLayout.NORTH, Inscription);
			sl_Inscription.putConstraint(SpringLayout.WEST, DescripInsPane, 158, SpringLayout.WEST, Inscription);
			sl_Inscription.putConstraint(SpringLayout.SOUTH, DescripInsPane, -6, SpringLayout.NORTH, btnInscription);
			sl_Inscription.putConstraint(SpringLayout.EAST, DescripInsPane, -29, SpringLayout.EAST, Inscription);
			Inscription.add(DescripInsPane);
			
			JLabel lblNumeroTelephone_1 = new JLabel("Numero Telephone :");
			sl_Inscription.putConstraint(SpringLayout.NORTH, lblNumeroTelephone_1, 184, SpringLayout.NORTH, Inscription);
			sl_Inscription.putConstraint(SpringLayout.SOUTH, lblNumeroEtudiant, -12, SpringLayout.NORTH, lblNumeroTelephone_1);
			sl_Inscription.putConstraint(SpringLayout.NORTH, lblMotDePasse_1, 9, SpringLayout.SOUTH, lblNumeroTelephone_1);
			sl_Inscription.putConstraint(SpringLayout.WEST, lblNumeroTelephone_1, 0, SpringLayout.WEST, lblDescription);
			Inscription.add(lblNumeroTelephone_1);
			
			JLabel lblEmail = new JLabel("Email :");
			sl_Inscription.putConstraint(SpringLayout.NORTH, lblNumeroEtudiant, 15, SpringLayout.SOUTH, lblEmail);
			sl_Inscription.putConstraint(SpringLayout.NORTH, lblEmail, 3, SpringLayout.NORTH, EmailIns);
			sl_Inscription.putConstraint(SpringLayout.WEST, lblEmail, 0, SpringLayout.WEST, lblDescription);
			Inscription.add(lblEmail);
			
			JLabel lblNom = new JLabel("Nom :");
			sl_Inscription.putConstraint(SpringLayout.NORTH, lblNom, 0, SpringLayout.NORTH, NomIns);
			sl_Inscription.putConstraint(SpringLayout.WEST, lblNom, 32, SpringLayout.WEST, Inscription);
			Inscription.add(lblNom);
			
			LoginIns = new JTextField();
			sl_Inscription.putConstraint(SpringLayout.WEST, LoginIns, 0, SpringLayout.WEST, NomIns);
			sl_Inscription.putConstraint(SpringLayout.SOUTH, LoginIns, -6, SpringLayout.NORTH, NomIns);
			LoginIns.setColumns(10);
			Inscription.add(LoginIns);
			
			JLabel lblLogin_1 = new JLabel("Login :");
			sl_Inscription.putConstraint(SpringLayout.NORTH, lblLogin_1, 0, SpringLayout.NORTH, LoginIns);
			sl_Inscription.putConstraint(SpringLayout.WEST, lblLogin_1, 32, SpringLayout.WEST, Inscription);
			Inscription.add(lblLogin_1);
			
			JLabel MessageIns = new JLabel("MessageIns");
			sl_Inscription.putConstraint(SpringLayout.NORTH, MessageIns, 10, SpringLayout.NORTH, Inscription);
			sl_Inscription.putConstraint(SpringLayout.WEST, MessageIns, 0, SpringLayout.WEST, lblNumeroTelephone);
			MessageIns.setFont(new Font("AR JULIAN", Font.PLAIN, 16));
			MessageIns.setForeground(Color.RED);
			Inscription.add(MessageIns);
			
			Mdp1 = new JPasswordField();
			sl_Inscription.putConstraint(SpringLayout.SOUTH, NumTelIns, -6, SpringLayout.NORTH, Mdp1);
			sl_Inscription.putConstraint(SpringLayout.EAST, lblMotDePasse_1, -29, SpringLayout.WEST, Mdp1);
			sl_Inscription.putConstraint(SpringLayout.WEST, Mdp1, 0, SpringLayout.WEST, NomIns);
			sl_Inscription.putConstraint(SpringLayout.EAST, Mdp1, 0, SpringLayout.EAST, NomIns);
			Inscription.add(Mdp1);
			
			Mdp2 = new JPasswordField();
			sl_Inscription.putConstraint(SpringLayout.NORTH, lblRetaperMdp, 3, SpringLayout.NORTH, Mdp2);
			sl_Inscription.putConstraint(SpringLayout.SOUTH, Mdp1, -6, SpringLayout.NORTH, Mdp2);
			sl_Inscription.putConstraint(SpringLayout.WEST, Mdp2, 0, SpringLayout.WEST, NomIns);
			sl_Inscription.putConstraint(SpringLayout.SOUTH, Mdp2, -6, SpringLayout.NORTH, DescripInsPane);
			sl_Inscription.putConstraint(SpringLayout.EAST, Mdp2, 0, SpringLayout.EAST, NomIns);
			Inscription.add(Mdp2);
			MessageIns.setVisible(false);
			
////////////////////////// Action appui sur bouton Inscription ///////////////////////////////////////
			btnInscription.addActionListener(new ActionListener() {		
				public void actionPerformed(ActionEvent arg0) {	
					String etat = s1.incription(					// recuperartion valeur label
							LoginIns.getText(),
							NomIns.getText(),
							PrenomIns.getText(),
							EmailIns.getText(),
							NumEtuIns.getText(),
							NumTelIns.getText(),
							Mdp1.getText(),
							Mdp2.getText(),
							DescripInsPane.getText()
							)	;	
					if(etat.equals("Reussite")){					// Si inscription valide par le systeme	
						 MessageIns.setVisible(true);
						 MessageIns.setText("Insciption reussite");
						 MessageIns.setForeground(Color.BLACK);
						 LoginIns.setText(null);		
						 NomIns.setText(null) ;
						 PrenomIns.setText(null);
						 EmailIns.setText(null);
						 NumEtuIns.setText(null);
						 NumTelIns.setText(null);
						 Mdp1.setText(null);
						 Mdp2.setText(null);
						 DescripInsPane.setText(" "); 
					}
					else if(etat.equals("ExisteDeja")){				// Si login deja existant
						MessageIns.setForeground(Color.RED);
						MessageIns.setText("Profil deja existant");
						MessageIns.setVisible(true);
					}
					else if(etat.equals("ChampsManquants")){		// Si inscription incomplete
						MessageIns.setForeground(Color.RED);
						MessageIns.setText("Tous les champs sont obligatoire");
						MessageIns.setVisible(true);
					}
					else if(etat.equals("MDPIncorrect")){			// Si erreur dans la confirmatin des deux mots de passe
						MessageIns.setForeground(Color.RED);
						MessageIns.setText("Mot de passe incorrect");
						MessageIns.setVisible(true);
					}
					}
				});
		
//////////////////////////Action appui sur bouton Connexion  ///////////////////////////////////////	
				btnConnexion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						 String etat = s1.connexion(LoginCo.getText(), MdpCo.getText());
						 if(etat=="Connexion"){							// Si login et mot de passe confirme par le systeme
								 Inscription.disable();
								 Inscription.invalidate();
								 MessageCo.setForeground(Color.BLACK);
								 MessageCo.setText("Vous etes connecte : "+LoginCo.getText());
								 MessageCo.setVisible(true);
								 LoginCo.setText(null);
								 MdpCo.setText(null);
								  }
							 else if (etat=="Erreur"){					// Si erreur de connexion
									 MessageCo.setText("Erreur de connexion");
									 MessageCo.setForeground(Color.RED);
									 MessageCo.setVisible(true);
								 }
							 }
				});
	}
// Getter utile	
	public SystemPartage getSystem(){
		return s1;
	}
}
