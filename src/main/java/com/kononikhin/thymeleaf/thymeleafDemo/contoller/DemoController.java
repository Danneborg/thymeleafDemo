package com.kononikhin.thymeleaf.thymeleafDemo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String helloMethod(Model model) {
        model.addAttribute("hello", "hello world from thymeleaf");
        model.addAttribute("date", new java.util.Date());

        return "helloModel";
    }

}
