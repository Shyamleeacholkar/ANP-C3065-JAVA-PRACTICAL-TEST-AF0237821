//Exercise 1: Calculate the sum of first n natural numbers which are divisible by 3 or 5.  

public class Natural_num 
{
	static int sum(int N)
	{
	    int S1, S2;
	 //for divisiable ny 3
	    S1 = ((N / 3)) * (2 * 3 + (N / 3 - 1) * 3) / 2;
	    //for divisible by 5
	    S2 = ((N / 5)) * (2 * 5 + (N / 5 - 1) * 5) / 2;
	    //sum of both
	    return S1 + S2 ;
	}
public static void main(String []args)
{
    System.out.println("the sum of n numbers : "+sum(34));
    
}
}

