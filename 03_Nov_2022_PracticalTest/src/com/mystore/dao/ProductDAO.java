package com.mystore.dao;
import com.mystore.model.Product;

public class ProductDAO 
{
	
	public static  void addProduct(Product product) 
	{
		Product productArr[]=new Product[3];
		for (int  i = 0;i<productArr.length;i++) 
		{
			if (productArr[i]==null) 
			{
				productArr[i]=product;
				break;
			}
		}
	} 
				public Product[] getAllProduct()
				{
					Product productArr[]=new Product[3];
					return productArr;
				}

			public int[] getProductByNameStartWith(String pName)
			{
				int[] prodArray = new int[3];
				Product sc= new Product();
				sc.getProductName();
				char firstLetter = 'A';
				if (pName.charAt(0) ==firstLetter)			//returns the character at the specified index in a string.
			      {
					
			      }
				return prodArray;	
			}
			
			
			}

			


			
			

