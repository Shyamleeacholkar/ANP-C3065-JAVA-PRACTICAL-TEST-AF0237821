package com.mystore.Service;
import com.mystore.dao.ProductDAO;
import com.mystore.model.Product;

public class ProductService {
			Product product;
			ProductDAO productDAO;
			
			public Product addProductService(Product product) {
				ProductDAO.addProduct(product);
				return product ;
			}
			
			public ProductDAO getProductByNameStartWith(String productName)
			{
				productDAO.getProductByNameStartWith(productName);
				return productDAO;
			}
			
			public Product[] getAllProduct()
			{
				return productDAO.getAllProduct();
			}
		
		}
