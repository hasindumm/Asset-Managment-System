package com.ensat.controllers;

import com.ensat.entities.Product4;
import com.ensat.services.Product4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller4.
 */
@Controller

public class ProductController4 {
	

    private Product4Service product4Service;

    @Autowired
    public void setProduct4Service(Product4Service product4Service) {
        this.product4Service = product4Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products4", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products4", product4Service.listAllProducts4());
        System.out.println("Returning rpoducts4:");
        return "products4";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product4/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product4", product4Service.getProduct4ById(id));
        return "product4show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product4/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product4", product4Service.getProduct4ById(id));
        return "product4form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product4/new")
    public String newProduct4(Model model) {
        model.addAttribute("product4", new Product4());
        return "product4form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product4", method = RequestMethod.POST)
    public String saveProduct4(Product4 product4) {
        product4Service.saveProduct4(product4);
        return "redirect:/product4/" + product4.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product4/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product4Service.deleteProduct4(id);
        return "redirect:/products4";
    }

}

