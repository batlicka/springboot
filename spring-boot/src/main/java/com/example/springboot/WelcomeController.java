package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WelcomeController {

    private String message = "Hello World from Welcome controller";

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}
