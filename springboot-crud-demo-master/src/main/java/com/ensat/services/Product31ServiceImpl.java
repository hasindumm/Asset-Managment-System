package com.ensat.services;


import com.ensat.entities.Product31;
import com.ensat.repositories.Product31Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product31 service implement.
 */
@Service
public class Product31ServiceImpl implements Product31Service {

    private Product31Repository product31Repository;

    @Autowired
    public void setProduct31Repository(Product31Repository product31Repository) {
        this.product31Repository = product31Repository;
    }

    @Override
    public Iterable<Product31> listAllProducts31() {
        return product31Repository.findAll();
    }

    @Override
    public Product31 getProduct31ById(Integer id) {
        return product31Repository.findOne(id);
    }

    @Override
    public Product31 saveProduct31(Product31 product31) {
        return product31Repository.save(product31);
    }

    @Override
    public void deleteProduct31(Integer id) {
        product31Repository.delete(id);
    }

}

