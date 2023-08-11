package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfileController {
    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public String showProfilePage(@RequestParam("email") String email, Model model) {
        // Retrieve the authenticated user (assuming you have the user's email stored in session or security context)
       // String userEmail = "chandinichowdary1323@gmail.com"; // Replace with actual email retrieval method
        User user = userService.getUserByEmail(email);

        if (user != null) {
            model.addAttribute("user", user);
            return "profile";
        } else {
            // Handle case when user is not found
            return "redirect:/login"; // Or show an error page
        }
    }
}
