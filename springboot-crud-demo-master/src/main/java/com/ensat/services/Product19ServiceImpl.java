package com.ensat.services;


import com.ensat.entities.Product9;
import com.ensat.repositories.Product19Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product9 service implement.
 */
@Service
public class Product19ServiceImpl implements Product19Service {

    private Product19Repository product19Repository;

    @Autowired
    public void setProduct19Repository(Product19Repository product19Repository) {
        this.product19Repository = product19Repository;
    }

    @Override
    public Iterable<Product9> listAllProducts19() {
        return product19Repository.findAll();
    }

   
}




