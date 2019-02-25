package com.ensat.services;

import com.ensat.entities.Product3;

public interface Product3Service {

    Iterable<Product3> listAllProducts3();

    Product3 getProduct3ById(Integer id);

    Product3 saveProduct3(Product3 product3);

    void deleteProduct3(Integer id);

}
