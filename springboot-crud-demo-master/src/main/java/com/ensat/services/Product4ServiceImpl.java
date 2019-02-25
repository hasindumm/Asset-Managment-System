package com.ensat.services;


import com.ensat.entities.Product4;
import com.ensat.repositories.Product4Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product4 service implement.
 */
@Service
public class Product4ServiceImpl implements Product4Service {

    private Product4Repository product4Repository;

    @Autowired
    public void setProduct4Repository(Product4Repository product4Repository) {
        this.product4Repository = product4Repository;
    }

    @Override
    public Iterable<Product4> listAllProducts4() {
        return product4Repository.findAll();
    }

    @Override
    public Product4 getProduct4ById(Integer id) {
        return product4Repository.findOne(id);
    }

    @Override
    public Product4 saveProduct4(Product4 product4) {
        return product4Repository.save(product4);
    }

    @Override
    public void deleteProduct4(Integer id) {
        product4Repository.delete(id);
    }

}
