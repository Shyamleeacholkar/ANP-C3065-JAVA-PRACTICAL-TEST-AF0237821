package com.stringop;

public class StringOp {

	    public static void main(String[] args) {
	        String originalString = "Welcome to Java World";

	        // Returns the character at 5th position and display it.
	        char fifthChar = originalString.charAt(4);
	        System.out.println("The character at 5th position is: " + fifthChar);

	        // Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
	        String comparisonString = "Welcome";
	        int result = originalString.compareToIgnoreCase(comparisonString);
	        System.out.println("The lexicographic comparison result with 'Welcome' is: " + result);

	        // Concatenates “- Let us learn” to the above string and display it.
	        String concatenatedString = originalString.concat("- Let us learn");
	        System.out.println("The concatenated string is: " + concatenatedString);

	        // Returns the position of the first occurrence of character ‘a’ and display it.
	        int indexOfA = originalString.indexOf('a');
	        System.out.println("The index of first occurrence of 'a' is: " + indexOfA);

	        // Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
	        String replacedString = originalString.replace('a', 'e');
	        System.out.println("The string after replacing all 'a' with 'e' is: " + replacedString);

	        // Returns string between 4th position and 10th position and display it.
	        String substring = originalString.substring(3, 10);
	        System.out.println("The substring between 4th and 10th position is: " + substring);

	        // Returns the lowercase of the string and display it.
	        String lowercaseString = originalString.toLowerCase();
	        System.out.println("The lowercase string is: " + lowercaseString);
	    }
	}
