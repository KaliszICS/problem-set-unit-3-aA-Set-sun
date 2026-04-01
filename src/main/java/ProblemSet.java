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
			domain = email.substring(email.indexOf("@") + 1, email.length()));
			domainExtension = email.substring(email.indexOf("."), email.length());

			if (email.contains("@")) {
				if (!(email.startsWith(".") || email.endsWith("."))) {
					if (!(email.contains(" "))) {
						if (local.length() >= 1 && local.length() <= 64) {
							if (domain.contains(".")) {
								if (domainExtension.length() >= 2 && domainExtension.length() <= 6) {
								System.out.println("Valid");
							
								}
								else {
									System.out.println("Invalid");
								}
							}
							else {
								System.out.println("Invalid");
							}
						}
						else {
						System.out.println("Invalid");
						}
					}
					else {
						System.out.println("Invalid");
					}
				}
				else {
					System.out.println("Invalid");
				}

			}
			else {
				System.out.println("Invalid");
			}
	
		}
		else {
			System.out.println("Invalid");
		}

}
}
