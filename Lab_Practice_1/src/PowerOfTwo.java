// Exercise 4: Create a method to check if a number is a power of two or not 

public class PowerOfTwo {
	 // Method to check if x is power of 2
    static boolean isPowerOfTwo(int x)
    {
        // First x in the below expression is for the case when x is 0 
        return x != 0 && ((x & (x - 1)) == 0);
    }
	public static void main(String[] args) {
		
	int x=35;
		if(isPowerOfTwo(x))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
