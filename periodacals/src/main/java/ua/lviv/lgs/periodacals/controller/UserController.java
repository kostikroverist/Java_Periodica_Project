package ua.lviv.lgs.periodacals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ua.lviv.lgs.periodacals.domain.User;
import ua.lviv.lgs.periodacals.dto.RegistUserDto;
import ua.lviv.lgs.periodacals.service.UserService;

@Controller
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping(value = "/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new RegistUserDto());

        return "registration";
    }

    @PostMapping(value = "/registration")
    public String registration(@ModelAttribute("userForm") RegistUserDto userForm, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userService.save(userForm);


        return "redirect:/home";
    }

    @GetMapping(value = {"/", "/login"})
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @GetMapping(value ="/home")
    public String welcome(Model model) {
        return "home";
    }


}
