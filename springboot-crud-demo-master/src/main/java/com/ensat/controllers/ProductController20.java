package com.ensat.controllers;

import com.ensat.entities.Product20;
import com.ensat.services.Product20Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;






/**
 * Product controller20.
 */
@Controller

public class ProductController20 {
	

    private Product20Service product20Service;

    @Autowired
    public void setProduct20Service(Product20Service product20Service) {
        this.product20Service = product20Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products20", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products20", product20Service.listAllProducts20());
        System.out.println("Returning rpoducts20:");
        return "products20";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product20/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product20", product20Service.getProduct20ById(id));
        return "product20show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product20/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product20", product20Service.getProduct20ById(id));
        return "product20form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product20form")
    public String newProduct20(Model model) {
        model.addAttribute("product20", new Product20());
        return "product20form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product20", method = RequestMethod.POST)
    public String saveProduct20(Product20 product20) {
        product20Service.saveProduct20(product20);
        return "redirect:/product20/" + product20.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product20/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product20Service.deleteProduct20(id);
        return "redirect:/products20";
    }
    
    


}


