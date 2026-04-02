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
		email = email.trim();

		String local;
		String domain;
		String domainExtension;

		if (email.length() != 0) {

			local = email.substring(0, email.indexOf("@"));
			domain = email.substring(email.indexOf("@") + 1, email.length());
			domainExtension = email.substring(email.indexOf("."), email.length());

			if (email.contains("@")) { //contains @ check
				if (!(email.startsWith(".") || email.endsWith("."))) { //starts + ends with dot check
					if (!(email.contains(" "))) { //space check
						if (local.length() >= 1 && local.length() <= 64) { //length check
							if (domain.contains(".")) { //domain contains at least ONE (1) dot
								if (domainExtension.length() >= 2 && domainExtension.length() <= 6) { //domain extension length
									System.out.println("Valid");
							
								}
								else if (domainExtension.contains 
								else {
									System.out.println("Invalid: Invalid domain extension length");
								}
							}
							else {
								System.out.println("Invalid: Domain contains no dot");
							}
						}
						else {
						System.out.println("Invalid: Invalid local length");
						}
					}
					else {
						System.out.println("Invalid: Contains spaces");
					}
				}
				else {
					System.out.println("Invalid: Starts or ends with dot");
				}

			}
			else {
				System.out.println("Invalid: Missing @");
			}
	
		}
		else {
			System.out.println("Invalid: Nothing was entered");
		}

}
}
