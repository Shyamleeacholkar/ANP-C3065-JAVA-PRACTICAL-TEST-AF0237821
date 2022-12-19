//Exercise 3: Create a method to check if a number is an increasing number 

import java.util.Scanner;
public class checkNumber {
	public boolean checkNumber(int number) {
		boolean result = true;
		
		// here we using toString method to convert the integer input into string
		String str = Integer.toString(number);

		for(int i=0;i<str.length()-1; i++) {
			// 
			char chr = str.charAt(i);

			if(chr>str.charAt(i+1)) {
				result = false;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		System.out.println("Enter The Number : ");
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		checkNumber cn = new checkNumber();
		boolean ab = cn.checkNumber(number);

		if (ab==true) {
			System.out.println("The Number "+number+" Is Increasing Number");
		} else
			System.out.println("The Number "+number+" Is Not  Increasing Number");
	}

}


