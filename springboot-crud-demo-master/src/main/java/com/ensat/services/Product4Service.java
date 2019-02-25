package com.ensat.services;

import com.ensat.entities.Product4;

public interface Product4Service {

    Iterable<Product4> listAllProducts4();

    Product4 getProduct4ById(Integer id);

    Product4 saveProduct4(Product4 product4);

    void deleteProduct4(Integer id);

}
