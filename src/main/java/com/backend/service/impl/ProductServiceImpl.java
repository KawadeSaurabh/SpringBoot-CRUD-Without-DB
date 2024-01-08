package com.backend.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.backend.dao.ProductDao;
import com.backend.dao.impl.ProductDaoImpl;
import com.backend.model.*;
import com.backend.service.ProductService;

@Service   //meta data provides about class
public class ProductServiceImpl implements ProductService 
{
	//ProductDao dao=new ProductDaoImpl();
	@Autowired
	private ProductDao dao;
	
	@Override
	public int addProduct(Product product) 
	{
		
		String productId = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		product.setProductId(Long.parseLong(productId));

		int status=dao.addProduct(product);
		
		return status;
	}

	@Override
	public List<Product> getAllProduct() 
	{
		return dao.getAllProduct();
	}

	@Override
	public Product getProductByName(String productName) 
	{
		return dao.getProductByName(productName);
	}

	@Override
	public List<Product> productsMoreThanPrice(double productPrice) 
	{
		return dao.productsMoreThanPrice(productPrice);
	}
}
