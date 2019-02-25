package com.ensat.services;

import com.ensat.entities.Product32;

public interface Product32Service {

    Iterable<Product32> listAllProducts32();

    Product32 getProduct32ById(Integer id);

    Product32 saveProduct32(Product32 product32);

    void deleteProduct32(Integer id);

}

