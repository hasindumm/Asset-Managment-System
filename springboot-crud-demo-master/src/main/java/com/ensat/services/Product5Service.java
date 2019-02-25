package com.ensat.services;

import com.ensat.entities.Product5;

public interface Product5Service {

    Iterable<Product5> listAllProducts5();

    Product5 getProduct5ById(Integer id);

    Product5 saveProduct5(Product5 product5);

    void deleteProduct5(Integer id);

}
