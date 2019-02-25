package com.ensat.services;


import com.ensat.entities.Product4;
import com.ensat.repositories.Product14Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product7 service implement.
 */
@Service
public class Product14ServiceImpl implements Product14Service {

    private Product14Repository product14Repository;

    @Autowired
    public void setProduct14Repository(Product14Repository product14Repository) {
        this.product14Repository = product14Repository;
    }

    @Override
    public Iterable<Product4> listAllProducts14() {
        return product14Repository.findAll();
    }

   
}


