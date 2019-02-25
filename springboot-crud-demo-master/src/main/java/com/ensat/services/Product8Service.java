package com.ensat.services;

import com.ensat.entities.Product8;

public interface Product8Service {

    Iterable<Product8> listAllProducts8();

    Product8 getProduct8ById(Integer id);

    Product8 saveProduct8(Product8 product8);

    void deleteProduct8(Integer id);

}

