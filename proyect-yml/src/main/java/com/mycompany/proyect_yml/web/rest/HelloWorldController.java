package com.mycompany.proyect_yml.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloWorldController {

    @RequestMapping("/Hello")
    public String hello(){
        String name="Hello";
        name = name.replace('e','x');
        return name;
    }
    @GetMapping("/greet")
    public String greet(){
        return "Greetting for Spring boot!!";
    }
}
