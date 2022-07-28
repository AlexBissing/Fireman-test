package ru.bissing.firemantest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/start")
    public String start() {
        return "start";
    }
}
