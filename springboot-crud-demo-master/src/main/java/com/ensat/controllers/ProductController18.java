package com.ensat.controllers;

import com.ensat.entities.Product8;
import com.ensat.services.Product18Service;
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

public class ProductController18 {
	

    private Product18Service product18Service;

    @Autowired
    public void setProduct18Service(Product18Service product18Service) {
        this.product18Service = product18Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products18", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products18", product18Service.listAllProducts18());
        System.out.println("Returning rpoducts18:");
        return "products18";
    }
    
   

   
}





