package com.ensat.controllers;

import com.ensat.entities.Product31;
import com.ensat.services.Product31Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller31.
 */
@Controller

public class ProductController31 {
	

    private Product31Service product31Service;

    @Autowired
    public void setProduct31Service(Product31Service product31Service) {
        this.product31Service = product31Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products31", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products31", product31Service.listAllProducts31());
        System.out.println("Returning rpoducts31:");
        return "products31";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product31/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product31", product31Service.getProduct31ById(id));
        return "product31show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product31/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product31", product31Service.getProduct31ById(id));
        return "product31form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product31/new")
    public String newProduct31(Model model) {
        model.addAttribute("product31", new Product31());
        return "product31form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product31", method = RequestMethod.POST)
    public String saveProduct31(Product31 product31) {
        product31Service.saveProduct31(product31);
        return "redirect:/product31/" + product31.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product31/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product31Service.deleteProduct31(id);
        return "redirect:/products31";
    }

}

