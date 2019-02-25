package com.ensat.services;


import com.ensat.entities.Product2;
import com.ensat.repositories.Product2Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product2 service implement.
 */
@Service
public class Product2ServiceImpl implements Product2Service {

    private Product2Repository product2Repository;

    @Autowired
    public void setProduct2Repository(Product2Repository product2Repository) {
        this.product2Repository = product2Repository;
    }

    @Override
    public Iterable<Product2> listAllProducts2() {
        return product2Repository.findAll();
    }

    @Override
    public Product2 getProduct2ById(Integer id) {
        return product2Repository.findOne(id);
    }

    @Override
    public Product2 saveProduct2(Product2 product2) {
        return product2Repository.save(product2);
    }

    @Override
    public void deleteProduct2(Integer id) {
        product2Repository.delete(id);
    }

}
