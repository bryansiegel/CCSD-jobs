package com.bryansiegel.ccsdjobs.controllers;

import com.bryansiegel.ccsdjobs.models.Job;
import com.bryansiegel.ccsdjobs.repositories.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    //public job view
    @GetMapping("/job/details/{id}")
    private String jobDetails(@PathVariable Long id, Model model) {
        Job job = _jobsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("job", job);

        return "public/jobs/details";

    }

}
