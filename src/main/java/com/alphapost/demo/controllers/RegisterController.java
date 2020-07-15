package com.alphapost.demo.controllers;

import com.alphapost.demo.forms.RegisterForm;
import com.alphapost.demo.models.Password;
import com.alphapost.demo.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {
    @GetMapping(name = "/register")
    public String registerForm(Model model) {
        model.addAttribute("registerForm", new RegisterForm());
        return "register";
    }

    @PostMapping(name = "/register")
    public String registerSubmit(@ModelAttribute RegisterForm registerForm, Model model) {
        String username = registerForm.getUsername();
        String email = registerForm.getEmail();
        String password = registerForm.getPassword();
        String confirmPassword = registerForm.getConfirmPassword();

        if(!password.equals(confirmPassword)) {
            model.addAttribute("error_password", "[Passwords must be the same]");
            return "register";
        }

        //czy username wolny
        //czy email wolny

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);

        //add user to database
        //get user id

        Password password1 = new Password();
        password1.setPassword(password);
        //password1.setUser(userid);

        //add password to database
        model.addAttribute("submitForm", registerForm.toString());

        return "login";
    }
}
