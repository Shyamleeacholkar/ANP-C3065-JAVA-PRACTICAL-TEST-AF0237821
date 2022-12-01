
package com.mystore.dao;
import com.mystore.model.Product;

public class ProductDAO 
{
	Product productArr[]=new Product[3];
	
	public static void addProduct(Product product) 
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
					return productArr;
				}

			public Product[] getProductByNameStartWith(String pName)
			{
				
				Product productArr[]=new Product[3];
				String set= "A";
				for (int  i = 0;i<productArr.length;i++) 
				{
				if (pName.startsWith(set))			//returns the character at the specified index in a string.
			      {
					
			      }
					
			}
				return productArr;
			}	
			
			}

			


			
			

