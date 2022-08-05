package ru.bissing.firemantest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting() {
        return "greeting";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/results")
    public String results() {
        return "results";
    }
}
