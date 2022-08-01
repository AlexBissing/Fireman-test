package ru.bissing.firemantest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/practice")
    public String practice() {
        return "practice";
    }

    @GetMapping("/results")
    public String results() {
        return "results";
    }
}
