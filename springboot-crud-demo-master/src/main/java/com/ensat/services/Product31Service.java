package com.ensat.services;

import com.ensat.entities.Product31;

public interface Product31Service {

    Iterable<Product31> listAllProducts31();

    Product31 getProduct31ById(Integer id);

    Product31 saveProduct31(Product31 product31);

    void deleteProduct31(Integer id);

}
