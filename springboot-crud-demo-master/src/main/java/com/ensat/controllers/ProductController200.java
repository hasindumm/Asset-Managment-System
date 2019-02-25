package com.ensat.controllers;

import com.ensat.entities.Product200;
import com.ensat.services.Product200Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller200.
 */
@Controller

public class ProductController200 {
	

    private Product200Service product200Service;

    @Autowired
    public void setProduct200Service(Product200Service product200Service) {
        this.product200Service = product200Service;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products200", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products200", product200Service.listAllProducts200());
        System.out.println("Returning rpoducts200:");
        return "products200";
    }
    
   

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("product200/{id}")
    public String showProduct200(@PathVariable Integer id, Model model) {
        model.addAttribute("product200", product200Service.getProduct200ById(id));
        return "product200show";
    }
    
    

    // Afficher le formulaire de modification du Product
    @RequestMapping("product200/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product200", product200Service.getProduct200ById(id));
        return "product200form";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("product200/new")
    public String newProduct200(Model model) {
        model.addAttribute("product200", new Product200());
        return "product200form";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "product200", method = RequestMethod.POST)
    public String saveProduct200(Product200 product200) {
        product200Service.saveProduct200(product200);
        return "redirect:/product200/" + product200.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("product200/delete/{id}")
    public String delete(@PathVariable Integer id) {
        product200Service.deleteProduct200(id);
        return "redirect:/products200";
    }

}

