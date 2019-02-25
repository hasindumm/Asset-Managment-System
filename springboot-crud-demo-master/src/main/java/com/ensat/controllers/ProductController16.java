package com.ensat.controllers;

import com.ensat.entities.Product6;
import com.ensat.services.Product16Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller.
 */
@Controller

public class ProductController16 {
	

    private Product16Service product16Service;

    @Autowired
    public void setProduct16Service(Product16Service product16Service) {
        this.product16Service = product16Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products16", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products16", product16Service.listAllProducts16());
        System.out.println("Returning rpoducts16:");
        return "products16";
    }
    
   

   
}




