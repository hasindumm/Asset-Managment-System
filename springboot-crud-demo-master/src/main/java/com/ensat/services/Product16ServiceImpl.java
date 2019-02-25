package com.ensat.services;


import com.ensat.entities.Product6;
import com.ensat.repositories.Product16Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product7 service implement.
 */
@Service
public class Product16ServiceImpl implements Product16Service {

    private Product16Repository product16Repository;

    @Autowired
    public void setProduct16Repository(Product16Repository product16Repository) {
        this.product16Repository = product16Repository;
    }

    @Override
    public Iterable<Product6> listAllProducts16() {
        return product16Repository.findAll();
    }

   
}




