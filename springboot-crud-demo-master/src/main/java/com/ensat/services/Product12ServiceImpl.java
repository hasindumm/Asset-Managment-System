package com.ensat.services;


import com.ensat.entities.Product2;
import com.ensat.repositories.Product12Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product7 service implement.
 */
@Service
public class Product12ServiceImpl implements Product12Service {

    private Product12Repository product12Repository;

    @Autowired
    public void setProduct12Repository(Product12Repository product12Repository) {
        this.product12Repository = product12Repository;
    }

    @Override
    public Iterable<Product2> listAllProducts12() {
        return product12Repository.findAll();
    }

   
}

