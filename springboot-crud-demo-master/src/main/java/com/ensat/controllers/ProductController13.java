package com.ensat.controllers;

import com.ensat.entities.Product3;
import com.ensat.services.Product13Service;
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

public class ProductController13 {
	

    private Product13Service product13Service;

    @Autowired
    public void setProduct13Service(Product13Service product13Service) {
        this.product13Service = product13Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products13", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products13", product13Service.listAllProducts13());
        System.out.println("Returning rpoducts13:");
        return "products13";
    }
    
   

   
}



