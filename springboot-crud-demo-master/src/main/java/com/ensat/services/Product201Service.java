package com.ensat.services;

import com.ensat.entities.Product201;

public interface Product201Service {

    Iterable<Product201> listAllProducts201();

    Product201 getProduct201ById(Integer id);

    Product201 saveProduct201(Product201 product201);

    void deleteProduct201(Integer id);

}

