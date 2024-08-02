package org.example.casestudymodule4shoestore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    @GetMapping
    public String home(){
        return "index";
    }

    @GetMapping("/shop")
    public String shop(){
        return "shop";
    }

    @GetMapping("/detail")
    public String detail(){
        return "detail";
    }

    @GetMapping("/cart")
    public String cart(){
        return "cart";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/checkout")
    public String checkout(){
        return "checkout";
    }

    @GetMapping("/thankyou")
    public String thankYou(){
        return "thankyou";
    }

}
