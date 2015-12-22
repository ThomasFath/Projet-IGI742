
public class Factory {
	
	public static Object create(String typeObjet){
		if(typeObjet == "Annonce"){
			return new Annonce();
		}
		else if(typeObjet=="Commande"){
			return new Commande();
		}
		else if(typeObjet=="Profil"){
			return new Profil();
		}
		else {
			return ("Les trois paramètres accepté sont : <Annonce> <Commande> et <Profil> ");
		}
	}
	
/*	
   Annonce createAnnonce(){
   		return new Annonce();
   		}
   		
   Commande createCommande(){
		return new Commande();
	}
	
	Profil createProfil(){
		return new Profil();
	}*/

}
