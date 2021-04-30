package com.list.products.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.list.products.dao.ProductRepository;
import com.list.products.models.Currency;
import com.list.products.models.Product;
import com.list.products.models.Rates;
import com.list.products.models.Root;

@Service
public class Conversion {

	@Autowired
	ProductRepository repository;
	
	
	public List<Product> findAll(String currency){
		List<Product> productList= new ArrayList<>();
		repository.findAll().forEach(productList::add);
		return getConversion(currency, productList);
	}
	
	public List<Product> findById(String currency, int id){
		List<Product> productList= new ArrayList<>();
		productList.add(repository.findById(id).get());
		return getConversion(currency, productList);
	}
	
	public  List<Product> getConversion(String currency, List<Product> productList){
		currency = currency.toUpperCase();
		Rates rates = latestRate();
		
		switch(Currency.valueOf(currency)) {
		case USD:
				return productList.stream().map(e -> {e.setPrice(e.getPrice() * rates.getUsd()); return e;}).collect(Collectors.toList());
		case INR : 
				return productList.stream().map(e -> {e.setPrice(e.getPrice() * rates.getInr()); return e;}).collect(Collectors.toList());
		case GBP : 
				return productList.stream().map(e -> {e.setPrice(e.getPrice() * rates.getGbp()); return e;}).collect(Collectors.toList());
		case CNY : 
				return productList.stream().map(e -> {e.setPrice(e.getPrice() * rates.getCny()); return e;}).collect(Collectors.toList());
		case AUD : 
				return productList.stream().map(e -> {e.setPrice(e.getPrice() * rates.getAud()); return e;}).collect(Collectors.toList());	
		
		case EUR:
		default:
				return productList.stream().map(e -> {e.setPrice(e.getPrice()); System.out.println("EUR"); return e;}).collect(Collectors.toList());
		}
	}
	
	private Rates latestRate()  {
    	RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> str = restTemplate.getForEntity("http://data.fixer.io/api/latest?access_key=9d355d5d9b18def3efdbdc35e99e7f5e",String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        Root root=null;
		try {
			root = objectMapper.readValue(str.getBody().toLowerCase(), Root.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} 
		System.out.println(root.getRates());
        return root.getRates();
	}
	
}
