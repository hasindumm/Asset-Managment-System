package com.ensat.services;


import com.ensat.entities.Product1;
import com.ensat.repositories.Product11Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product7 service implement.
 */
@Service
public class Product11ServiceImpl implements Product11Service {

    private Product11Repository product11Repository;

    @Autowired
    public void setProduct11Repository(Product11Repository product11Repository) {
        this.product11Repository = product11Repository;
    }

    @Override
    public Iterable<Product1> listAllProducts11() {
        return product11Repository.findAll();
    }

   
}
