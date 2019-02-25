package com.ensat.controllers;

import com.ensat.entities.Product7;
import com.ensat.services.Product7Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller7.
 */
@Controller

public class ProductController7 {
	

    private Product7Service product7Service;

    @Autowired
    public void setProduct7Service(Product7Service product7Service) {
        this.product7Service = product7Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products7", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products7", product7Service.listAllProducts7());
        System.out.println("Returning rpoducts7:");
        return "products7";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product7/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product7", product7Service.getProduct7ById(id));
        return "product7show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product7/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product7", product7Service.getProduct7ById(id));
        return "product7form1";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product7/new")
    public String newProduct7(Model model) {
        model.addAttribute("product7", new Product7());
        return "product7form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product7", method = RequestMethod.POST)
    public String saveProduct7(Product7 product7) {
        product7Service.saveProduct7(product7);
        return "redirect:/product7/" + product7.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product7/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product7Service.deleteProduct7(id);
        return "redirect:/products7";
    }

}


