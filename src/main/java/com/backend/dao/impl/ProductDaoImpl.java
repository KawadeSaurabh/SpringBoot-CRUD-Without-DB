package com.backend.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.backend.dao.ProductDao;
import com.backend.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	List<Product> list = new ArrayList<>();

	public ProductDaoImpl() {
		list.add(new Product(1, "Pen", 1, 1, 100, 10));
		list.add(new Product(1, "Book", 1, 1, 500, 10));
	}

	@Override
	public int addProduct(Product product) {
		int status = 0;
		for (Product dbproduct : list) {
			if (dbproduct.getProductName().equals(product.getProductName())) {
				status = 2;
				break;
			}
		}
		if (status != 2) {
			list.add(product);
			status = 1;
		}
		System.out.println(list);
		return status;
	}

	@Override
	public List<Product> getAllProduct() {
		return list;
	}

	@Override
	public Product getProductByName(String productName) {
		for (Product product : list) {
			if (product.getProductName().equalsIgnoreCase(productName)) {
				return product;
			}
		}
		return null;
	}

	@Override
	public List<Product> productsMoreThanPrice(double productPrice) 
	{
		//input 400
		List<Product> list2=new ArrayList<>();
		for (Product product : list) 
		{
			if(product.getPrice()>productPrice)
			{
				list2.add(product);
			}
		}
		return list2;
	}

}
