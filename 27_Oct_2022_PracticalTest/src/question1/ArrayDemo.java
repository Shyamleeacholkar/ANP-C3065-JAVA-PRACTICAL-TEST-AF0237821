package question1;

public class ArrayDemo {

		public void  manipulateIntegerArray (int arr1 [])
		{												//arguments should pass here
			for (int  i = 0;i<arr1.length;i++) 
			{
				System.out.println(arr1[i]+5);
			}
		}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method call
		
		int arr1[]=new int [2];
		arr1[0]=1;
		arr1[1]=2;
		
		ArrayDemo ArrayDemoobj = new ArrayDemo();  
		ArrayDemoobj.manipulateIntegerArray(arr1);

	}

}
