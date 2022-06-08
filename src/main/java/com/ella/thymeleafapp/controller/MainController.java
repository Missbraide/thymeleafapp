package com.ella.thymeleafapp.controller;

import com.ella.thymeleafapp.models.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Slf4j

@Controller
public class MainController {
    @GetMapping("/register")
    public String showForm(Model model){
        User user = new User();
        model.addAttribute("user", user);

        List<String> listProfession = Arrays.asList("Developer", "Tester", "Arhitect");
        model.addAttribute("listProfession", listProfession);

        return "register_form";
    }


    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user) {
        log.info("user");
        return "register_success";
    }

}
