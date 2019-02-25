package com.ensat.controllers;

import com.ensat.entities.Product5;
import com.ensat.services.Product5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller5.
 */
@Controller

public class ProductController5 {
	

    private Product5Service product5Service;

    @Autowired
    public void setProduct5Service(Product5Service product5Service) {
        this.product5Service = product5Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products5", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products5", product5Service.listAllProducts5());
        System.out.println("Returning rpoducts5:");
        return "products5";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product5/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product5", product5Service.getProduct5ById(id));
        return "product5show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product5/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product5", product5Service.getProduct5ById(id));
        return "product5form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product5/new")
    public String newProduct5(Model model) {
        model.addAttribute("product5", new Product5());
        return "product5form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product5", method = RequestMethod.POST)
    public String saveProduct5(Product5 product5) {
        product5Service.saveProduct5(product5);
        return "redirect:/product5/" + product5.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product5/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product5Service.deleteProduct5(id);
        return "redirect:/products5";
    }

}


