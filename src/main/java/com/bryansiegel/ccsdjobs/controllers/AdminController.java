package com.bryansiegel.ccsdjobs.controllers;

import com.bryansiegel.ccsdjobs.repositories.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    private final JobsRepository jobsRepository;

    @Autowired
    public AdminController(JobsRepository jobsRepository) {
        this.jobsRepository = jobsRepository;
    }

    //set limit on results
    Pageable limit = PageRequest.of(0,5);

    @GetMapping("admin/dashboard")
    public String admin(Model model) {
        model.addAttribute("jobs", jobsRepository.findAll(limit));
        return "admin/dashboard.html";
    }

}
