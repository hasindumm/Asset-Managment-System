package com.ensat.services;


import com.ensat.entities.Product20;
import com.ensat.repositories.Product20Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product20 service implement.
 */
@Service
public class Product20ServiceImpl implements Product20Service {

    private Product20Repository product20Repository;

    @Autowired
    public void setProduct20Repository(Product20Repository product20Repository) {
        this.product20Repository = product20Repository;
    }

    @Override
    public Iterable<Product20> listAllProducts20() {
        return product20Repository.findAll();
    }

    @Override
    public Product20 getProduct20ById(Integer id) {
        return product20Repository.findOne(id);
    }

    @Override
    public Product20 saveProduct20(Product20 product20) {
        return product20Repository.save(product20);
    }

    @Override
    public void deleteProduct20(Integer id) {
        product20Repository.delete(id);
    }

}

