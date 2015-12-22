// Classe systeme gerant la connexion et l inscription
import java.util.ArrayList;
import java.util.Observable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SystemPartage extends Observable {
	private ArrayList<Profil> listProfil = new ArrayList<Profil>();
	private ArrayList<Annonce> ListAnnonce = new ArrayList<Annonce>();
	private ArrayList<Fenetre_Profil> ListConnecte = new ArrayList<Fenetre_Profil>();
	private boolean connecte = false;
	private Profil profCo;
	private static SystemPartage uniqueInstance;										// Pattern singleton instance unique
	
// Constructeur de la classe en privee pour ne pas etre appellee par d autre classe
	private SystemPartage() {
		super();
		Fenetre_system fenetre = new Fenetre_system(this);////////////////////////  factory singleton
		fenetre.setVisible(true);
	}
    // Méthode statique qui sert de pseudo-constructeur (utilisation du mot clef "synchronized" pour le multithread).Pattern singleton
    public static synchronized SystemPartage getInstance()
    {
            if(uniqueInstance==null)
            {
                    uniqueInstance = new SystemPartage();
            }
            return uniqueInstance;
    }
	
// Connexion dont verification des comptes	
	public String connexion(String LoginCo, String MdpCo){
		String etat="false";
		String arglist[]={"vide"};
		Fenetre_Profil fenetre = (Fenetre_Profil) Factory.create("Fenetre_Profil",arglist);
		ListConnecte.add(fenetre);
		connecte=false;
		for(Profil p: listProfil){ 									    // On verifie si le login existe dans le systeme	
			if(LoginCo.equals(p.getLogin())){
				  if(MdpCo.equals(p.getMot_de_passe())){ 				// Verification du mot de passe
						 connecte = true;
						  profCo=p;
						  etat="Connexion";
						  if (profCo.getFenetre()==null){				// Si jamais connecte creation fenetre
							  profCo.setFenetre(fenetre);
							  fenetre.setProfCo(profCo);
						      fenetre.setTitle(""+profCo.getLogin());
							  fenetre.setVisible(true);
			     			 } 
						 else 
							  profCo.getFenetre().setVisible(true);	   // Si deja connecte reouverture fenetre		  
					  }
		    } 
		}
		if (connecte == false){                                        // Si compte n existe pas
			 etat="Erreur";
		 }
		return etat;		
	}
// Inscription 	
	public String incription(String LoginIns, String NomIns, String PrenomIns, String EmailIns, String NumEtuIns, String NumTelIns, String Mdp1, String Mdp2, String DescripInsPane){
			String etat;
			if(Mdp1.equals(Mdp2)
					&& (LoginIns.isEmpty()==false)
					&& NomIns.isEmpty()==false
					&& PrenomIns.isEmpty()==false
					&& EmailIns.isEmpty()==false
					&& NumEtuIns.isEmpty()==false
					&& NumTelIns.isEmpty()==false
					&& Mdp1.isEmpty()==false){
				boolean exist= false;
				for(Profil p: listProfil){ 						// On verifie si le login est deja utilise
					if(p.getLogin().equals(LoginIns)){
						exist=true;
					}
				}
				if (exist == false){	              		   // Si login libre creation compte et fenetre
		    		 String arglist[]={
					 LoginIns,		
					 NomIns,
					 PrenomIns,
					 EmailIns,
					 NumEtuIns,
					 NumTelIns,
					 Mdp1,
					 DescripInsPane};
					 Profil profil	 = (Profil)Factory.create("Profil", arglist);
					 this.addObserver(profil);					// Ajout du profil en tant que observeur pour les nouvelle annonce
					 profil.setS1(this);						// On lie le systeme au profil
					 listProfil.add(profil);
					 etat="Reussite";					 
					 for(Profil p: listProfil){ 				// Affichage compte profil
						 System.out.println(" "+p);
					}
				} else {
					etat="ExisteDeja";							
				}
		}
		else if(LoginIns.isEmpty()								// Test si tous les champs sont remplit pour inscription
				|| NomIns.isEmpty()
				|| PrenomIns.isEmpty()
				|| EmailIns.isEmpty()
				|| NumEtuIns.isEmpty()
				|| NumTelIns.isEmpty()
				|| Mdp1.isEmpty()){
			etat="ChampsManquants";
		}
		else{
			etat="MDPIncorrect";								// Test si les deux mot de passe ne sont pas identique
		}
			return etat;
	}
	
// Getter and setter des variables
	public void setListAnnonce(Annonce a) {
		this.ListAnnonce.add(a);							    // Sauvegarde de la liste des annonces du systeme
		profCo.getFenetre().setListAnnonce(ListAnnonce);      
		setChanged();											// Inscription generant un evenement lors du changement de la liste des annonces (pattern observer)
		notifyObservers(this.ListAnnonce);
	}
	public ArrayList<Annonce> getListAnnonce() {
		return ListAnnonce;
	}
	public void setListProfil(ArrayList<Profil> listProfil) {
		this.listProfil = listProfil;
	}		
	public ArrayList<Profil> getListProfil() {
		return listProfil;
	}
}
