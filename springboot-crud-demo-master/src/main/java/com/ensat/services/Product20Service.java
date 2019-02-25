package com.ensat.services;

import com.ensat.entities.Product20;

public interface Product20Service {

    Iterable<Product20> listAllProducts20();

    Product20 getProduct20ById(Integer id);

    Product20 saveProduct20(Product20 product20);

    void deleteProduct20(Integer id);

}
