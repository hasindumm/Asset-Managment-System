package com.ensat.services;

import com.ensat.entities.Product200;

public interface Product200Service {

    Iterable<Product200> listAllProducts200();

    Product200 getProduct200ById(Integer id);

    Product200 saveProduct200(Product200 product200);

    void deleteProduct200(Integer id);

}

