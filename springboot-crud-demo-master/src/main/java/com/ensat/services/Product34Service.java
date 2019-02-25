package com.ensat.services;

import com.ensat.entities.Product34;

public interface Product34Service {

    Iterable<Product34> listAllProducts34();

    Product34 getProduct34ById(Integer id);

    Product34 saveProduct34(Product34 product34);

    void deleteProduct34(Integer id);

}
