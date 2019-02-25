package com.ensat.services;

import com.ensat.entities.Product6;

public interface Product6Service {

    Iterable<Product6> listAllProducts6();

    Product6 getProduct6ById(Integer id);

    Product6 saveProduct6(Product6 product6);

    void deleteProduct6(Integer id);

}
