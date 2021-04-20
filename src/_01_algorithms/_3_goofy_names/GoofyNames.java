package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String nam = JOptionPane.showInputDialog("Input your name.");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
		JOptionPane.showMessageDialog(null, nam.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 7).
		//    HINT: Use .length() to determine the number of characters in the String.
		int len = nam.length();
		for (int count = 0; count < len; count++) {
				// 4. Create a char variable to store the next character of the name
				//    use .charAt()
			char e, place = nam.charAt(count);
				
				// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
			int ooe = place % 2;
			
				// 6. Even characters should be made uppercase and odd characters made lowercase
				//    HINT: use Character.toUpperCase() or Character.toLowerCase()
			if (ooe == 0) {
				e = Character.toLowerCase(place);
			} else {
				e = Character.toUpperCase(place);
			}
			
				// 7. ADD the char to the end of the goofyName String
			goofyName = goofyName + e;
		}
		// 8. Use pop-up to show user their Goofy name
		JOptionPane.showMessageDialog(null, goofyName);
	}
}

