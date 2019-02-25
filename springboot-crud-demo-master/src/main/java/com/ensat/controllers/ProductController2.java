package com.ensat.controllers;

import com.ensat.entities.Product2;
import com.ensat.services.Product2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller2.
 */
@Controller

public class ProductController2 {
	

    private Product2Service product2Service;

    @Autowired
    public void setProduct2Service(Product2Service product2Service) {
        this.product2Service = product2Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products2", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products2", product2Service.listAllProducts2());
        System.out.println("Returning rpoducts2:");
        return "products2";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product2/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product2", product2Service.getProduct2ById(id));
        return "product2show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product2/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product2", product2Service.getProduct2ById(id));
        return "product2form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product2/new")
    public String newProduct2(Model model) {
        model.addAttribute("product2", new Product2());
        return "product2form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product2", method = RequestMethod.POST)
    public String saveProduct2(Product2 product2) {
        product2Service.saveProduct2(product2);
        return "redirect:/product2/" + product2.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product2/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product2Service.deleteProduct2(id);
        return "redirect:/products2";
    }

}

