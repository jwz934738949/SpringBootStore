package cn.edu.sdut.springbootstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("top")
    public String top() {
        return "main/top";
    }

    @RequestMapping("left")
    public String left() {
        return "main/left";
    }

    @RequestMapping("right")
    public String right() {
        return "main/right";
    }
}
