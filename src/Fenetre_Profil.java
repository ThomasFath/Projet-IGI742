// Classe fentre profil
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class Fenetre_Profil extends JFrame {
	private JTextField RefAnnonce;
	private JTextField TitreAnnonce;
	private DefaultListModel listeAnnonce = new DefaultListModel();
	private JList list;
	private ArrayList<Annonce> listAnnonce = new ArrayList<Annonce>();
	private Profil profCo;
	boolean connecte = false;
	
	// Constructeur
	public Fenetre_Profil() {
			setResizable(false);
			setSize(1124, 832);
			SpringLayout springLayout = new SpringLayout();
			getContentPane().setLayout(springLayout);
// Partie graphique label annonce en ligne
			JLabel lblAnnonceEnLigne = new JLabel("Annonce en ligne :");
			springLayout.putConstraint(SpringLayout.WEST, lblAnnonceEnLigne, 22, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, lblAnnonceEnLigne, -988, SpringLayout.EAST, getContentPane());
			getContentPane().add(lblAnnonceEnLigne);
			
// Partie graphique message reponse annonce		
			JTextPane PaneMessage = new JTextPane();
			springLayout.putConstraint(SpringLayout.SOUTH, PaneMessage, -119, SpringLayout.SOUTH, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, PaneMessage, -21, SpringLayout.EAST, getContentPane());
			getContentPane().add(PaneMessage);
			
			JLabel lblMessage = new JLabel("Message :");
			springLayout.putConstraint(SpringLayout.SOUTH, lblMessage, -333, SpringLayout.SOUTH, getContentPane());
			springLayout.putConstraint(SpringLayout.NORTH, PaneMessage, 6, SpringLayout.SOUTH, lblMessage);
			springLayout.putConstraint(SpringLayout.WEST, lblMessage, 0, SpringLayout.WEST, PaneMessage);
			getContentPane().add(lblMessage);

// Partie graphique onglet repondre ou deposer anonce		
			JTabbedPane tabbedRepAnn = new JTabbedPane(JTabbedPane.TOP);
			springLayout.putConstraint(SpringLayout.SOUTH, lblAnnonceEnLigne, -412, SpringLayout.NORTH, tabbedRepAnn);
			springLayout.putConstraint(SpringLayout.WEST, PaneMessage, 80, SpringLayout.EAST, tabbedRepAnn);
			springLayout.putConstraint(SpringLayout.NORTH, tabbedRepAnn, 450, SpringLayout.NORTH, getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, tabbedRepAnn, 22, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, tabbedRepAnn, -63, SpringLayout.SOUTH, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, tabbedRepAnn, 493, SpringLayout.WEST, getContentPane());
			getContentPane().add(tabbedRepAnn);
			
			JPanel Deposer = new JPanel();
			tabbedRepAnn.addTab("Deposer une annonce", null, Deposer, null);
			SpringLayout sl_Deposer = new SpringLayout();
			Deposer.setLayout(sl_Deposer);
			
			JEditorPane objetAnnonce = new JEditorPane();
			sl_Deposer.putConstraint(SpringLayout.NORTH, objetAnnonce, 10, SpringLayout.NORTH, Deposer);
			sl_Deposer.putConstraint(SpringLayout.WEST, objetAnnonce, -376, SpringLayout.EAST, Deposer);
			sl_Deposer.putConstraint(SpringLayout.EAST, objetAnnonce, -38, SpringLayout.EAST, Deposer);
			Deposer.add(objetAnnonce);
			
			JLabel lblObjet = new JLabel("Objet :");
			sl_Deposer.putConstraint(SpringLayout.SOUTH, lblObjet, 0, SpringLayout.SOUTH, objetAnnonce);
			sl_Deposer.putConstraint(SpringLayout.EAST, lblObjet, -22, SpringLayout.WEST, objetAnnonce);
			Deposer.add(lblObjet);
			
			JEditorPane descriptionAnnonce = new JEditorPane();
			sl_Deposer.putConstraint(SpringLayout.NORTH, descriptionAnnonce, 6, SpringLayout.SOUTH, objetAnnonce);
			sl_Deposer.putConstraint(SpringLayout.WEST, descriptionAnnonce, 0, SpringLayout.WEST, objetAnnonce);
			sl_Deposer.putConstraint(SpringLayout.SOUTH, descriptionAnnonce, 124, SpringLayout.SOUTH, objetAnnonce);
			sl_Deposer.putConstraint(SpringLayout.EAST, descriptionAnnonce, 0, SpringLayout.EAST, objetAnnonce);
			Deposer.add(descriptionAnnonce);
			
			JLabel lblDesciption = new JLabel("Desciption :");
			sl_Deposer.putConstraint(SpringLayout.NORTH, lblDesciption, 6, SpringLayout.SOUTH, lblObjet);
			sl_Deposer.putConstraint(SpringLayout.EAST, lblDesciption, 0, SpringLayout.EAST, lblObjet);
			Deposer.add(lblDesciption);
			
			JButton btnDeposeAnnonce = new JButton("Deposer");
			// Evenement lors de l appui sur deposer annonce
			btnDeposeAnnonce.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String arglist[]={
							 objetAnnonce.getText(),		
							 descriptionAnnonce.getText(),
							 profCo.getLogin()};
					         profCo.poster_annonce(arglist);					
				}
			});
			sl_Deposer.putConstraint(SpringLayout.NORTH, btnDeposeAnnonce, 12, SpringLayout.SOUTH, descriptionAnnonce);
			sl_Deposer.putConstraint(SpringLayout.WEST, btnDeposeAnnonce, 0, SpringLayout.WEST, objetAnnonce);
			sl_Deposer.putConstraint(SpringLayout.SOUTH, btnDeposeAnnonce, -23, SpringLayout.SOUTH, Deposer);
			sl_Deposer.putConstraint(SpringLayout.EAST, btnDeposeAnnonce, 0, SpringLayout.EAST, objetAnnonce);
			Deposer.add(btnDeposeAnnonce);
			
			JPanel Repondre = new JPanel();
			tabbedRepAnn.addTab("Repondre a une annonce", null, Repondre, null);
			SpringLayout sl_Repondre = new SpringLayout();
			Repondre.setLayout(sl_Repondre);
			
			JLabel lblReferenceAnnonce = new JLabel("Reference annonce :");
			sl_Repondre.putConstraint(SpringLayout.NORTH, lblReferenceAnnonce, 10, SpringLayout.NORTH, Repondre);
			sl_Repondre.putConstraint(SpringLayout.WEST, lblReferenceAnnonce, 42, SpringLayout.WEST, Repondre);
			Repondre.add(lblReferenceAnnonce);
			
			RefAnnonce = new JTextField();
			sl_Repondre.putConstraint(SpringLayout.NORTH, RefAnnonce, 10, SpringLayout.NORTH, Repondre);
			sl_Repondre.putConstraint(SpringLayout.WEST, RefAnnonce, 51, SpringLayout.EAST, lblReferenceAnnonce);
			sl_Repondre.putConstraint(SpringLayout.EAST, RefAnnonce, 170, SpringLayout.EAST, lblReferenceAnnonce);
			Repondre.add(RefAnnonce);
			
			RefAnnonce.setColumns(0);
			
			TitreAnnonce = new JTextField();
			sl_Repondre.putConstraint(SpringLayout.NORTH, TitreAnnonce, 9, SpringLayout.SOUTH, RefAnnonce);
			sl_Repondre.putConstraint(SpringLayout.EAST, TitreAnnonce, -33, SpringLayout.EAST, Repondre);
			Repondre.add(TitreAnnonce);
			TitreAnnonce.setColumns(0);
			
			JLabel lblTitre = new JLabel("Titre :");
			sl_Repondre.putConstraint(SpringLayout.WEST, TitreAnnonce, 26, SpringLayout.EAST, lblTitre);
			sl_Repondre.putConstraint(SpringLayout.NORTH, lblTitre, 18, SpringLayout.SOUTH, lblReferenceAnnonce);
			sl_Repondre.putConstraint(SpringLayout.WEST, lblTitre, 0, SpringLayout.WEST, lblReferenceAnnonce);
			Repondre.add(lblTitre);
			
			JEditorPane MessageRepAnnonce = new JEditorPane();
			sl_Repondre.putConstraint(SpringLayout.NORTH, MessageRepAnnonce, 16, SpringLayout.SOUTH, TitreAnnonce);
			sl_Repondre.putConstraint(SpringLayout.WEST, MessageRepAnnonce, 0, SpringLayout.WEST, TitreAnnonce);
			sl_Repondre.putConstraint(SpringLayout.SOUTH, MessageRepAnnonce, 167, SpringLayout.SOUTH, TitreAnnonce);
			sl_Repondre.putConstraint(SpringLayout.EAST, MessageRepAnnonce, 0, SpringLayout.EAST, TitreAnnonce);
			Repondre.add(MessageRepAnnonce);
			
			JLabel lblMessage_1 = new JLabel("Message :");
			sl_Repondre.putConstraint(SpringLayout.NORTH, lblMessage_1, 0, SpringLayout.NORTH, MessageRepAnnonce);
			sl_Repondre.putConstraint(SpringLayout.WEST, lblMessage_1, 20, SpringLayout.WEST, Repondre);
			Repondre.add(lblMessage_1);

