package com.charlessilva.customerreview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charlessilva.customerreview.dao.ProductDao;
import com.charlessilva.customerreview.model.ProductModel;


@RestController
public class ProductController
{
	@Autowired
	private ProductDao productDao;

	@PostMapping({ "products" })
	public ProductModel createProduct()
	{
		final ProductModel product = new ProductModel();
		productDao.save(product);
		return product;
	}
}