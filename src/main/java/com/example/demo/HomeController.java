package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by student on 6/28/17.
 */
@Controller
public class HomeController {
    @Autowired
    EduRepository eduRepository;
    @GetMapping ("/")
    public String mapSeeker()
    {
        return "index";
    }
    @RequestMapping ("/education")
    public String getResume(Model model)
    {
        model.addAttribute(new Education());
        return "education";
    }
    @PostMapping ("/education")
    public String postEducation(Model model, @ModelAttribute Education education)
    {
        education.setEmail("");
        model.addAttribute("degree",education.getDegree());
        model.addAttribute("school",education.getEmail());
        model.addAttribute("year",education.getYear());
        eduRepository.save(education);
        return "education";
    }

    /*
    @PostMapping("/addresume")
    public String postResume()
    {
        return
    }
    */



}
