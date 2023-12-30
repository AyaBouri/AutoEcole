package com.example.demo.Controlleur;
import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.Model.User;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
@Controller
@RequestMapping("/inscription")
public class InscriptionControlleur {
    @Autowired
    private User user;
    @InitBinder
    protected void InitBinder(WebDataBinder binder){
        binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport(){
            @Override
            public void setAsText(String text){
                setValue(LocalDate.parse(text));
            }
        });
    }
    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "inscriptionForm";
    }
    @PostMapping
    public String processForm(@Valid @ModelAttribute("user") User person, BindingResult result) {
        if (result.hasErrors() || person.calculerAge() < 18) {
            return "inscriptionForm";
        }
        // Traitement d'inscription ici
        return "inscriptionSuccess";
    }
    @PostMapping("/inscription")
    public String inscription(@Valid @ModelAttribute("user") User user,BindingResult bindingResult,HttpServletResponse response){
        if(bindingResult.hasErrors()){
            return "inscription";
        }
        String token=UUID.randomUUID().toString();
        Cookie cookie=new Cookie("user_token",token);
        cookie.setMaxAge(60 * 60 *24 * 30);//30 jours
        response.addCookie(cookie);
        return "redirect:/home";
    }
}