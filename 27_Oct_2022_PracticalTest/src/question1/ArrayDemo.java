package question1;

public class ArrayDemo {
	
	//***** ACTUAL CODE LOGIC *****
			//int[]manipulateIntegerArray(int arr[]){
			//int newArr[]=new int[5];
	//for (int  i = 0;i<arr1.length;i++) 
	//{
	//	System.out.println(arr1[i]+5); OR arr[i]+=5; OR newArr[i]=arr[i]+1;
	//}
	//return arr;
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
