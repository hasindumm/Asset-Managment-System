package com.ensat.controllers;

import com.ensat.entities.Product34;
import com.ensat.services.Product34Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller34.
 */
@Controller

public class ProductController34 {
	

    private Product34Service product34Service;

    @Autowired
    public void setProduct34Service(Product34Service product34Service) {
        this.product34Service = product34Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products34", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products34", product34Service.listAllProducts34());
        System.out.println("Returning rpoducts34:");
        return "products34";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product34/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product34", product34Service.getProduct34ById(id));
        return "product34show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product34/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product34", product34Service.getProduct34ById(id));
        return "product34form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product34/new")
    public String newProduct34(Model model) {
        model.addAttribute("product34", new Product34());
        return "product34form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product34", method = RequestMethod.POST)
    public String saveProduct34(Product34 product34) {
        product34Service.saveProduct34(product34);
        return "redirect:/product34/" + product34.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product34/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product34Service.deleteProduct34(id);
        return "redirect:/products34";
    }

}

