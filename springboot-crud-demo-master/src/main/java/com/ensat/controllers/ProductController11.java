package com.ensat.controllers;

import com.ensat.entities.Product1;
import com.ensat.services.Product11Service;
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

public class ProductController11 {
	

    private Product11Service product11Service;

    @Autowired
    public void setProduct11Service(Product11Service product11Service) {
        this.product11Service = product11Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products11", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products11", product11Service.listAllProducts11());
        System.out.println("Returning rpoducts11:");
        return "products11";
    }
    
   

   
}


