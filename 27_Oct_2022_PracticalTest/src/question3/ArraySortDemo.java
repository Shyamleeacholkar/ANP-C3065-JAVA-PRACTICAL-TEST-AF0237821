package question3;

import question1.ArrayDemo;

public class ArraySortDemo {
	public void  sortArray (float arr1[])
	{	
		    float temp = 0;   
		 for (int a = 0; a < arr1.length; a++)
		 {    
		        for (int b = a+1; b < arr1.length; b++)
		        {     
		           if(arr1[a] < arr1[b]) //compare 
		           {    
		              temp = arr1[a];    
		               arr1[a] = arr1[b];    
		              arr1[b] = temp;    
		           }     
		        }     
		    }    
		     
		    //Displaying elements of array after sorting in descending order   
		     
		    for (int a = 0; a < arr1.length; a++) 
		    {     
		    	System.out.println (arr1[a]);    
		    }    
		 
	}	
	public static void main(String[] args) {
		
		float arr1[] = {0.1f,0.2f,3.3f}; 
		ArraySortDemo ArraySortDemoobj = new ArraySortDemo();  
		ArraySortDemoobj.sortArray(arr1);
	}

}
