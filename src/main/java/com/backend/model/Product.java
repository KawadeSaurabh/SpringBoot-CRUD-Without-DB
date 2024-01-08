package com.backend.model;

import org.springframework.stereotype.Component;

@Component
public class Product
{
	private long productId;
	private String productName;
	private long supplierId;
	private long categoryId;
	private int productQty;
	private double price;
	
	public Product() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long productId, String productName, long supplierId, long categoryId, int productQty, double price) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
		this.supplierId = supplierId;
		this.categoryId = categoryId;
		this.productQty = productQty;
		this.price = price;
	}

	public long getProductId() 
	{
		return productId;
	}

	public void setProductId(long productId) 
	{
		this.productId = productId;
	}

	public String getProductName() 
	{
		return productName;
	}

	public void setProductName(String productName) 
	{
		this.productName = productName;
	}

	public long getSupplierId() 
	{
		return supplierId;
	}

	public void setSupplierId(long supplierId) 
	{
		this.supplierId = supplierId;
	}

	public long getCategoryId() 
	{
		return categoryId;
	}

	public void setCategoryId(long categoryId) 
	{
		this.categoryId = categoryId;
	}

	public int getProductQty() 
	{
		return productQty;
	}

	public void setProductQty(int productQty) 
	{
		this.productQty = productQty;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Product [productId=" + productId + ", productName=" + productName + ", supplierId=" + supplierId
				+ ", categoryId=" + categoryId + ", productQty=" + productQty + ", price=" + price + "]";
	}
	
}
