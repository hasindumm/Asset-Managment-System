package com.ensat.services;


import com.ensat.entities.Product7;
import com.ensat.repositories.Product7Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product7 service implement.
 */
@Service
public class Product7ServiceImpl implements Product7Service {

    private Product7Repository product7Repository;

    @Autowired
    public void setProduct7Repository(Product7Repository product7Repository) {
        this.product7Repository = product7Repository;
    }

    @Override
    public Iterable<Product7> listAllProducts7() {
        return product7Repository.findAll();
    }

    @Override
    public Product7 getProduct7ById(Integer id) {
        return product7Repository.findOne(id);
    }

    @Override
    public Product7 saveProduct7(Product7 product7) {
        return product7Repository.save(product7);
    }

    @Override
    public void deleteProduct7(Integer id) {
        product7Repository.delete(id);
    }

}
