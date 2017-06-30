package com.example.demo.controllers;

import com.example.demo.*;
import com.example.demo.Person;
import com.example.demo.EduRepository;
import com.example.demo.Education;
import com.example.demo.SkillRepository;
import com.example.demo.Skills;
import com.example.demo.Work;
import com.example.demo.WorkRepository;
import com.example.demo.models.User;
import com.example.demo.repositories.PersonRepository;
import com.example.demo.repositories.UserRepository;
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
    @Autowired
    UserRepository userRepository;
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
    public String generateResume(Model model, Principal principal,@ModelAttribute User user, @ModelAttribute Person person)
    {
        model.addAttribute(new Person());
        person.setEmail(principal.getName());
        /*
        Person fname = personRepository.findFnameByEmail(principal.getName());
        model.addAttribute("fname",fname);
        Person lname = personRepository.findLnameByEmail(principal.getName());
        model.addAttribute("lname",lname.toString());
        */
        model.addAttribute("email",principal.getName());
        Iterable<Education> educationList = eduRepository.findTop10ByEmail(principal.getName());
        model.addAttribute("educationList", educationList);
        Iterable<Work> workList = workRepository.findTop10ByEmail(principal.getName());
        model.addAttribute("workList", workList);
        Iterable<Skills> skillList = skillRepository.findTop20ByEmail(principal.getName());
        model.addAttribute("skillList", skillList);
        return "generateresume";
    }
    @GetMapping("/seekersearch")
    public String getSeekersearch(Model model)
    {
        model.addAttribute(new User());
        return "seekersearch";
    }
    @PostMapping("/seekersearch")
    public String postSeekersearch(User user, Model model){
        String userna = user.getUsername();
        Iterable<User> userList=userRepository.findAllByUsername(userna);
        model.addAttribute("userList",userList);
        return "seekerresult";
    }
    @GetMapping("/recreuitUserSearch")
    public String getUserSearch(Model model)
    {
        model.addAttribute(new User());
        return "recreuitUserSearch";
    }
    @PostMapping("/recreuitUserSearch")
    public String postUserSearch(User user, Model model){
        String userna = user.getUsername();
        Iterable<User> userList=userRepository.findAllByUsername(userna);
        model.addAttribute("userList",userList);
        return "userresult";
    }
    @GetMapping("/recruitSchoolSearch")
    public String getSchoolSearch(Model model, Education education)
    {
        model.addAttribute(new Education());
        return "recruitSchoolSearch";
    }
    @PostMapping("/recruitSchoolSearch")
    public String postSchoolSearch(Education education, Model model){
        String userna = education.getSchool();
        Iterable<Education> schoolList=eduRepository.findBySchool(userna);
        model.addAttribute("schoolList",schoolList);
        return "schoolresult";
    }
    @GetMapping("/recruitCompanySearch")
    public String getCompanySearch(Model model)
    {
        model.addAttribute(new Work());
        return "recruitCompanySearch";
    }
    @PostMapping("/recruitCompanySearch")
    public String postCompanySearch(Work work, Model model) {
        String userna = work.getCompany();
        Iterable<Work> companyList = workRepository.findByCompany(userna);
        model.addAttribute("companyList", companyList);
        return "companysearch";
    }
    @GetMapping("/recruitSkillSearch")
    public String getSkillSearch(Model model)
    {
        model.addAttribute(new Skills());
        return "recruitSkillSearch";
    }
    @PostMapping("/recruitSkillSearch")
    public String postSkillSearch(Skills skills, Model model) {
        String userna = skills.getSkill();
        Iterable<Skills> skillList = skillRepository.findBySkill(userna);
        model.addAttribute("skillList", skillList);
        return "skillsearch";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }



}
