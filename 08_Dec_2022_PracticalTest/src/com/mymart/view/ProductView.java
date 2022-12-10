package com.mymart.view;
import java.util.LinkedList;
import java.util.Scanner;
import com.mymart.model.Product;
import com.mymart.service.ProductService;
public class ProductView {
	ProductService productobj = new ProductService();
	public void addProduct()
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the Product ID :");
		int ID = ss.nextInt();
		
		System.out.println("Enter the Product Name :");
		String Name = ss.next();
		
		System.out.println("Enter the Product Price :");
		double Price = ss.nextDouble();
		
		Product pobj = new Product(ID,Name,Price);
		productobj.addProductService(pobj);
	}
	public void displayAllProduct()
	{
		LinkedList<Product> product = productobj.getAllProductService();
		for(Product pobj : product)
		{
			System.out.println("The Product Details are :\n");
			System.out.println("The Product ID is :"+ pobj.getProductId());
			System.out.println("The Product Name is :"+ pobj.getProductName());
			System.out.println("The Product Price is :"+ pobj.getProductPrice());
		}
	}
	
	public void displayAllProductsStartingWithLetter()
	{
	Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Letter to check :");
		String s = s1.next();
		
		LinkedList<Product> l = productobj.searchProductNameStartingWithLetterService(s);
		for(Product pobj : l)
		{
			System.out.println("The Product Details are \n");
			System.out.println("The Product ID is :"+ pobj.getProductId());
			System.out.println("The Product Name is :"+ pobj.getProductName());
			System.out.println("The Product Price is :"+ pobj.getProductPrice());
		}
	}
	
	public void displayProductByID()
	{
	Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the ID :");
		int ID = scan1.nextInt();
		productobj.searchProductByIDService(ID);
	}
	public void removeProductByID()
	{
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the ID :");
		int ID = scan2.nextInt();
		productobj.deleteProductByIDService(ID);
	}
}