// Partie graphique bouton deconnexion		
			JButton btnDeconnexion = new JButton("Deconnexion");
			springLayout.putConstraint(SpringLayout.NORTH, btnDeconnexion, 29, SpringLayout.SOUTH, PaneMessage);
			springLayout.putConstraint(SpringLayout.WEST, btnDeconnexion, 113, SpringLayout.EAST, tabbedRepAnn);
			springLayout.putConstraint(SpringLayout.SOUTH, btnDeconnexion, 86, SpringLayout.SOUTH, PaneMessage);
			springLayout.putConstraint(SpringLayout.EAST, btnDeconnexion, -51, SpringLayout.EAST, getContentPane());
			// Evenement lors de l appui sur le bouton deconnexion
			btnDeconnexion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			getContentPane().add(btnDeconnexion);
			
			
			JPanel PaneAnnonce = new JPanel();
			springLayout.putConstraint(SpringLayout.NORTH, PaneAnnonce, 8, SpringLayout.SOUTH, lblAnnonceEnLigne);
			springLayout.putConstraint(SpringLayout.WEST, PaneAnnonce, 60, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, PaneAnnonce, -6, SpringLayout.NORTH, lblMessage);
			springLayout.putConstraint(SpringLayout.EAST, PaneAnnonce, -39, SpringLayout.EAST, getContentPane());
			PaneAnnonce.setBackground(Color.WHITE);
			getContentPane().add(PaneAnnonce);
			GridBagLayout gbl_PaneAnnonce = new GridBagLayout();
			gbl_PaneAnnonce.columnWidths = new int[]{489, 36, 1, 0};
			gbl_PaneAnnonce.rowHeights = new int[]{22, 0};
			gbl_PaneAnnonce.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_PaneAnnonce.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			PaneAnnonce.setLayout(gbl_PaneAnnonce);
			
							
			list = new JList(listeAnnonce);
			GridBagConstraints gbc_list = new GridBagConstraints();
			gbc_list.anchor = GridBagConstraints.NORTHWEST;
			gbc_list.gridx = 0;
			gbc_list.gridy = 0;
			PaneAnnonce.add(list, gbc_list);
			springLayout.putConstraint(SpringLayout.NORTH, list, 0, SpringLayout.NORTH, getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, list, 559, SpringLayout.WEST, getContentPane());//559
			springLayout.putConstraint(SpringLayout.SOUTH, list, 377, SpringLayout.NORTH, lblMessage);
			springLayout.putConstraint(SpringLayout.EAST, list, 2400, SpringLayout.WEST, getContentPane());
			list.setBackground(Color.WHITE);	
	}
// Getters et setters
	public ArrayList<Annonce> getListAnnonce() {
		return listAnnonce;
	}

	public void setListAnnonce(ArrayList<Annonce> listAnnonce) {
		this.listAnnonce = listAnnonce;
	}

	public Profil getProfCo() {
		return profCo;
	}

	public DefaultListModel getListeAnnonce() {
		return listeAnnonce;
	}

	public void setListeAnnonce(DefaultListModel listeAnnonce) {
		this.listeAnnonce = listeAnnonce;
	}

	public void setProfCo(Profil profCo) {
		this.profCo = profCo;
	}
}
