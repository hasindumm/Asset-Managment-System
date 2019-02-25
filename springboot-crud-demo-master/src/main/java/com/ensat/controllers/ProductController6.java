package com.ensat.controllers;

import com.ensat.entities.Product6;
import com.ensat.services.Product6Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller6.
 */
@Controller

public class ProductController6 {
	

    private Product6Service product6Service;

    @Autowired
    public void setProduct6Service(Product6Service product6Service) {
        this.product6Service = product6Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products6", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products6", product6Service.listAllProducts6());
        System.out.println("Returning rpoducts6:");
        return "products6";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product6/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product6", product6Service.getProduct6ById(id));
        return "product6show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product6/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product6", product6Service.getProduct6ById(id));
        return "product6form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product6/new")
    public String newProduct6(Model model) {
        model.addAttribute("product6", new Product6());
        return "product6form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product6", method = RequestMethod.POST)
    public String saveProduct6(Product6 product6) {
        product6Service.saveProduct6(product6);
        return "redirect:/product6/" + product6.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product6/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product6Service.deleteProduct6(id);
        return "redirect:/products6";
    }

}


