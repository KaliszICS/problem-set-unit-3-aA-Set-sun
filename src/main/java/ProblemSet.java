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

		if (email.contains(",")

		String firstEmail = email.substring(0, email.indexOf(", "));
		String secondEmail = email.substring(email.indexOf(", ") + 1, email.length());

		System.out.println(emailValidation(firstEmail));
		System.out.println(emailValidation(secondEmail));

	}

	//splitting email into local, domain, and domain extension
	public static String emailSectioning (String email) {

		String local;
		String domain;
		String domainExtension;

		if (email.length() != 0) {
			if (email.matches("@")) { //contains @ check

				local = email.substring(0, email.indexOf("@"));
				domain = email.substring(email.indexOf("@") + 1, email.length());
				domainExtension = domain.substring((domain.lastIndexOf(".") + 1), domain.length());
			}
			return "Invalid: Missing @ or too many @s";
		}
		return "Invalid: Nothing was entered";

		// if ((emailValidation(email, local, domain, domainExtension).contains("Valid")) {
		// 	return email + ": " + emailValidation(email, local, domain, domainExtension) + " | Local: " + local + " | Domain: " + domain;
		// }
		// else {
		// 	return email + ": " + emailValidation(email, local, domain, domainExtension);
		// }
	}

	//validates email
	public static String emailValidation (String email, String local, String domain, String domainExtension) {
	
		if (email.startsWith(".") || email.endsWith(".") || email.startsWith("+") || email.endsWith("+") || email.startsWith("_") || email.endsWith("_")) { //starts + ends with dot check (+ THE OTHER SYMBOLS)
			return "Invalid: Starts or ends with dot, plus, or underscore";
		}

		if (email.contains(" ")) { //space check
			return "Invalid: contains spaces";
		}

		if (!((local.length() >= 1) && local.length() <= 64)) { //length check
			return "Invalid: Invalid local length";
		}

		if (!(domain.contains("."))) { //contains at least ONE (1) dot
			return "Invalid: Domain contains no dot";
		}

		if (!(domainExtension.length() >= 2 && domainExtension.length() <= 6)) { //domain extension length
			return "Invalid: Invalid domain extension length";
		} 

		if (local.contains(".")) { //exception C
			local = local.replace(".", ""); //removed dots in local
			return "Valid (Gmail normalized)";
		}
		else {
			return "Valid";
		}

	}
	}