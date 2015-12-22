import java.util.Observable;
import java.util.Observer;
// Classe profil
public class Profil implements Observer{
	private String login;
	private String nom_utilisateur;
	private String prenom_utilisateur;
	private String mail_utilsateur;
	private String numero_etudiant;
	private String numero_telephone;
	private String mot_de_passe;
	private String description;
	private Fenetre_Profil fenetre;
	private SystemPartage s1;
	private Annonce NouvelleAnnonce;
	
// Constructeur de profil	
	public Profil(String login, String nom_utilisateur, String prenom_utilisateur, String mail_utilsateur, String numero_etudiant,
			String numero_telephone, String mot_de_passe, String description) {
		super();
		this.login=login;
		this.nom_utilisateur = nom_utilisateur;
		this.prenom_utilisateur = prenom_utilisateur;
		this.mail_utilsateur = mail_utilsateur;
		this.numero_etudiant = numero_etudiant;
		this.numero_telephone = numero_telephone;
		this.mot_de_passe = mot_de_passe;
		this.description = description;
	}
	
// Fonction appelle lors du changement de la liste des annonces (pattern observer)
	public void update(Observable obs, Object obj){
		fenetre.getListeAnnonce().addElement(NouvelleAnnonce);  // Ajout de la nouvelle annonce a la liste des annonces des profils
	}

// Publication Annonce
	public void poster_annonce(String arglist[]){				
		Annonce annonce = (Annonce)Factory.create("Annonce", arglist);
		 for(Profil p: s1.getListProfil() ){					// Envoi la nouvelle annonce a tous les profils
			  p.NouvelleAnnonce=annonce;
			 }
		s1.setListAnnonce(NouvelleAnnonce);						// Envoi la nouvelle annonce au systeme generant l evenement (pattern observer)
		}
	
	public void envoyer_message(){
		
	}

	public void gerer_compte(){
		
	}
	
	public void passer_commande(){
		
	}
	
	public void consulter_annonce(){
		
	}
	
	public void supprimer(){
		
	}
	
// Getter and setter	
	public Fenetre_Profil getFenetre() {
		return fenetre;
	}

	public void setFenetre(Fenetre_Profil fenetre) {
		this.fenetre = fenetre;
	}
	public SystemPartage getS1() {
		return s1;
	}

	public void setS1(SystemPartage s1) {
		this.s1 = s1;
	}
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	public String getNom_utilisateur() {
		return nom_utilisateur;
	}
	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}
	public String getPrenom_utilisateur() {
		return prenom_utilisateur;
	}
	public void setPrenom_utilisateur(String prenom_utilisateur) {
		this.prenom_utilisateur = prenom_utilisateur;
	}
	public String getMail_utilsateur() {
		return mail_utilsateur;
	}
	public void setMail_utilsateur(String mail_utilsateur) {
		this.mail_utilsateur = mail_utilsateur;
	}
	public String getNumero_etudiant() {
		return numero_etudiant;
	}
	public void setNumero_etudiant(String numero_etudiant) {
		this.numero_etudiant = numero_etudiant;
	}
	public String getNumero_telephone() {
		return numero_telephone;
	}
	public void setNumero_telephone(String numero_telephone) {
		this.numero_telephone = numero_telephone;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	};
	public String toString(){
		return " "+
		 login+" "+
		 nom_utilisateur+" "+
		 prenom_utilisateur +" "+
		 mail_utilsateur+" "+
		 numero_etudiant+" "+
		 numero_telephone+" "+
		 mot_de_passe+" "+
		 description;		
		}
}
