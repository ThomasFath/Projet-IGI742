import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class Fenetre_system extends JFrame {

	private JPanel contentPane;
	private JTextField LoginTf;
	private JTextField NomIns;
	private JTextField PrenomIns;
	private JTextField EmailIns;
	private JTextField NumEtuIns;
	private JTextField NumTelIns;
	private JTextField Mdp1;
	private JTextField Mdp2;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre_system frame = new Fenetre_system();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fenetre_system() {
			
			setResizable(false);
			
			
			setSize(1124, 832);
			SpringLayout springLayout = new SpringLayout();
			
			getContentPane().setLayout(springLayout);
			
			JList list = new JList();
			springLayout.putConstraint(SpringLayout.NORTH, list, 57, SpringLayout.NORTH, getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, list, 561, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, list, -437, SpringLayout.SOUTH, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, list, -21, SpringLayout.EAST, getContentPane());
			getContentPane().add(list);
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 10, SpringLayout.NORTH, getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 75, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, -396, SpringLayout.SOUTH, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, tabbedPane, 448, SpringLayout.WEST, getContentPane());
			getContentPane().add(tabbedPane);
			
			JPanel Inscriptionl = new JPanel();
			tabbedPane.addTab("Inscription", null, Inscriptionl, null);
			SpringLayout sl_Inscriptionl = new SpringLayout();
			Inscriptionl.setLayout(sl_Inscriptionl);
			
			JButton btnInscription = new JButton("Inscription");
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, btnInscription, -10, SpringLayout.SOUTH, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.EAST, btnInscription, -81, SpringLayout.EAST, Inscriptionl);
			Inscriptionl.add(btnInscription);
			
			NomIns = new JTextField();
			Inscriptionl.add(NomIns);
			NomIns.setColumns(10);
			
			PrenomIns = new JTextField();
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, PrenomIns, 44, SpringLayout.NORTH, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, PrenomIns, 156, SpringLayout.WEST, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, NomIns, -6, SpringLayout.NORTH, PrenomIns);
			sl_Inscriptionl.putConstraint(SpringLayout.EAST, NomIns, 0, SpringLayout.EAST, PrenomIns);
			PrenomIns.setColumns(10);
			Inscriptionl.add(PrenomIns);
			
			EmailIns = new JTextField();
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, EmailIns, 70, SpringLayout.NORTH, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, PrenomIns, -6, SpringLayout.NORTH, EmailIns);
			EmailIns.setColumns(10);
			Inscriptionl.add(EmailIns);
			
			NumEtuIns = new JTextField();
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, EmailIns, -6, SpringLayout.NORTH, NumEtuIns);
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, NumEtuIns, 96, SpringLayout.NORTH, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, NumEtuIns, 0, SpringLayout.WEST, NomIns);
			sl_Inscriptionl.putConstraint(SpringLayout.EAST, NumEtuIns, -126, SpringLayout.EAST, Inscriptionl);
			Inscriptionl.add(NumEtuIns);
			NumEtuIns.setColumns(10);
			
			NumTelIns = new JTextField();
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, NumTelIns, 6, SpringLayout.SOUTH, NumEtuIns);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, NumTelIns, 156, SpringLayout.WEST, Inscriptionl);
			NumTelIns.setColumns(10);
			Inscriptionl.add(NumTelIns);
			
			Mdp1 = new JTextField();
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, NumTelIns, -7, SpringLayout.NORTH, Mdp1);
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, Mdp1, 149, SpringLayout.NORTH, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, Mdp1, 0, SpringLayout.WEST, NomIns);
			sl_Inscriptionl.putConstraint(SpringLayout.EAST, Mdp1, -126, SpringLayout.EAST, Inscriptionl);
			Mdp1.setColumns(10);
			Inscriptionl.add(Mdp1);
			
			Mdp2 = new JTextField();
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, Mdp2, 5, SpringLayout.SOUTH, Mdp1);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, Mdp2, 0, SpringLayout.WEST, NomIns);
			sl_Inscriptionl.putConstraint(SpringLayout.EAST, Mdp2, -126, SpringLayout.EAST, Inscriptionl);
			Mdp2.setColumns(10);
			Inscriptionl.add(Mdp2);
			
			JTextPane textPane = new JTextPane();
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, Mdp2, -6, SpringLayout.NORTH, textPane);
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, textPane, 200, SpringLayout.NORTH, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, textPane, -11, SpringLayout.NORTH, btnInscription);
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, Mdp1, -31, SpringLayout.NORTH, textPane);
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, NumEtuIns, -84, SpringLayout.NORTH, textPane);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, textPane, -70, SpringLayout.WEST, btnInscription);
			sl_Inscriptionl.putConstraint(SpringLayout.EAST, textPane, -26, SpringLayout.EAST, Inscriptionl);
			Inscriptionl.add(textPane);
			
			JLabel lblDescription = new JLabel("Description :");
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, lblDescription, 0, SpringLayout.NORTH, textPane);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, lblDescription, 49, SpringLayout.WEST, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.EAST, lblDescription, -6, SpringLayout.WEST, textPane);
			Inscriptionl.add(lblDescription);
			
			JLabel lblNom = new JLabel("Nom :");
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, lblNom, 19, SpringLayout.NORTH, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, lblNom, 49, SpringLayout.WEST, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.EAST, lblNom, -54, SpringLayout.WEST, NomIns);
			Inscriptionl.add(lblNom);
			
			JLabel lblPrenom = new JLabel("Prenom :");
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, lblNom, -10, SpringLayout.NORTH, lblPrenom);
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, lblPrenom, 3, SpringLayout.NORTH, PrenomIns);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, lblPrenom, 47, SpringLayout.WEST, Inscriptionl);
			Inscriptionl.add(lblPrenom);
			
			JLabel lblEmail = new JLabel("Email :");
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, lblEmail, 46, SpringLayout.WEST, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.EAST, lblEmail, -266, SpringLayout.EAST, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, EmailIns, 54, SpringLayout.EAST, lblEmail);
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, lblEmail, 3, SpringLayout.NORTH, EmailIns);
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, lblEmail, -113, SpringLayout.NORTH, textPane);
			Inscriptionl.add(lblEmail);
			
			JLabel lblNumeroEtudiant = new JLabel("Numero Etudiant :");
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, lblNumeroEtudiant, 12, SpringLayout.SOUTH, lblEmail);
			sl_Inscriptionl.putConstraint(SpringLayout.EAST, lblPrenom, 0, SpringLayout.EAST, lblNumeroEtudiant);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, lblNumeroEtudiant, 46, SpringLayout.WEST, Inscriptionl);
			Inscriptionl.add(lblNumeroEtudiant);
			
			JLabel lblNumeroTelephone = new JLabel("Numero Telephone :");
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, lblNumeroEtudiant, -12, SpringLayout.NORTH, lblNumeroTelephone);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, lblNumeroTelephone, 49, SpringLayout.WEST, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, lblNumeroTelephone, 3, SpringLayout.NORTH, NumTelIns);
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, lblNumeroTelephone, -61, SpringLayout.NORTH, textPane);
			sl_Inscriptionl.putConstraint(SpringLayout.EAST, lblNumeroTelephone, -6, SpringLayout.WEST, NumTelIns);
			Inscriptionl.add(lblNumeroTelephone);
			
			JLabel lblMotDePasse_1 = new JLabel("Mot de passe :");
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, lblMotDePasse_1, 13, SpringLayout.SOUTH, lblNumeroTelephone);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, lblMotDePasse_1, 46, SpringLayout.WEST, Inscriptionl);
			Inscriptionl.add(lblMotDePasse_1);
			
			JLabel lblRetaperMdp = new JLabel("Retaper mdp :");
			sl_Inscriptionl.putConstraint(SpringLayout.NORTH, lblRetaperMdp, 177, SpringLayout.NORTH, Inscriptionl);
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, lblRetaperMdp, -9, SpringLayout.NORTH, lblDescription);
			sl_Inscriptionl.putConstraint(SpringLayout.SOUTH, lblMotDePasse_1, -11, SpringLayout.NORTH, lblRetaperMdp);
			sl_Inscriptionl.putConstraint(SpringLayout.WEST, lblRetaperMdp, 46, SpringLayout.WEST, Inscriptionl);
			Inscriptionl.add(lblRetaperMdp);
			
			JPanel Conexion = new JPanel();
			tabbedPane.addTab("Connexion", null, Conexion, null);
			SpringLayout sl_Conexion = new SpringLayout();
			Conexion.setLayout(sl_Conexion);
			
			JLabel lblLogin = new JLabel("Login :");
			sl_Conexion.putConstraint(SpringLayout.NORTH, lblLogin, 58, SpringLayout.NORTH, Conexion);
			Conexion.add(lblLogin);
			
			JLabel lblMotDePasse = new JLabel("Mot de passe :");
			sl_Conexion.putConstraint(SpringLayout.NORTH, lblMotDePasse, 96, SpringLayout.NORTH, Conexion);
			sl_Conexion.putConstraint(SpringLayout.WEST, lblMotDePasse, 77, SpringLayout.WEST, Conexion);
			sl_Conexion.putConstraint(SpringLayout.EAST, lblMotDePasse, -212, SpringLayout.EAST, Conexion);
			sl_Conexion.putConstraint(SpringLayout.WEST, lblLogin, 0, SpringLayout.WEST, lblMotDePasse);
			Conexion.add(lblMotDePasse);
			
			LoginTf = new JTextField();
			sl_Conexion.putConstraint(SpringLayout.NORTH, LoginTf, 55, SpringLayout.NORTH, Conexion);
			sl_Conexion.putConstraint(SpringLayout.WEST, LoginTf, 55, SpringLayout.EAST, lblLogin);
			sl_Conexion.putConstraint(SpringLayout.SOUTH, LoginTf, 0, SpringLayout.SOUTH, lblLogin);
			sl_Conexion.putConstraint(SpringLayout.EAST, LoginTf, -118, SpringLayout.EAST, Conexion);
			Conexion.add(LoginTf);
			LoginTf.setColumns(10);
			
			JButton btnConnexion = new JButton("Connexion");
			sl_Conexion.putConstraint(SpringLayout.WEST, btnConnexion, 98, SpringLayout.WEST, Conexion);
			sl_Conexion.putConstraint(SpringLayout.EAST, btnConnexion, -15, SpringLayout.EAST, LoginTf);
			Conexion.add(btnConnexion);
			
			passwordField = new JPasswordField();
			sl_Conexion.putConstraint(SpringLayout.NORTH, btnConnexion, 24, SpringLayout.SOUTH, passwordField);
			sl_Conexion.putConstraint(SpringLayout.SOUTH, btnConnexion, 71, SpringLayout.SOUTH, passwordField);
			sl_Conexion.putConstraint(SpringLayout.NORTH, passwordField, -3, SpringLayout.NORTH, lblMotDePasse);
			sl_Conexion.putConstraint(SpringLayout.WEST, passwordField, 162, SpringLayout.WEST, Conexion);
			sl_Conexion.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, LoginTf);
			Conexion.add(passwordField);
			
			JLabel lblAnnonceEnLigne = new JLabel("Annonce en ligne :");
			springLayout.putConstraint(SpringLayout.WEST, lblAnnonceEnLigne, 113, SpringLayout.EAST, tabbedPane);
			springLayout.putConstraint(SpringLayout.SOUTH, lblAnnonceEnLigne, -13, SpringLayout.NORTH, list);
			springLayout.putConstraint(SpringLayout.EAST, lblAnnonceEnLigne, 221, SpringLayout.EAST, tabbedPane);
			getContentPane().add(lblAnnonceEnLigne);
			
			JTextPane textPane_1 = new JTextPane();
			springLayout.putConstraint(SpringLayout.WEST, textPane_1, -524, SpringLayout.EAST, list);
			springLayout.putConstraint(SpringLayout.SOUTH, textPane_1, -119, SpringLayout.SOUTH, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, textPane_1, -21, SpringLayout.EAST, getContentPane());
			getContentPane().add(textPane_1);
			
			JLabel lblMessage = new JLabel("Message :");
			springLayout.putConstraint(SpringLayout.SOUTH, lblMessage, -333, SpringLayout.SOUTH, getContentPane());
			springLayout.putConstraint(SpringLayout.NORTH, textPane_1, 6, SpringLayout.SOUTH, lblMessage);
			springLayout.putConstraint(SpringLayout.WEST, lblMessage, 0, SpringLayout.WEST, textPane_1);
			getContentPane().add(lblMessage);
			
			JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
			springLayout.putConstraint(SpringLayout.NORTH, tabbedPane_1, 49, SpringLayout.SOUTH, tabbedPane);
			springLayout.putConstraint(SpringLayout.WEST, tabbedPane_1, 22, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane_1, 333, SpringLayout.SOUTH, tabbedPane);
			springLayout.putConstraint(SpringLayout.EAST, tabbedPane_1, 493, SpringLayout.WEST, getContentPane());
			getContentPane().add(tabbedPane_1);
			
			JPanel Deposer = new JPanel();
			tabbedPane_1.addTab("Deposer une annonce", null, Deposer, null);
			SpringLayout sl_Deposer = new SpringLayout();
			Deposer.setLayout(sl_Deposer);
			
			JEditorPane editorPane = new JEditorPane();
			sl_Deposer.putConstraint(SpringLayout.NORTH, editorPane, 10, SpringLayout.NORTH, Deposer);
			sl_Deposer.putConstraint(SpringLayout.WEST, editorPane, -376, SpringLayout.EAST, Deposer);
			sl_Deposer.putConstraint(SpringLayout.EAST, editorPane, -38, SpringLayout.EAST, Deposer);
			Deposer.add(editorPane);
			
			JLabel lblObjet = new JLabel("Objet :");
			sl_Deposer.putConstraint(SpringLayout.SOUTH, lblObjet, 0, SpringLayout.SOUTH, editorPane);
			sl_Deposer.putConstraint(SpringLayout.EAST, lblObjet, -22, SpringLayout.WEST, editorPane);
			Deposer.add(lblObjet);
			
			JEditorPane editorPane_1 = new JEditorPane();
			sl_Deposer.putConstraint(SpringLayout.NORTH, editorPane_1, 6, SpringLayout.SOUTH, editorPane);
			sl_Deposer.putConstraint(SpringLayout.WEST, editorPane_1, 0, SpringLayout.WEST, editorPane);
			sl_Deposer.putConstraint(SpringLayout.SOUTH, editorPane_1, 194, SpringLayout.SOUTH, editorPane);
			sl_Deposer.putConstraint(SpringLayout.EAST, editorPane_1, 0, SpringLayout.EAST, editorPane);
			Deposer.add(editorPane_1);
			
			JLabel lblDesciption = new JLabel("Desciption :");
			sl_Deposer.putConstraint(SpringLayout.NORTH, lblDesciption, 6, SpringLayout.SOUTH, lblObjet);
			sl_Deposer.putConstraint(SpringLayout.EAST, lblDesciption, 0, SpringLayout.EAST, lblObjet);
			Deposer.add(lblDesciption);
			
			JPanel panel = new JPanel();
			tabbedPane_1.addTab("Repondre a une annonce", null, panel, null);
			SpringLayout sl_panel = new SpringLayout();
			panel.setLayout(sl_panel);
			
			JLabel lblReferenceAnnonce = new JLabel("Reference annonce :");
			sl_panel.putConstraint(SpringLayout.NORTH, lblReferenceAnnonce, 10, SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.WEST, lblReferenceAnnonce, 42, SpringLayout.WEST, panel);
			panel.add(lblReferenceAnnonce);
			
			textField = new JTextField();
			sl_panel.putConstraint(SpringLayout.NORTH, textField, 10, SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.WEST, textField, 51, SpringLayout.EAST, lblReferenceAnnonce);
			sl_panel.putConstraint(SpringLayout.EAST, textField, 170, SpringLayout.EAST, lblReferenceAnnonce);
			panel.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			sl_panel.putConstraint(SpringLayout.NORTH, textField_1, 9, SpringLayout.SOUTH, textField);
			sl_panel.putConstraint(SpringLayout.EAST, textField_1, -33, SpringLayout.EAST, panel);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblTitre = new JLabel("Titre :");
			sl_panel.putConstraint(SpringLayout.WEST, textField_1, 26, SpringLayout.EAST, lblTitre);
			sl_panel.putConstraint(SpringLayout.NORTH, lblTitre, 18, SpringLayout.SOUTH, lblReferenceAnnonce);
			sl_panel.putConstraint(SpringLayout.WEST, lblTitre, 0, SpringLayout.WEST, lblReferenceAnnonce);
			panel.add(lblTitre);
			
			JEditorPane editorPane_2 = new JEditorPane();
			sl_panel.putConstraint(SpringLayout.NORTH, editorPane_2, 16, SpringLayout.SOUTH, textField_1);
			sl_panel.putConstraint(SpringLayout.WEST, editorPane_2, 0, SpringLayout.WEST, textField_1);
			sl_panel.putConstraint(SpringLayout.SOUTH, editorPane_2, 167, SpringLayout.SOUTH, textField_1);
			sl_panel.putConstraint(SpringLayout.EAST, editorPane_2, 0, SpringLayout.EAST, textField_1);
			panel.add(editorPane_2);
			
			JLabel lblMessage_1 = new JLabel("Message :");
			sl_panel.putConstraint(SpringLayout.NORTH, lblMessage_1, 0, SpringLayout.NORTH, editorPane_2);
			sl_panel.putConstraint(SpringLayout.WEST, lblMessage_1, 20, SpringLayout.WEST, panel);
			panel.add(lblMessage_1);
			
		
	}
}
