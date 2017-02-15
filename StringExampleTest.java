import static org.junit.Assert.*;

import org.junit.Test;

public class StringExampleTest {

	@Test
	public void testisValidEmail() {
	
		assertTrue(StringExample.isValidEmail("vtirunag@cisco.com"));
		assertFalse(StringExample.isValidEmail("acb@abc"));
		assertFalse(StringExample.isValidEmail("vamsimoh"));
		
		
	}
	
	@Test
	public void testisValidName() {
		
		assertTrue(StringExample.isValidName("Vamsi"));
		assertFalse(StringExample.isValidName("12vamsi"));
		
		
	}

}
