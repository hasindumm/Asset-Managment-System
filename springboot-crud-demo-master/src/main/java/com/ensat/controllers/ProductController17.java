package com.ensat.controllers;

import com.ensat.entities.Product7;
import com.ensat.services.Product17Service;
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

public class ProductController17 {
	

    private Product17Service product17Service;

    @Autowired
    public void setProduct17Service(Product17Service product17Service) {
        this.product17Service = product17Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products17", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products17", product17Service.listAllProducts17());
        System.out.println("Returning rpoducts17:");
        return "products17";
    }
    
   

   
}





