package com.ensat.services;


import com.ensat.entities.Product200;
import com.ensat.repositories.Product200Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product200 service implement.
 */
@Service
public class Product200ServiceImpl implements Product200Service {

    private Product200Repository product200Repository;

    @Autowired
    public void setProduct200Repository(Product200Repository product200Repository) {
        this.product200Repository = product200Repository;
    }

    @Override
    public Iterable<Product200> listAllProducts200() {
        return product200Repository.findAll();
    }

    @Override
    public Product200 getProduct200ById(Integer id) {
        return product200Repository.findOne(id);
    }

    @Override
    public Product200 saveProduct200(Product200 product200) {
        return product200Repository.save(product200);
    }

    @Override
    public void deleteProduct200(Integer id) {
        product200Repository.delete(id);
    }

}


