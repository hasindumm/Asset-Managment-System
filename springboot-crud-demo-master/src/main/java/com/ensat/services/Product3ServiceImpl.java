package com.ensat.services;


import com.ensat.entities.Product3;
import com.ensat.repositories.Product3Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product3 service implement.
 */
@Service
public class Product3ServiceImpl implements Product3Service {

    private Product3Repository product3Repository;

    @Autowired
    public void setProduct3Repository(Product3Repository product3Repository) {
        this.product3Repository = product3Repository;
    }

    @Override
    public Iterable<Product3> listAllProducts3() {
        return product3Repository.findAll();
    }

    @Override
    public Product3 getProduct3ById(Integer id) {
        return product3Repository.findOne(id);
    }

    @Override
    public Product3 saveProduct3(Product3 product3) {
        return product3Repository.save(product3);
    }

    @Override
    public void deleteProduct3(Integer id) {
        product3Repository.delete(id);
    }

}
