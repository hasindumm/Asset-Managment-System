package com.ensat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Homepage controller.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String index() {
        return "index";
    }
    
    @RequestMapping("/icon")
    String icon() {
        return "icon";
    }
    
    @RequestMapping("/icon2")
    String icon2() {
        return "icon2";
    }
    
    @RequestMapping("/icon3")
    String icon3() {
        return "icon3";
    }
    
    
    @RequestMapping("/calander")
    String calander() {
        return "calander";
    }
    
    @RequestMapping("/chart")
    String chart() {
        return "chart";
    }
    
    @RequestMapping("/aboutus")
    String aboutus() {
        return "aboutus";
    }
    
    @RequestMapping("/gallary")
    String gallary() {
        return "gallary";
    }
   
    @RequestMapping("/feedback")
    String feedback() {
        return "feedback";
    }

}
