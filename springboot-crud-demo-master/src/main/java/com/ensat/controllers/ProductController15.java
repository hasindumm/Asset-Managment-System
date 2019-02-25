package com.ensat.controllers;

import com.ensat.entities.Product5;
import com.ensat.services.Product15Service;
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

public class ProductController15 {
	

    private Product15Service product15Service;

    @Autowired
    public void setProduct15Service(Product15Service product15Service) {
        this.product15Service = product15Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products15", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products15", product15Service.listAllProducts15());
        System.out.println("Returning rpoducts15:");
        return "products15";
    }
    
   

   
}




