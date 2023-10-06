package org.example.controller;

import org.example.model.Product;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("get")
    public List<Product> getAll(){
        return service.getProducts();
    }

    @GetMapping("get/{id}")
    public Optional<Product> getProduct(@PathVariable int id){
        return service.getProduct(id);
    }

    @PostMapping("add")
    public ResponseEntity<Product> addProduct(@RequestBody Product prod){
        return new ResponseEntity<Product>(service.addProduct(prod), HttpStatus.CREATED);
    }

    @PutMapping("/edit/{id}")
    public String editProduct(@PathVariable int id, @RequestBody Product prod){
        return service.editProduct(id,prod);
    }
    @DeleteMapping("/delete/{id}")
    public String removeProduct(@PathVariable int id){
        return service.removeProduct(id);
    }
}
