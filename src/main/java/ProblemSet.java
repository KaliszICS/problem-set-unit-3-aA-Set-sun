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
		
		System.out.print("Input two emails: ");
		String email = input.nextLine(); 
		email = email.trim();

		String firstEmail = email.substring(0, email.indexOf(", "));
		String secondEmail = email.substring(email.indexOf(", ") + 1, email.length());

		System.out.println(emailValidation(firstEmail));
		System.out.println(emailValidation(secondEmail));

	}


	public static String emailValidation (String email) {

		/* String local;
		String domain;
		String domainExtension;

		if (email.length() != 0) {
			if ( email.contains("@") && email.matches("@")) { //contains @ check

				local = email.substring(0, email.indexOf("@"));

				domain = email.substring(email.indexOf("@") + 1, email.length());
				domainExtension = domain.substring((domain.lastIndexOf(".") + 1), domain.length());

				*/

				if (!(email.startsWith(".") || email.endsWith(".") || email.startsWith("+") || email.endsWith("+") || email.startsWith("_") || email.endsWith("_"))) { //starts + ends with dot check (+ THE OTHER SYMBOLS)
					if (!(email.contains(" "))) { //space check
						if (local.length() >= 1 && local.length() <= 64) { //length check
							if (domain.contains(".")) { //domain contains at least ONE (1) dot
								if (domainExtension.length() >= 2 && domainExtension.length() <= 6) { //domain extension length + checks for subdomains
									if (local.contains(".")) { //exception C
										local = local.replace(".", ""); //removed dots in local
										return "Valid (Gmail normalized)";
									}
									return "Valid";
								}
								return "Invalid: Invalid domain extension length";
							}
							return "Invalid: Domain contains no dot";
						
						}
						return "Invalid: Invalid local length";
						
					}					
					return "Invalid: Contains spaces";
					
				}
				return "Invalid: Starts or ends with dot, plus, or underscore";
	/*
			}
			return "Invalid: Missing @ or too many @s";
		
		}
		return "Invalid: Nothing was entered";
*/
}
}
