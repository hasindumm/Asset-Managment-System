package com.ensat.controllers;

import com.ensat.entities.Product30;
import com.ensat.services.Product30Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller30.
 */
@Controller

public class ProductController30 {
	

    private Product30Service product30Service;

    @Autowired
    public void setProduct30Service(Product30Service product30Service) {
        this.product30Service = product30Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products30", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products30", product30Service.listAllProducts30());
        System.out.println("Returning rpoducts30:");
        return "products30";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product30/{id}")
    public String showProduc21(@PathVariable Integer id, Model model) {
        model.addAttribute("product30", product30Service.getProduct30ById(id));
        return "product30show";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("product30/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product30", product30Service.getProduct30ById(id));
        return "product30form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product30/new")
    public String newProduct30(Model model) {
        model.addAttribute("product30", new Product30());
        return "product30form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product30", method = RequestMethod.POST)
    public String saveProduct30(Product30 product30) {
        product30Service.saveProduct30(product30);
        return "redirect:/product30/" + product30.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product30/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product30Service.deleteProduct30(id);
        return "redirect:/products30";
    }

}

