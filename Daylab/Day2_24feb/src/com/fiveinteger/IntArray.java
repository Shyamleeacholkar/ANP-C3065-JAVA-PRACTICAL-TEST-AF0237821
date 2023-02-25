package com.fiveinteger;

import java.util.Scanner;

public class IntArray {
	
	    public static void main(String[] args) {
	    	// create an array to hold 5 integers
	        int[] arr = new int[5]; 

	        // input from user to input 5 integers
	        Scanner input = new Scanner(System.in);
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Enter an Element: ");
	            arr[i] = input.nextInt();
	        }

	        // calculate sum and average of the integers in the array
	        int sum = 0;
	        for (int i = 0; i < 5; i++) {
	            sum += arr[i];
	        }
	        double avgerage = (double) sum / arr.length;

	        // print the sum and average
	        System.out.println("The sum of the integers is: " + sum);
	        System.out.println("The average of the integers is: " + avgerage);
	    }
	}


