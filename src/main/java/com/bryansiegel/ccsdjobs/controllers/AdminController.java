package com.bryansiegel.ccsdjobs.controllers;

import com.bryansiegel.ccsdjobs.models.Job;
import com.bryansiegel.ccsdjobs.repositories.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class AdminController {

    private final JobsRepository jobsRepository;

    @Autowired
    public AdminController(JobsRepository jobsRepository) {
        this.jobsRepository = jobsRepository;
    }

    //set limit on results
    Pageable limit = PageRequest.of(0, 5);

    @GetMapping("/admin/dashboard/")
    public String admin(Model model) {
        model.addAttribute("jobs", jobsRepository.findAll(limit));
        return "admin/dashboard.html";
    }

    //jobs index
    @GetMapping("/admin/jobs/")
    public String jobs(Model model) {
        model.addAttribute("jobs", jobsRepository.findAll(limit));
        return "admin/jobs/index.html";
    }

    //jobs create
    @GetMapping("/admin/jobs/create")
    public String create(Model model) {
        Job job = new Job();
        model.addAttribute("jobs", job);
        return "admin/jobs/create.html";
    }

    //jobs post create
    @PostMapping("/admin/jobs/create")
    public String postCreate(@ModelAttribute Job job, @RequestParam String jobTitle, BindingResult result) {

        if(result.hasErrors())
        {
            return "admin/jobs/create.html";
        }

//        Job job = new Job();
        jobsRepository.save(job);

        return "redirect:/admin/jobs/";
    }

    //edit
    @GetMapping("/admin/jobs/edit/{id}")
    public String editJobs(@PathVariable Long id, Model model) {

        Job job = jobsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("jobs", job);

        return "admin/jobs/edit.html";
    }

    //update
    @PostMapping("admin/jobs/update/{id}")
    public String updateJob(@ModelAttribute Job job, @PathVariable Long id, @RequestParam String jobTitle, BindingResult result) {

        if(result.hasErrors()) {
            return "admin/jobs/create.html";
        }

        Optional<Job> optionalJob = jobsRepository.findById(id);

        if(optionalJob.isPresent()) {
            Job jobModel = optionalJob.get();
            jobModel.setJobTitle(jobTitle);

            jobsRepository.save(jobModel);
        }

        return "redirect:/admin/jobs/";
    }

    //delete
    @GetMapping("admin/jobs/delete/{id}")
    public String deleteJob(@PathVariable Long id) {
        Job job = jobsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid User Id:" + id));
        jobsRepository.delete(job);

        return "redirect:/admin/jobs/";
    }

    //
}
