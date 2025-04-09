package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService service;
	  @GetMapping
	    public List<Product> getAll() {
	        return service.getAllProducts();
	    }

	    @GetMapping("/{id}")
	    public Product getById(@PathVariable String id) {
	        return service.getProductById(id);
	    }

	    @PostMapping
	    public Product create(@RequestBody Product product) {
	        return service.addProduct(product);
	    }

	    @PutMapping("/{id}")
	    public Product update(@PathVariable String id, @RequestBody Product product) {
	        product.setId(id);
	        return service.updateProduct(product);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable String id) {
	        service.deleteProduct(id);
	    }
	}