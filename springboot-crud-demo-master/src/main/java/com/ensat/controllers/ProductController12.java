package com.ensat.controllers;

import com.ensat.entities.Product2;
import com.ensat.services.Product12Service;
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

public class ProductController12 {
	

    private Product12Service product12Service;

    @Autowired
    public void setProduct12Service(Product12Service product12Service) {
        this.product12Service = product12Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products12", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products12", product12Service.listAllProducts12());
        System.out.println("Returning rpoducts12:");
        return "products12";
    }
    
   

   
}


