package com.ensat.controllers;

import com.ensat.entities.Product;
import com.ensat.services.Product10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller7.
 */
@Controller

public class ProductController10 {
	

    private Product10Service product10Service;

    @Autowired
    public void setProduct10Service(Product10Service product10Service) {
        this.product10Service = product10Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products10", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products10", product10Service.listAllProducts10());
        System.out.println("Returning rpoducts10:");
        return "products10";
    }
    
   

   
}


