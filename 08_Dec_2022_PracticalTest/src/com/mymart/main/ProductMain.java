package com.mymart.main;
import java.util.Scanner;
import com.mymart.view.ProductView;
public class ProductMain {
	public static void main(String[] args)
	{
		ProductView productview = new ProductView();
		int select;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Add Product");
			System.out.println("2.View All Products");
			System.out.println("3.View all products starting with letter");
			System.out.println("4.View all products based on ID");
			System.out.println("5.Delete product based on ID");
			System.out.println("Exit\n");
			System.out.println("Enter Your Choice");
			select = sc.nextInt();
			switch(select)
			{
			case 1:productview.addProduct();
			break;
			case 2:productview.displayAllProduct();
			break;
			case 3:productview.displayAllProductsStartingWithLetter();
			break;
			case 4:productview.displayProductByID();
			break;
			case 5:productview.removeProductByID();
			break;
			case 0:
			break;
			}
		}while(select != 0);
	}
}