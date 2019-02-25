package com.ensat.services;

import com.ensat.entities.Product100;

public interface Product100Service {

    Iterable<Product100> listAllProducts100();

    Product100 getProduct100ById(Integer id);

    Product100 saveProduct100(Product100 product100);

    void deleteProduct100(Integer id);

}
