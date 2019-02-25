package com.ensat.services;


import com.ensat.entities.Product9;
import com.ensat.repositories.Product9Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product9 service implement.
 */
@Service
public class Product9ServiceImpl implements Product9Service {

    private Product9Repository product9Repository;

    @Autowired
    public void setProduct9Repository(Product9Repository product9Repository) {
        this.product9Repository = product9Repository;
    }

    @Override
    public Iterable<Product9> listAllProducts9() {
        return product9Repository.findAll();
    }

    @Override
    public Product9 getProduct9ById(Integer id) {
        return product9Repository.findOne(id);
    }

    @Override
    public Product9 saveProduct9(Product9 product9) {
        return product9Repository.save(product9);
    }

    @Override
    public void deleteProduct9(Integer id) {
        product9Repository.delete(id);
    }

}


