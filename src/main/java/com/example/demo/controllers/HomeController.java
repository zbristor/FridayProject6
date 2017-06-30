package com.example.demo.controllers;

import com.example.demo.*;
import com.example.demo.EduRepository;
import com.example.demo.Education;
import com.example.demo.SkillRepository;
import com.example.demo.Skills;
import com.example.demo.Work;
import com.example.demo.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * Created by student on 6/28/17.
 */
@Controller
public class HomeController {
    @Autowired
    EduRepository eduRepository;
    @Autowired
    WorkRepository workRepository;
    @Autowired
    SkillRepository skillRepository;
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
    public String postEducation(Model model, @ModelAttribute Education education, Principal principal) {
        String username = principal.getName();
        education.setEmail(username);
        //System.out.println(principal.getName());
        eduRepository.save(education);
        model.addAttribute(new Education());
        return "education";
    }

    @RequestMapping("/work")
    public String getWork(Model model)
    {
        model.addAttribute(new Work());
        return "work";
    }
    @PostMapping ("/work")
    public String postWork(@ModelAttribute Work work, Model model, Principal principal)
    {
        work.setEmail(principal.getName());
        workRepository.save(work);
        model.addAttribute(new Work());
        return "work";
    }
    @RequestMapping("/skills")
    public String getSkills(Model model)
    {
        model.addAttribute(new Skills());
        return "skills";
    }
    @PostMapping("/skills")
    public String postSkills(@ModelAttribute Skills skills, Model model, Principal principal)
    {
        skills.setEmail(principal.getName());
        //model.addAttribute("skill",skills.getSkill());
        skillRepository.save(skills);
        model.addAttribute(new Skills());
        return "skills";
    }
    @GetMapping("/generateresume")
    public String generateResume(Model model, Principal principal)
    {
        Iterable<Education> educationList = eduRepository.findTop10ByEmail(principal.getName());
        model.addAttribute("educationList", educationList);
        Iterable<Work> workList = workRepository.findTop10ByEmail(principal.getName());
        model.addAttribute("workList", workList);
        Iterable<Skills> skillList = skillRepository.findTop20ByEmail(principal.getName());
        model.addAttribute("skillList", skillList);
        return "generateresume";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }



}
