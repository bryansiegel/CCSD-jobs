package com.bryansiegel.ccsdjobs.controllers;

import com.bryansiegel.ccsdjobs.repositories.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicController {

    private final JobsRepository _jobsRepository;

    @Autowired
    public PublicController(JobsRepository jobsRepository) {
        _jobsRepository = jobsRepository;
    }


    //index
    @GetMapping("/")
    private String index(Model model) {
        model.addAttribute("jobs", _jobsRepository.findAll());
        return "public/index";
    }

}
