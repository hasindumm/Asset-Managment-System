package com.ensat.services;


import com.ensat.entities.Product5;
import com.ensat.repositories.Product5Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product5 service implement.
 */
@Service
public class Product5ServiceImpl implements Product5Service {

    private Product5Repository product5Repository;

    @Autowired
    public void setProduct5Repository(Product5Repository product5Repository) {
        this.product5Repository = product5Repository;
    }

    @Override
    public Iterable<Product5> listAllProducts5() {
        return product5Repository.findAll();
    }

    @Override
    public Product5 getProduct5ById(Integer id) {
        return product5Repository.findOne(id);
    }

    @Override
    public Product5 saveProduct5(Product5 product5) {
        return product5Repository.save(product5);
    }

    @Override
    public void deleteProduct5(Integer id) {
        product5Repository.delete(id);
    }

}
