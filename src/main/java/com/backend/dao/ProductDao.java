package com.backend.dao;

import java.util.List;

import com.backend.model.Product;

public interface ProductDao 
{
	public int addProduct(Product product);
	public List<Product> getAllProduct();
	public Product getProductByName(String productName);
	public List<Product> productsMoreThanPrice(double productPrice);
}
