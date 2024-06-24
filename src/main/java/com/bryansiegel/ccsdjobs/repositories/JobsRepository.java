package com.bryansiegel.ccsdjobs.repositories;

import com.bryansiegel.ccsdjobs.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends JpaRepository<Job, Long> {

}
