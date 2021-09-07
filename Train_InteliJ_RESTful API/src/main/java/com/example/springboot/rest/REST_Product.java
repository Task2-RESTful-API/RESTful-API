package com.example.springboot.rest;

import com.example.springboot.entity.Product;
import com.example.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class REST_Product {
    @Autowired
    ProductService proService;

    @GetMapping("/rest/product")
    public List<Product> getAll(){
        return proService.findAll();
    }

    @GetMapping("/rest/product/{id}")
    public Product getOne(@PathVariable("id") Integer id){
        return proService.findById(id);
    }

    @PostMapping("/rest/product")
    public Product create(@RequestBody Product product){
        return proService.save(product);
    }

    @PutMapping("rest/product/{id}")
    public  Product update(@PathVariable("id") Integer id, @RequestBody Product product){
        return proService.save(product);
    }

    @DeleteMapping("rest/product/{id}")
    public void delete(@PathVariable("id") Integer id){
        proService.deleteById(id);
    }
}
