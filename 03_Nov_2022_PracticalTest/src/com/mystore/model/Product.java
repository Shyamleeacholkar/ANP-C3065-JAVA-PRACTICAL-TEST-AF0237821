package com.mystore.model;

public class Product {
	//member variable
	int productId;							
	static String productName;					
	Double productPrice;	
	
			public Product(){
											//non-parameterized constructor
		}
			public Product(int pId,String pName,Double pPrice){
				productId=pId;
				productName=pName;
				productPrice=pPrice;
		}
			public Product(int pId){			//parameterized constructor for productid
				
		}
			public Product(String pName){		//parameterized constructor for productname
				
		}
			public Product(Double pPrice){		//parameterized constructor for productprice
				
			}
	//*******setter*******
						public  void setProductId(int pId) {
							productId=pId;
						}
						public void setProductName(String pName) {
							productName=pName;
						}
						public void setProductPrice(Double pPrice) {
							productPrice=pPrice;
						}
	
	//*******getter*******
						public int getProductId() {	
							return productId ;
						}
						public static String getProductName() {
							return productName;
						}
						public Double getProductPrice() {
							return productPrice ;
						}


			}