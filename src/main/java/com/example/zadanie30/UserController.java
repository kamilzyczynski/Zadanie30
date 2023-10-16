package com.example.zadanie30;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/addUser")
    public String addUser(Model model, @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("user", user);
            return "index";
        }

        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }
}
