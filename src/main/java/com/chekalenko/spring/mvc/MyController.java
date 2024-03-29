package com.chekalenko.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String asEmployeeDetails() {
        return "ask-amp-details-view";
    }

    @RequestMapping("/showEmpDetails")
    public String showEmpDetails() {
        return "show-emp-details-view";
    }
}
