/* 
Title: Problem Set Unit 3
Name: Angie
Date created: March 27, 2026
Date updated: April 4, 2026

*/

import java.util.Scanner; 

public class ProblemSet {

	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input two emails: ");
		String email = input.nextLine(); 

	if (!(email.startsWith(" ") || email.endsWith(" "))) { //because we're apparently not supposed to trim
		if (email.contains("@")) { //contains @ check
			if (email.contains(",")) { //checks if there's 2 emails
				String firstEmail = email.substring(0, email.indexOf(","));
				String secondEmail = email.substring(email.indexOf(",") + 2, email.length());

				if (firstEmail.length() > 0) {
				System.out.println(emailCheck(firstEmail));
				} 

				if (secondEmail.length() > 0) {
				System.out.println(emailCheck(secondEmail));
				}
			} //for singular email
				System.out.println(emailCheck(email));
			}
			else {
				System.out.println(email + ": Invalid: Missing @");
			}
		}
		else {
			System.out.println(email + ": Invalid: Starts and or ends with spaces");
		}

	input.close();

}

	//splitting email into local, domain, and domain extension -> then it checks for validation
	public static String emailCheck (String email) {

		String local;
		String domain;
		String domainExtension;

		String result = emailValidation(email);

		if (email.length() == 0) {
			return email + ": Invalid: Nothing was entered";
		}

		local = email.substring(0, email.indexOf("@"));
		domain = email.substring(email.indexOf("@") + 1, email.length());
		domainExtension = domain.substring((domain.lastIndexOf(".") + 1), domain.length());
		
		if (result.contains("Valid")) {
			return email + ": " + result + " | Local: " + local + " | Domain: " + domain;
		}
		else {
			return email + ": " + result;
		}
}

	//checking email
	public static String emailValidation (String email) {

		int firstAt = email.indexOf('@');
		int secondAt = email.lastIndexOf('@');

		if (firstAt != secondAt) {
			return "Invalid: Multiple @s";
		}
	
		String local = email.substring(0, email.indexOf("@"));
		String domain = email.substring(email.indexOf("@") + 1, email.length());
		String domainExtension = domain.substring((domain.lastIndexOf(".") + 1), domain.length()); 
		//just repeat re-declaring... 😩

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
