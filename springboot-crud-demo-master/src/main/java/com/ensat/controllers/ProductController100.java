package com.ensat.controllers;

import com.ensat.entities.Product100;
import com.ensat.services.Product100Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller100.
 */
@Controller

public class ProductController100 {
	

    private Product100Service product100Service;

    @Autowired
    public void setProduct100Service(Product100Service product100Service) {
        this.product100Service = product100Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products100", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products100", product100Service.listAllProducts100());
        System.out.println("Returning rpoducts100:");
        return "products100";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product100/{id}")
    public String showProduct100(@PathVariable Integer id, Model model) {
        model.addAttribute("product100", product100Service.getProduct100ById(id));
        return "product100show";
    }
    
    

    // Afficher le formulaire de modification du Product
    @RequestMapping("product100/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product100", product100Service.getProduct100ById(id));
        return "product100form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product100/new")
    public String newProduct100(Model model) {
        model.addAttribute("product100", new Product100());
        return "product100form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product100", method = RequestMethod.POST)
    public String saveProduct100(Product100 product100) {
        product100Service.saveProduct100(product100);
        return "redirect:/product100/" + product100.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product100/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product100Service.deleteProduct100(id);
        return "redirect:/products100";
    }

}

