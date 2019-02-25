package com.ensat.services;


import com.ensat.entities.Product35;
import com.ensat.repositories.Product35Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product35 service implement.
 */
@Service
public class Product35ServiceImpl implements Product35Service {

    private Product35Repository product35Repository;

    @Autowired
    public void setProduct35Repository(Product35Repository product35Repository) {
        this.product35Repository = product35Repository;
    }

    @Override
    public Iterable<Product35> listAllProducts35() {
        return product35Repository.findAll();
    }

    @Override
    public Product35 getProduct35ById(Integer id) {
        return product35Repository.findOne(id);
    }

    @Override
    public Product35 saveProduct35(Product35 product35) {
        return product35Repository.save(product35);
    }

    @Override
    public void deleteProduct35(Integer id) {
        product35Repository.delete(id);
    }

}
