package com.ensat.services;


import com.ensat.entities.Product30;
import com.ensat.repositories.Product30Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product30 service implement.
 */
@Service
public class Product30ServiceImpl implements Product30Service {

    private Product30Repository product30Repository;

    @Autowired
    public void setProduct30Repository(Product30Repository product30Repository) {
        this.product30Repository = product30Repository;
    }

    @Override
    public Iterable<Product30> listAllProducts30() {
        return product30Repository.findAll();
    }

    @Override
    public Product30 getProduct30ById(Integer id) {
        return product30Repository.findOne(id);
    }

    @Override
    public Product30 saveProduct30(Product30 product30) {
        return product30Repository.save(product30);
    }

    @Override
    public void deleteProduct30(Integer id) {
        product30Repository.delete(id);
    }

}
