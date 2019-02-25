package com.ensat.services;


import com.ensat.entities.Product201;
import com.ensat.repositories.Product201Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product201 service implement.
 */
@Service
public class Product201ServiceImpl implements Product201Service {

    private Product201Repository product201Repository;

    @Autowired
    public void setProduct201Repository(Product201Repository product201Repository) {
        this.product201Repository = product201Repository;
    }

    @Override
    public Iterable<Product201> listAllProducts201() {
        return product201Repository.findAll();
    }

    @Override
    public Product201 getProduct201ById(Integer id) {
        return product201Repository.findOne(id);
    }

    @Override
    public Product201 saveProduct201(Product201 product201) {
        return product201Repository.save(product201);
    }

    @Override
    public void deleteProduct201(Integer id) {
        product201Repository.delete(id);
    }

}


