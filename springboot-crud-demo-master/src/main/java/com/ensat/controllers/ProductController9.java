package com.ensat.controllers;

import com.ensat.entities.Product9;
import com.ensat.services.Product9Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller9.
 */
@Controller

public class ProductController9 {
	

    private Product9Service product9Service;

    @Autowired
    public void setProduct9Service(Product9Service product9Service) {
        this.product9Service = product9Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products9", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products9", product9Service.listAllProducts9());
        System.out.println("Returning rpoducts9:");
        return "products9";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product9/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product9", product9Service.getProduct9ById(id));
        return "product9show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product9/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product9", product9Service.getProduct9ById(id));
        return "product9form1";
    }
    
    // Afficher le formulaire de modification du Product
    @RequestMapping("product9/edit1/{id}")
    public String edit1(@PathVariable Integer id, Model model) {
        model.addAttribute("product9", product9Service.getProduct9ById(id));
        return "product9form2";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product9/new")
    public String newProduct9(Model model) {
        model.addAttribute("product9", new Product9());
        return "product9form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product9", method = RequestMethod.POST)
    public String saveProduct9(Product9 product9) {
        product9Service.saveProduct9(product9);
        return "redirect:/product9/" + product9.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product9/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product9Service.deleteProduct9(id);
        return "redirect:/products9";
    }

}


