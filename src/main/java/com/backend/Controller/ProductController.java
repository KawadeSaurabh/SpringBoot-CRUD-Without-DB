package com.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Product;
import com.backend.service.ProductService;
import com.backend.service.impl.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {
	// ProductService service=new ProductServiceImpl();

	@Autowired
	private ProductService service;

	@PostMapping("/add-product")
	public String addProduct(@RequestBody Product product) {
		// service calling
		int status = service.addProduct(product); // to complete left side >> alt + shift + L

		// response delegate(Dispatch)
		if (status == 1) {
			return "Added successfully";
		} else {
			return "Already Exists";
		}

	}

	@GetMapping("/get-product")
	public Object getAllProduct() {
		List<Product> list = service.getAllProduct();
		if (list.isEmpty()) {
			return "No records";
		} else {
			return list;
		}
	}

	@GetMapping("/get-product-by-name/{productName}/{price}")
	public Object getProductByName(@PathVariable String productName, @PathVariable int price) {
		Product product = service.getProductByName(productName);

		if (product != null) {
			return product;
		}
		return "Product not found";
	}
	
	
	@GetMapping("/get-filtered-product-by-price")
	public Object productsMoreThanPrice(@RequestParam("price") double price)
	{
		List<Product> list=service.productsMoreThanPrice(price);
		if(list.isEmpty())
		{
			return list;
		}
		else
		{
			return "Record not found";
		}
	}
	

}
