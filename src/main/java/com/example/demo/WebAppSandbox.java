package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class WebAppSandbox {

    @RequestMapping("/holabetocomoestas")
    public String SandboxTest (){

        return "hello.html";
    }


    @RequestMapping("/home")
    public String gethome(Model model){

        model.addAttribute("todayDate", new Date().toString());
        return "home.html";
    }
}
