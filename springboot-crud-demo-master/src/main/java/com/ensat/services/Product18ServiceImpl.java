package com.ensat.services;


import com.ensat.entities.Product8;
import com.ensat.repositories.Product18Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product8 service implement.
 */
@Service
public class Product18ServiceImpl implements Product18Service {

    private Product18Repository product18Repository;

    @Autowired
    public void setProduct18Repository(Product18Repository product18Repository) {
        this.product18Repository = product18Repository;
    }

    @Override
    public Iterable<Product8> listAllProducts18() {
        return product18Repository.findAll();
    }

   
}




