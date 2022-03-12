package com.francislainy.resumeportal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "hello";
    }

    @GetMapping("edit")
    public String edit() {
        return "edit page";
    }

    @PostMapping("/fail_login")
    public String handleFailedLogin() {
        return "redirect:/login?error";
    }

}

