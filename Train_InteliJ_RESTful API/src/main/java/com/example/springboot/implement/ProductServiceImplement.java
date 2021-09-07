package com.example.springboot.implement;

import com.example.springboot.dao.ProductDAO;
import com.example.springboot.entity.Product;
import com.example.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplement implements ProductService {

    @Autowired
    ProductDAO proDAO;

    @Override
    public List<Product> findAll() {
        return proDAO.findAll();
    }

    @Override
    public Product getById(Integer integer) {
        return proDAO.getById(integer);
    }


    @Override
    public Product findById(Integer integer) {
        return proDAO.findById(integer).get();
    }

    @Override
    public void deleteById(Integer integer) {
        proDAO.deleteById(integer);
    }

    @Override
    public <S extends Product> S save(S entity) {
        return proDAO.save(entity);
    }
}
