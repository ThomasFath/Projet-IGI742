public class JeuDeTest {
	public static void main(String[] args){
		String arglist[]={"vide"};
		SystemPartage S = (SystemPartage) Factory.create("SystemPartage", arglist);  // Creation du systeme
		String arguments[] = {"t1","t2","t3"};
		Annonce a = (Annonce)Factory.create("Annonce", arguments);
	}
}

