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
		
		
	}

	public static String emailValidation (String email) {
		if (email.contains("@")) {
			return "Valid";
		}
		
		return "Invalid";

		
	
	}

}
