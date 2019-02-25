package com.ensat.services;


import com.ensat.entities.Product7;
import com.ensat.repositories.Product17Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product7 service implement.
 */
@Service
public class Product17ServiceImpl implements Product17Service {

    private Product17Repository product17Repository;

    @Autowired
    public void setProduct17Repository(Product17Repository product17Repository) {
        this.product17Repository = product17Repository;
    }

    @Override
    public Iterable<Product7> listAllProducts17() {
        return product17Repository.findAll();
    }

   
}




