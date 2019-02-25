package com.ensat.services;


import com.ensat.entities.Product8;
import com.ensat.repositories.Product8Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product8 service implement.
 */
@Service
public class Product8ServiceImpl implements Product8Service {

    private Product8Repository product8Repository;

    @Autowired
    public void setProduct8Repository(Product8Repository product8Repository) {
        this.product8Repository = product8Repository;
    }

    @Override
    public Iterable<Product8> listAllProducts8() {
        return product8Repository.findAll();
    }

    @Override
    public Product8 getProduct8ById(Integer id) {
        return product8Repository.findOne(id);
    }

    @Override
    public Product8 saveProduct8(Product8 product8) {
        return product8Repository.save(product8);
    }

    @Override
    public void deleteProduct8(Integer id) {
        product8Repository.delete(id);
    }

}

