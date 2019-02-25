package com.ensat.controllers;

import com.ensat.entities.Product9;
import com.ensat.services.Product19Service;
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

public class ProductController19 {
	

    private Product19Service product19Service;

    @Autowired
    public void setProduct19Service(Product19Service product19Service) {
        this.product19Service = product19Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products19", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products19", product19Service.listAllProducts19());
        System.out.println("Returning rpoducts19:");
        return "products19";
    }
    
   

   
}





