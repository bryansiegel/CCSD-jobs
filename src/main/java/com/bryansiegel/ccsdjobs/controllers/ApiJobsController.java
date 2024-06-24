package com.bryansiegel.ccsdjobs.controllers;

import com.bryansiegel.ccsdjobs.models.Job;
import com.bryansiegel.ccsdjobs.repositories.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiJobsController {

    private final JobsRepository jobsRepository;

    @Autowired
    public ApiJobsController(JobsRepository jobsRepository) {
        this.jobsRepository = jobsRepository;
    }

    @GetMapping("api/v1/jobs")
    public List<Job> getAllJobs() {
        return jobsRepository.findAll();
    }
}
