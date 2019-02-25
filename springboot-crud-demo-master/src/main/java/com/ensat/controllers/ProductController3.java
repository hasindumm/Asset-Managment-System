package com.ensat.controllers;

import com.ensat.entities.Product3;
import com.ensat.services.Product3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller3.
 */
@Controller

public class ProductController3 {
	

    private Product3Service product3Service;

    @Autowired
    public void setProduct3Service(Product3Service product3Service) {
        this.product3Service = product3Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products3", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products3", product3Service.listAllProducts3());
        System.out.println("Returning rpoducts3:");
        return "products3";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product3/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product3", product3Service.getProduct3ById(id));
        return "product3show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product3/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product3", product3Service.getProduct3ById(id));
        return "product3form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product3/new")
    public String newProduct3(Model model) {
        model.addAttribute("product3", new Product3());
        return "product3form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product3", method = RequestMethod.POST)
    public String saveProduct3(Product3 product3) {
        product3Service.saveProduct3(product3);
        return "redirect:/product3/" + product3.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product3/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product3Service.deleteProduct3(id);
        return "redirect:/products3";
    }

}

