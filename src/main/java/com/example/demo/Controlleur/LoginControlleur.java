package com.example.demo.Controlleur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LoginControlleur {   
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("email", "");
        model.addAttribute("password", "");
        return "login";
    }
}
/*
    @PostMapping("/login")
    public String login(
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            Model model
    ) {
        if (email.isEmpty() || password.isEmpty()) {
            model.addAttribute("error", "Email or password is empty");
            return "login";
        }

        // Vérifiez l'email
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            model.addAttribute("error", "Email is invalid");
            return "login";
        }

        // Vérifiez le mot de passe
        if (password.length() < 8) {
            model.addAttribute("error", "Password must be at least 8 characters long");
            return "login";
        }

        // Si toutes les informations sont correctes, connectez l'utilisateur
        return "redirect:/home";
    }
 */