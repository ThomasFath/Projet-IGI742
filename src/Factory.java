// Classe pattern Factory
public class Factory {
	// Methode de classe gerant les declaration d objets
	public static Object create(String typeObjet,String argument[]){
		if(typeObjet == "Annonce"){
			return new Annonce(argument[0], argument[1], argument[2]);
		}
		else if(typeObjet=="Commande"){
			return new Commande();
		}
		else if(typeObjet=="Profil"){
			return new Profil( argument[0], argument[1], argument[2], argument[3], argument[4], argument[5], argument[6], argument[7]);
	
		}
		else if (typeObjet=="Fenetre_Profil"){
			return new Fenetre_Profil();
		}
		else if (typeObjet=="SystemPartage"){
			return SystemPartage.getInstance();  // Creation du systeme pattern singleton
		}
		else {
			return ("Les quatres paramètres accepté sont : <Fenetre_Profil> <Annonce> <Commande> et <Profil> ");
		}
		
	}


}
