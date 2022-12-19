//Exercise 2:Create a class with a method to find the difference between the sum of the squares and the 
//square of the sum of the first n natural numbers. 
public class Square_Sum {
	
	static  int calculateDifference (int n)
	{	 
		int num1,num2,diffrence;
		
		// first n natural numbers is
			    num1 = (n * (n + 1) * (2 * n + 1)) / 6;  
			    //sum of n natural no. using formula
			    num2 = (n * (n + 1)) / 2;
			    //square of k
			    num2 = num2 * num2; 
			    //diffrence between num
			    //The class Math contains methods for performing basic numeric operations such
			    //as the elementary exponential, logarithm, square root, and trigonometric functions. 
			    diffrence = Math.abs(num1 - num2);
			    return diffrence;
			    
	}
			public static void main(String []args) {
				// int n = 10;
				    System.out.println(calculateDifference(3)); 
				
				    
			}
}
