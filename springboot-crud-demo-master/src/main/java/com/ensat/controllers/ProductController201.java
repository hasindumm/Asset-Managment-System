package com.ensat.controllers;

import com.ensat.entities.Product201;
import com.ensat.services.Product201Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller201.
 */
@Controller

public class ProductController201 {
	

    private Product201Service product201Service;

    @Autowired
    public void setProduct201Service(Product201Service product201Service) {
        this.product201Service = product201Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products201", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products201", product201Service.listAllProducts201());
        System.out.println("Returning rpoducts201:");
        return "products201";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product201/{id}")
    public String showProduct201(@PathVariable Integer id, Model model) {
        model.addAttribute("product201", product201Service.getProduct201ById(id));
        return "product201show";
    }
    
    

    // Afficher le formulaire de modification du Product
    @RequestMapping("product201/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product201", product201Service.getProduct201ById(id));
        return "product201form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product201/new")
    public String newProduct201(Model model) {
        model.addAttribute("product201", new Product201());
        return "product201form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product201", method = RequestMethod.POST)
    public String saveProduct201(Product201 product201) {
        product201Service.saveProduct201(product201);
        return "redirect:/product201/" + product201.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product201/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product201Service.deleteProduct201(id);
        return "redirect:/products201";
    }

}


