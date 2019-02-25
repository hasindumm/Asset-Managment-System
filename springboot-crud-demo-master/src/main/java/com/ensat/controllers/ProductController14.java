package com.ensat.controllers;

import com.ensat.entities.Product4;
import com.ensat.services.Product14Service;
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

public class ProductController14 {
	

    private Product14Service product14Service;

    @Autowired
    public void setProduct14Service(Product14Service product14Service) {
        this.product14Service = product14Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products14", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products14", product14Service.listAllProducts14());
        System.out.println("Returning rpoducts14:");
        return "products14";
    }
    
   

   
}




