import java.util.Observable;
// classe annonce
public class Annonce extends Observable{
	private String titre_annonce;
	private String description_Annonce;
	private String categorie;
	private String ProfilCreateur;

// Constructeurs
	public Annonce(String titre_annonce, String description_Annonce, String ProfilCreateur) {
		super();
		this.titre_annonce = titre_annonce;
		this.description_Annonce = description_Annonce;
		this.ProfilCreateur = ProfilCreateur;
	}
	void modifier(){
		
	};
	void supprimer(){
		
	}
// Getter et setter	
	public String getDescription_Annonce() {
		return description_Annonce;
	}
	public void setDescription_Annonce(String description_Annonce) {
		this.description_Annonce = description_Annonce;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	};
	public String toString(){
	return "Titre : "+titre_annonce+", Objet : "+ description_Annonce+", publie par "+ProfilCreateur;
	}
	public String getProfilCreateur() {
		return ProfilCreateur;
	}
	public void setProfilCreateur(String profilCreateur) {
		ProfilCreateur = profilCreateur;
	}
	public String getTitre_annonce() {
		return titre_annonce;
	}	
	public void setTitre_annonce(String titre_annonce) {
		this.titre_annonce = titre_annonce;
		setChanged();
		notifyObservers(this.titre_annonce);
	}
	
}
