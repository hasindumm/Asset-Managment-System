package com.ensat.services;

import com.ensat.entities.Product1;

public interface Product1Service {

    Iterable<Product1> listAllProducts1();

    Product1 getProduct1ById(Integer id);

    Product1 saveProduct1(Product1 product1);

    void deleteProduct1(Integer id);

}
