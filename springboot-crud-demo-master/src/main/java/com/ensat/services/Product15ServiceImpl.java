package com.ensat.services;


import com.ensat.entities.Product5;
import com.ensat.repositories.Product15Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product7 service implement.
 */
@Service
public class Product15ServiceImpl implements Product15Service {

    private Product15Repository product15Repository;

    @Autowired
    public void setProduct15Repository(Product15Repository product15Repository) {
        this.product15Repository = product15Repository;
    }

    @Override
    public Iterable<Product5> listAllProducts15() {
        return product15Repository.findAll();
    }

   
}



