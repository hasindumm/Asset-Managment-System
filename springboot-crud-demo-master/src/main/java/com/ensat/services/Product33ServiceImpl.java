package com.ensat.services;


import com.ensat.entities.Product33;
import com.ensat.repositories.Product33Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product33 service implement.
 */
@Service
public class Product33ServiceImpl implements Product33Service {

    private Product33Repository product33Repository;

    @Autowired
    public void setProduct33Repository(Product33Repository product33Repository) {
        this.product33Repository = product33Repository;
    }

    @Override
    public Iterable<Product33> listAllProducts33() {
        return product33Repository.findAll();
    }

    @Override
    public Product33 getProduct33ById(Integer id) {
        return product33Repository.findOne(id);
    }

    @Override
    public Product33 saveProduct33(Product33 product33) {
        return product33Repository.save(product33);
    }

    @Override
    public void deleteProduct33(Integer id) {
        product33Repository.delete(id);
    }

}

