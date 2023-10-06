package org.example.service;

import org.example.model.Product;
import org.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;
    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product addProduct(Product prod) {
        repository.save(prod);
        return prod;
    }

    public String editProduct(int id, Product prod) {
        Optional<Product> p = repository.findById(id);
        p.get().setPrice(prod.getPrice());
        repository.save(p.get());
        return "Updated";
    }

    public String removeProduct(int id) {
        repository.deleteById(id);
        return "Deleted";
    }

    public Optional<Product> getProduct(int id) {
        return repository.findById(id);
    }
}
