
public class JeuDeTest {

	public static void main(String[] args){
		Annonce a1 = (Annonce) Factory.create("Annonce");
		a1.ajouter();
		
		Commande c1 = (Commande) Factory.create("Commande");
		c1.changer_etat();
	}
}
