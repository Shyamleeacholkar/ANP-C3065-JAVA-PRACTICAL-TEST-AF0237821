package com.teninteger;
import java.util.Scanner;
//class 
public class IntTenArray {

    public static void main(String[] args) {
    	// create an array to hold 10 integers
        int[] array = new int[10]; 

        // input from user to input 10 integers
        Scanner input = new Scanner(System.in);
        //looping for value
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an Element: ");
            array[i] = input.nextInt();
        }

        // find the smallest and largest values in the array
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < 10; i++) {
        	//minimum value
            if (array[i] < min) {
                min = array[i];
            }
            //max value
            if (array[i] > max) {
                max = array[i];
            }
        }

        // print the smallest and largest values
        System.out.println("The smallest value in the array is: " + min);
        System.out.println("The largest value in the array is: " + max);
    }
}
