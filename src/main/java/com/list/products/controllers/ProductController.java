package com.list.products.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.list.products.dao.ProductRepository;
import com.list.products.models.Product;
import com.list.products.service.Conversion;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductRepository repository;
	
	@Autowired
	Conversion convert;
	
	@GetMapping
	public List<Product> getAllProducts(@RequestParam String currency){
		return convert.findAll(currency);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<List<Product>> getProductById(@RequestParam String currency , @PathVariable int id){
		return new ResponseEntity<List<Product>>(convert.findById(currency, id), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Product> putProductById(@RequestBody Product product, @PathVariable int id){
		Optional<Product> p1 = repository.findById(id);
		
		if(p1.isPresent()) {
			product.setId(id);
			p1 = Optional.of(product);
		}
		repository.save(p1.get());
		return new ResponseEntity<Product>(p1.get(), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Product> putProduct(@RequestBody Product product){
		Optional<Product> p1 = repository.findById(product.getId());

		Product p2 = null;
		if(p1.isPresent()) {
			p2 = p1.get();
			product.setId(p1.get().getId());
			p2 = product;
		}
		repository.save(p2);
		return new ResponseEntity<Product>(p2, HttpStatus.CREATED);
	}
	
	@PatchMapping("{id}")
	public ResponseEntity<Product> patchProductById(@RequestBody Product product, @PathVariable int id){
Optional<Product> p1 = repository.findById(id);
		
		if(p1.isPresent()) {
			product.setId(id);
			p1 = Optional.of(product);
		}
		repository.save(p1.get());
		return new ResponseEntity<Product>(p1.get(), HttpStatus.OK);
	}
	
	@PatchMapping
	public ResponseEntity<Product> patchProduct(@RequestBody Product product){
		Optional<Product> p1 = repository.findById(product.getId());
		Product p2 = null;
		if(p1.isPresent()) {
			p2 = p1.get();
			product.setId(p1.get().getId());
			p2 = product;
		}
		repository.save(p2);
		return new ResponseEntity<Product>(p2, HttpStatus.CREATED);
	}	
	

	@PostMapping
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		repository.save(product);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Integer> deleteProduct(@PathVariable int id) {
		repository.delete(repository.findById(id).get());
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteProduct() {
		repository.deleteAll();
		return new ResponseEntity<String>("All products deleted", HttpStatus.OK);
	}
}
