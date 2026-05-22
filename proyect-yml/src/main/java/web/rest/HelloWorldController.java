package web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @RequestMapping("/Hello")
    public String hello(){
        String name = "Hello";
        name = name.replace("e","x");
        return name;
    }
    @RequestMapping("greet")
    public String greet(){
        return "Greetting for Spring boot!";
    }


}
