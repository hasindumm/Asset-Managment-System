package com.ensat.services;


import com.ensat.entities.Product34;
import com.ensat.repositories.Product34Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product34 service implement.
 */
@Service
public class Product34ServiceImpl implements Product34Service {

    private Product34Repository product34Repository;

    @Autowired
    public void setProduct34Repository(Product34Repository product34Repository) {
        this.product34Repository = product34Repository;
    }

    @Override
    public Iterable<Product34> listAllProducts34() {
        return product34Repository.findAll();
    }

    @Override
    public Product34 getProduct34ById(Integer id) {
        return product34Repository.findOne(id);
    }

    @Override
    public Product34 saveProduct34(Product34 product34) {
        return product34Repository.save(product34);
    }

    @Override
    public void deleteProduct34(Integer id) {
        product34Repository.delete(id);
    }

}
