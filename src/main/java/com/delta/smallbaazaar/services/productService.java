package com.delta.smallbaazaar.services;

import com.delta.smallbaazaar.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {

    @Autowired
    productRepo repo;

    public void saveProduct(Product prod) {repo.save(prod);}

    public Product getAllProducts(String prod){
        return repo.findByProduct(String prod);
    }
    public Product getProduct(String type){
        return repo.findByProductType(String type);
    }
}
