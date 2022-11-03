package com.mystore;
import java.util.Scanner;
import com.mystore.model.Product;
import com.mystore.Service.ProductService;


public class ProductView {

		public static void main(String[] args) {
			
			 Scanner set= new Scanner(System.in);  
			 ProductService productService=new ProductService ();
			 for (int  i = 0;i<3;i++) 
				{
				 System.out.println("Enter ID: ");
					 int Id=set.nextInt();
					
				 System.out.println("Enter NAME: ");
					 String Name =set.nextLine();
					 set.nextLine();
				 System.out.println("Enter PRICE");
					 Double Price =set.nextDouble();
					// set.nextDouble();
				 Product product=new Product();
				 productService.addProductService(product);
				}
			   Product productArr1[]=productService.getAllProduct();
			   for (Product product:productArr1) 
			   {
				System.out.println(product.getProductId());
				System.out.println(product.getProductName());
				System.out.println(product.getProductPrice());
			   }
		}
	}


