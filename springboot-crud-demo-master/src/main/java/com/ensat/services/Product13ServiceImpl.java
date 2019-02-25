package com.ensat.services;


import com.ensat.entities.Product3;
import com.ensat.repositories.Product13Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product7 service implement.
 */
@Service
public class Product13ServiceImpl implements Product13Service {

    private Product13Repository product13Repository;

    @Autowired
    public void setProduct13Repository(Product13Repository product13Repository) {
        this.product13Repository = product13Repository;
    }

    @Override
    public Iterable<Product3> listAllProducts13() {
        return product13Repository.findAll();
    }

   
}


