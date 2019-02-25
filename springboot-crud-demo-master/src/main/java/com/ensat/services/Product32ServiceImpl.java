package com.ensat.services;


import com.ensat.entities.Product32;
import com.ensat.repositories.Product32Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product32 service implement.
 */
@Service
public class Product32ServiceImpl implements Product32Service {

    private Product32Repository product32Repository;

    @Autowired
    public void setProduct32Repository(Product32Repository product32Repository) {
        this.product32Repository = product32Repository;
    }

    @Override
    public Iterable<Product32> listAllProducts32() {
        return product32Repository.findAll();
    }

    @Override
    public Product32 getProduct32ById(Integer id) {
        return product32Repository.findOne(id);
    }

    @Override
    public Product32 saveProduct32(Product32 product32) {
        return product32Repository.save(product32);
    }

    @Override
    public void deleteProduct32(Integer id) {
        product32Repository.delete(id);
    }

}

