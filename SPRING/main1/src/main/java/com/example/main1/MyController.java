package com.example.main1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping(value="/greeting")
    public String sayHello(){
        return "Good Morning";
    }
    @GetMapping(value="/greet")
    public String Hello(){
        return "Hi,Hello Good Morning EveryOne";
    }
    
}
