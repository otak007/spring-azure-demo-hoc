package com.hoc.springazuredemohoc.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {

    @GetMapping("/")
    @PreAuthorize("hasRole('ROLE_group1') or hasRole('ROLE_group2')")
    public String home(Principal principal) {
        return "Welcome " + principal.getName() + ", you are logged in successfully!";
    }

    @GetMapping("/group1")
    @PreAuthorize("hasRole('ROLE_group1')")
    public String group1(Principal principal) {
        return "Hello Group1 users this is: " + principal.getName();
    }

    @GetMapping("/group2")
    @PreAuthorize("hasRole('ROLE_group2')")
    public String group2(Principal principal) {
        return "Hello Group2 users this is: " + principal.getName();
    }
}
