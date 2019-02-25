package com.ensat.services;

import com.ensat.entities.Product33;

public interface Product33Service {

    Iterable<Product33> listAllProducts33();

    Product33 getProduct33ById(Integer id);

    Product33 saveProduct33(Product33 product33);

    void deleteProduct33(Integer id);

}

