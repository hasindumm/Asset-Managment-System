package com.ensat.services;


import com.ensat.entities.Product;
import com.ensat.repositories.Product10Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product7 service implement.
 */
@Service
public class Product10ServiceImpl implements Product10Service {

    private Product10Repository product10Repository;

    @Autowired
    public void setProduct10Repository(Product10Repository product10Repository) {
        this.product10Repository = product10Repository;
    }

    @Override
    public Iterable<Product> listAllProducts10() {
        return product10Repository.findAll();
    }

   
}
