package com.spring.demo.com.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

    @GetMapping("/test")
    @ResponseBody
    public String Name(){
        return "yamuna";
    }
    
}
