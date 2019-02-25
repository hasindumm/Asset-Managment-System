package com.ensat.controllers;

import com.ensat.entities.Product1;
import com.ensat.services.Product1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller1.
 */
@Controller

public class ProductController1 {
	

    private Product1Service product1Service;

    @Autowired
    public void setProduct1Service(Product1Service product1Service) {
        this.product1Service = product1Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products1", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products1", product1Service.listAllProducts1());
        System.out.println("Returning rpoducts1:");
        return "products1";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product1/{id}")
    public String showProduct1(@PathVariable Integer id, Model model) {
        model.addAttribute("product1", product1Service.getProduct1ById(id));
        return "product1show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product1/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product1", product1Service.getProduct1ById(id));
        return "product1form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product1/new")
    public String newProduct1(Model model) {
        model.addAttribute("product1", new Product1());
        return "product1form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product1", method = RequestMethod.POST)
    public String saveProduct1(Product1 product1) {
        product1Service.saveProduct1(product1);
        return "redirect:/product1/" + product1.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product1/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product1Service.deleteProduct1(id);
        return "redirect:/products1";
    }

}

