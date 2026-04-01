/* 
Title: Problem Set Unit 3
Name: Angie
Date created: March 27, 2026
Date updated: March 27, 2026

Just lost all my progress :(
*/

import java.util.Scanner; 

public class ProblemSet {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Input an email: ");
		String email = input.nextLine(); 

		String result = emailValidation(email);
		System.out.println(result);

		//@System.out.print(local);

		
	}

	public static String emailValidation (String email) {

		email = email.trim();

		if (email.length() != 0) {

		String local = email.substring(0, email.indexOf("@"));
		String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
		String domainExtension = email.substring(email.indexOf("."), email.length());

		}
		return "Invalid";

		if (email.contains("@")) {
			if (!(email.startsWith(".") || email.endsWith("."))) {
				if (!(email.contains(" "))) {
					return "Valid";
				}
				  
			}
		}
		return "Invalid";

		
	
	}

}
