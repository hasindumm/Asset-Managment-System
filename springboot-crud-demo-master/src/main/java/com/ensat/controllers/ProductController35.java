package com.ensat.controllers;

import com.ensat.entities.Product35;
import com.ensat.services.Product35Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller35.
 */
@Controller

public class ProductController35 {
	

    private Product35Service product35Service;

    @Autowired
    public void setProduct35Service(Product35Service product35Service) {
        this.product35Service = product35Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products35", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products35", product35Service.listAllProducts35());
        System.out.println("Returning rpoducts35:");
        return "products35";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product35/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product35", product35Service.getProduct35ById(id));
        return "product35show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product35/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product35", product35Service.getProduct35ById(id));
        return "product35form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product35/new")
    public String newProduct35(Model model) {
        model.addAttribute("product35", new Product35());
        return "product35form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product35", method = RequestMethod.POST)
    public String saveProduct35(Product35 product35) {
        product35Service.saveProduct35(product35);
        return "redirect:/product35/" + product35.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product35/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product35Service.deleteProduct35(id);
        return "redirect:/products35";
    }

}

