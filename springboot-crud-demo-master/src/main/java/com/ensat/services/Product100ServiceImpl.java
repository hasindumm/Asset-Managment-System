package com.ensat.services;


import com.ensat.entities.Product100;
import com.ensat.repositories.Product100Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product100 service implement.
 */
@Service
public class Product100ServiceImpl implements Product100Service {

    private Product100Repository product100Repository;

    @Autowired
    public void setProduct100Repository(Product100Repository product100Repository) {
        this.product100Repository = product100Repository;
    }

    @Override
    public Iterable<Product100> listAllProducts100() {
        return product100Repository.findAll();
    }

    @Override
    public Product100 getProduct100ById(Integer id) {
        return product100Repository.findOne(id);
    }

    @Override
    public Product100 saveProduct100(Product100 product100) {
        return product100Repository.save(product100);
    }

    @Override
    public void deleteProduct100(Integer id) {
        product100Repository.delete(id);
    }

}


