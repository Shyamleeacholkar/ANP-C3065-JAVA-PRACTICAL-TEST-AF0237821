package com.mymart.service;
import java.util.LinkedList;
import com.mymart.dao.ProductDAO;
import com.mymart.model.Product;
public class ProductService {
	private static ProductDAO productdao = new ProductDAO();
	public boolean addProductService(Product product)
	{
		boolean addstatus = productdao.addProduct(product);
		return addstatus;
	}
	public LinkedList<Product> getAllProductService()
	{
		LinkedList<Product> list2 = productdao.getAllProducts();
		return list2;
	}
	public LinkedList<Product> searchProductNameStartingWithLetterService(String s)
	{
		LinkedList<Product> list3 = new LinkedList<>();
		list3.addAll(productdao.searchProductNameStartingWithLetter(s));
		return list3;
	}
	public void searchProductByIDService(int ID)
	{
		productdao.searchProductByID(ID);
	}
	public void deleteProductByIDService(int ID)
	{
		productdao.deleteProductByID(ID);
	}

}