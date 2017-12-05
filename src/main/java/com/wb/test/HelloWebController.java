package com.wb.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {


    @RequestMapping("/greeting")
    public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        System.out.println("hello");
        model.addAttribute("name", name);
        return "greeting";
    }



    @RequestMapping("/greeting222")
    public String hello2(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        System.out.println("hello22");
        model.addAttribute("name", name);
        return "aaa";
    }
}

