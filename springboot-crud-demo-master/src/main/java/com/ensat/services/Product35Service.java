package com.ensat.services;

import com.ensat.entities.Product35;

public interface Product35Service {

    Iterable<Product35> listAllProducts35();

    Product35 getProduct35ById(Integer id);

    Product35 saveProduct35(Product35 product35);

    void deleteProduct35(Integer id);

}
