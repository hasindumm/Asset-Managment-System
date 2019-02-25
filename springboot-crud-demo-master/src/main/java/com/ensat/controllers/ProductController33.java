package com.ensat.controllers;

import com.ensat.entities.Product33;
import com.ensat.services.Product33Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller33.
 */
@Controller

public class ProductController33 {
	

    private Product33Service product33Service;

    @Autowired
    public void setProduct33Service(Product33Service product33Service) {
        this.product33Service = product33Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products33", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products33", product33Service.listAllProducts33());
        System.out.println("Returning rpoducts33:");
        return "products33";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product33/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product33", product33Service.getProduct33ById(id));
        return "product33show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product33/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product33", product33Service.getProduct33ById(id));
        return "product33form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product33/new")
    public String newProduct33(Model model) {
        model.addAttribute("product33", new Product33());
        return "product33form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product33", method = RequestMethod.POST)
    public String saveProduct33(Product33 product33) {
        product33Service.saveProduct33(product33);
        return "redirect:/product33/" + product33.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product33/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product33Service.deleteProduct33(id);
        return "redirect:/products33";
    }

}


