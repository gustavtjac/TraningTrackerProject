package com.example.trainingloggerapp.Controller;


import com.example.trainingloggerapp.Models.User;
import com.example.trainingloggerapp.Service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TrainingLoggerAppController {
    private User user;

   @Autowired
    private UserService userService;


    @GetMapping("/")
    public String landingPage(HttpSession session, Model model) {

        user = (User) session.getAttribute("user");
        if (user != null) {
            return "redirect:/overview";
        }

        return "landingpage";
    }
    @GetMapping("/login")
    public String loginPage(HttpSession session, Model model,@RequestParam(value = "error", required = false) String error){
        user = (User) session.getAttribute("user");
        if (user != null) {
            return "redirect:/overview";
        }
        if (error != null){
            model.addAttribute("errorMessage","Invalid Username or Password");
        }

        return "loginPage";
    }


    @GetMapping("/overview")
    public String overviewPage(HttpSession session,Model model){
        if ((User) session.getAttribute("user")== null){
            return "redirect:/login";
        }
        model.addAttribute("user",session.getAttribute("user"));


        return "overview";
    }

    @PostMapping("/loginrequest")
    public String loginRequest(HttpSession session, @RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes){
        user =(User) session.getAttribute("user");
        if (user!=null){
            return "redirect:/overview";
        }else {
           User loginUser = userService.checkIfLoginInfoIsCorrect(username,password);
           session.setAttribute("user",loginUser);
           if (session.getAttribute("user")==null){
               redirectAttributes.addAttribute("error","true");
               return "redirect:/login";
           }else {
               return "redirect:/overview";
           }
        }
    }

    @PostMapping("/signuprequest")
    public String signUpRequest(HttpSession session, @RequestParam String username, @RequestParam String password){
        return "redirect:/overview";
    }




}
