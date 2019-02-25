package com.ensat.services;

import com.ensat.entities.Product9;

public interface Product9Service {

    Iterable<Product9> listAllProducts9();

    Product9 getProduct9ById(Integer id);

    Product9 saveProduct9(Product9 product9);

    void deleteProduct9(Integer id);

}

