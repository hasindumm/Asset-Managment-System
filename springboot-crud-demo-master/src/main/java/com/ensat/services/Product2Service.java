package com.ensat.services;

import com.ensat.entities.Product2;

public interface Product2Service {

    Iterable<Product2> listAllProducts2();

    Product2 getProduct2ById(Integer id);

    Product2 saveProduct2(Product2 product2);

    void deleteProduct2(Integer id);

}
