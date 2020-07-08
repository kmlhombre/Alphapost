package com.alphapost.demo.controllers;

import com.alphapost.demo.forms.RegisterForm;
import com.alphapost.demo.models.Password;
import com.alphapost.demo.models.User;
import com.alphapost.demo.repositories.PasswordRepository;
import com.alphapost.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordRepository passwordRepository;

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
        //zmiana nazwy z user na userTbl
        List<User> checkUser = userRepository.findUsersByUsername(username);
        if(checkUser.size() > 0) {
            model.addAttribute("error_username", "[Username exist in database]");
            return "register";
        }

        checkUser = userRepository.findUsersByEmail(email);
        if(checkUser.size() > 0) {
            model.addAttribute("error_email", "[Email exist in database]");
            return "register";
        }

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);

        userRepository.save(user);
        List<User> users = userRepository.findUsersByUsername(username);

        Password password1 = new Password();
        password1.setPassword(password);
        password1.setUser(users.get(0));

        passwordRepository.save(password1);
        model.addAttribute("submitForm", registerForm.toString());

        return "index";
    }
}
