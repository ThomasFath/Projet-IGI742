import static org.junit.Assert.*;

import org.junit.Test;

public class ProfilTest {

	@Test
	public void testPoster_Annonce() {
		fail("Not yet implemented");
		String arguments[]={"annonce1","description","profilecreateur"};
		Profil p = (Profil)Factory.create("Profil", arguments);
		Annonce a = (Annonce)Factory.create("Annonce", arguments);
//		assertTrue();
	}

}
