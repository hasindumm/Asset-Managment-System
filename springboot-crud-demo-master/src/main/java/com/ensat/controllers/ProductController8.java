package com.ensat.controllers;

import com.ensat.entities.Product8;
import com.ensat.services.Product8Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller8.
 */
@Controller

public class ProductController8 {
	

    private Product8Service product8Service;

    @Autowired
    public void setProduct8Service(Product8Service product8Service) {
        this.product8Service = product8Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products8", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products8", product8Service.listAllProducts8());
        System.out.println("Returning rpoducts8:");
        return "products8";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product8/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product8", product8Service.getProduct8ById(id));
        return "product8show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product8/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product8", product8Service.getProduct8ById(id));
        return "product8form1";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product8/new")
    public String newProduct8(Model model) {
        model.addAttribute("product8", new Product8());
        return "product8form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product8", method = RequestMethod.POST)
    public String saveProduct8(Product8 product8) {
        product8Service.saveProduct8(product8);
        return "redirect:/product8/" + product8.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product8/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product8Service.deleteProduct8(id);
        return "redirect:/products8";
    }

}


