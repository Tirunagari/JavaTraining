
public class StringExample {

	public static boolean isValidEmail(String email) {
		String emailExp = "[a-zA-Z][a-zA-Z0-9._]*@[a-zA-Z]{3,}(.)[a-zA-Z]{2,}";
		
		return email.matches(emailExp);
		
	}
	
	public static boolean isValidName(String name) {
		String nameExp = "[a-zA-Z]{3,15}";
		return name.matches(nameExp);
		
	}
}
