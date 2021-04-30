package com.list.products.dao;

import org.springframework.data.repository.CrudRepository;

import com.list.products.models.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
