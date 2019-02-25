package com.ensat.services;


import com.ensat.entities.Product1;
import com.ensat.repositories.Product1Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product1 service implement.
 */
@Service
public class Product1ServiceImpl implements Product1Service {

    private Product1Repository product1Repository;

    @Autowired
    public void setProduct1Repository(Product1Repository product1Repository) {
        this.product1Repository = product1Repository;
    }

    @Override
    public Iterable<Product1> listAllProducts1() {
        return product1Repository.findAll();
    }

    @Override
    public Product1 getProduct1ById(Integer id) {
        return product1Repository.findOne(id);
    }

    @Override
    public Product1 saveProduct1(Product1 product1) {
        return product1Repository.save(product1);
    }

    @Override
    public void deleteProduct1(Integer id) {
        product1Repository.delete(id);
    }

}
