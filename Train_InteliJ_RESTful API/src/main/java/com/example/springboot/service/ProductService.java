package com.example.springboot.service;

import com.example.springboot.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    Product getById(Integer integer);


    Product findById(Integer integer);

    void deleteById(Integer integer);

    <S extends Product> S save(S entity);
}
