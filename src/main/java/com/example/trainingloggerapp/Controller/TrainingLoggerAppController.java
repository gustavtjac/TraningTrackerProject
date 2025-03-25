package com.example.trainingloggerapp.Controller;


import com.example.trainingloggerapp.Models.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TrainingLoggerAppController {
    private User user;


    @GetMapping("/")
    public String landingPage(HttpSession session, Model model) {

        user = (User) session.getAttribute("user");
        if (user != null) {
            return "redirect:/overview";
        }

        return "landingpage";
    }
    @GetMapping("/login")
    public String loginPage(HttpSession session, Model model){
        user = (User) session.getAttribute("user");
        if (user != null) {
            return "redirect:/overview";
        }

        return "loginPage";
    }


    @PostMapping("/loginrequest")
    public String loginRequest(HttpSession session,@RequestParam String username, @RequestParam String password){


        return "redirect:/overview";
    }

    @PostMapping("/signuprequest")
    public String signUpRequest(HttpSession session, @RequestParam String username, @RequestParam String password){
        return "redirect:/overview";
    }




}
