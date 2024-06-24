package com.bryansiegel.ccsdjobs.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Job {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String jobTitle;
    private String referenceCode;
    private String division;
    private String classification;
    private String termsOfEmployment;
    private String flaStatus;
    private String applyLink;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String positionSummary;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String positionExpectations;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String distinguishingCharacteristics;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String knowledgeSkillsAndAbilities;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String documentsRequiredAtTimeOfApplication;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String examplesOfAssignedWorkAreas;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String workEnvironment;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String examplesOfEquipmentSuppliesUsedToPerformTasks;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String essentialDutiesAndResponsibilities;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String positionRequirements;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String salaryAndBenefits;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String aaEoeStatement;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;


}
