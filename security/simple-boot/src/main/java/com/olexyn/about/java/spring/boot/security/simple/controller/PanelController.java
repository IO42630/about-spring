package com.olexyn.about.java.spring.boot.security.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PanelController {

    @GetMapping("/user-panel")
    public String getUserPanel() {
        return "USER PANEL";
    }

    @GetMapping("/admin-panel")
    public String getAdminPanel() {
        return "ADMIN PANEL";
    }

    @GetMapping("/logout")
    public String getLogout() {
        return "LOGOUT";
    }

}
