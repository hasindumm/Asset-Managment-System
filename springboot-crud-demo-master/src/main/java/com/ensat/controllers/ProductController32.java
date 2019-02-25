package com.ensat.controllers;

import com.ensat.entities.Product32;
import com.ensat.services.Product32Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller32.
 */
@Controller

public class ProductController32 {
	

    private Product32Service product32Service;

    @Autowired
    public void setProduct32Service(Product32Service product32Service) {
        this.product32Service = product32Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products32", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products32", product32Service.listAllProducts32());
        System.out.println("Returning rpoducts32:");
        return "products32";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product32/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product32", product32Service.getProduct32ById(id));
        return "product32show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product32/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product32", product32Service.getProduct32ById(id));
        return "product32form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product32/new")
    public String newProduct32(Model model) {
        model.addAttribute("product32", new Product32());
        return "product32form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product32", method = RequestMethod.POST)
    public String saveProduct32(Product32 product32) {
        product32Service.saveProduct32(product32);
        return "redirect:/product32/" + product32.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product32/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product32Service.deleteProduct32(id);
        return "redirect:/products32";
    }

}

