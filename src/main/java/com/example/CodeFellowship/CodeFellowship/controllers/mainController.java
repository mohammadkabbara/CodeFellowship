package com.example.CodeFellowship.CodeFellowship.controllers;


import com.example.CodeFellowship.CodeFellowship.models.ApplicationUser;
import com.example.CodeFellowship.CodeFellowship.repos.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.Optional;

@Controller
public class mainController {


    @Autowired
    ApplicationUserRepository applicationUserRepository;

    @GetMapping("/")
    public String getHome(Principal principal, Model model){
        try{
            model.addAttribute("username",principal.getName());
        }catch (NullPointerException e){
            model.addAttribute("username","No user");
        }
        return "home.html";
    }
}
