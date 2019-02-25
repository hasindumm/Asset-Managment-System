package com.ensat.services;


import com.ensat.entities.Product6;
import com.ensat.repositories.Product6Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product6 service implement.
 */
@Service
public class Product6ServiceImpl implements Product6Service {

    private Product6Repository product6Repository;

    @Autowired
    public void setProduct6Repository(Product6Repository product6Repository) {
        this.product6Repository = product6Repository;
    }

    @Override
    public Iterable<Product6> listAllProducts6() {
        return product6Repository.findAll();
    }

    @Override
    public Product6 getProduct6ById(Integer id) {
        return product6Repository.findOne(id);
    }

    @Override
    public Product6 saveProduct6(Product6 product6) {
        return product6Repository.save(product6);
    }

    @Override
    public void deleteProduct6(Integer id) {
        product6Repository.delete(id);
    }

}
