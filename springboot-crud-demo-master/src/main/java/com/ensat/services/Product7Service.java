package com.ensat.services;

import com.ensat.entities.Product7;

public interface Product7Service {

    Iterable<Product7> listAllProducts7();

    Product7 getProduct7ById(Integer id);

    Product7 saveProduct7(Product7 product7);

    void deleteProduct7(Integer id);

}

