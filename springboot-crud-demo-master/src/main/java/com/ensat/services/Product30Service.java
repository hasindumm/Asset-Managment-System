package com.ensat.services;

import com.ensat.entities.Product30;

public interface Product30Service {

    Iterable<Product30> listAllProducts30();

    Product30 getProduct30ById(Integer id);

    Product30 saveProduct30(Product30 product30);

    void deleteProduct30(Integer id);

}
