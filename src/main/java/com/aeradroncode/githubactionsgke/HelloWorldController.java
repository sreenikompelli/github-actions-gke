package com.aeradroncode.githubactionsgke;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    public String helloWorld(){
        return "Welcome to Pyxos.AI App V1.";
    }
}
