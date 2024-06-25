package com.bryansiegel.ccsdjobs.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.internal.log.SubSystemLogging;

import java.time.LocalDateTime;

@Entity
public class Job {

    public Job() {
    }

    public Job(Long id, String jobTitle, String referenceCode, String division, String classification, String termsOfEmployment, String flaStatus, String applyLink, String jobFamily, String jobCategory, String positionSummary, String positionExpectations, String distinguishingCharacteristics, String knowledgeSkillsAndAbilities, String documentsRequiredAtTimeOfApplication, String examplesOfAssignedWorkAreas, String workEnvironment, String examplesOfEquipmentSuppliesUsedToPerformTasks, String essentialDutiesAndResponsibilities, String positionRequirements, String salaryAndBenefits, String aaEoeStatement, String preferredQualifications, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.referenceCode = referenceCode;
        this.division = division;
        this.classification = classification;
        this.termsOfEmployment = termsOfEmployment;
        this.flaStatus = flaStatus;
        this.applyLink = applyLink;
        this.jobFamily = jobFamily;
        this.jobCategory = jobCategory;
        this.positionSummary = positionSummary;
        this.positionExpectations = positionExpectations;
        this.distinguishingCharacteristics = distinguishingCharacteristics;
        this.knowledgeSkillsAndAbilities = knowledgeSkillsAndAbilities;
        this.documentsRequiredAtTimeOfApplication = documentsRequiredAtTimeOfApplication;
        this.examplesOfAssignedWorkAreas = examplesOfAssignedWorkAreas;
        this.workEnvironment = workEnvironment;
        this.examplesOfEquipmentSuppliesUsedToPerformTasks = examplesOfEquipmentSuppliesUsedToPerformTasks;
        this.essentialDutiesAndResponsibilities = essentialDutiesAndResponsibilities;
        this.positionRequirements = positionRequirements;
        this.salaryAndBenefits = salaryAndBenefits;
        this.aaEoeStatement = aaEoeStatement;
        this.preferredQualifications = preferredQualifications;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

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
    private String jobFamily;
    private String jobCategory;

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

    @Lob
    @Column(columnDefinition = "TEXT")
    private String preferredQualifications;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getTermsOfEmployment() {
        return termsOfEmployment;
    }

    public void setTermsOfEmployment(String termsOfEmployment) {
        this.termsOfEmployment = termsOfEmployment;
    }

    public String getFlaStatus() {
        return flaStatus;
    }

    public void setFlaStatus(String flaStatus) {
        this.flaStatus = flaStatus;
    }

    public String getApplyLink() {
        return applyLink;
    }

    public void setApplyLink(String applyLink) {
        this.applyLink = applyLink;
    }

    public String getJobFamily() {
        return jobFamily;
    }

    public void setJobFamily(String jobFamily) {
        this.jobFamily = jobFamily;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getPositionSummary() {
        return positionSummary;
    }

    public void setPositionSummary(String positionSummary) {
        this.positionSummary = positionSummary;
    }

    public String getPositionExpectations() {
        return positionExpectations;
    }

    public void setPositionExpectations(String positionExpectations) {
        this.positionExpectations = positionExpectations;
    }

    public String getDistinguishingCharacteristics() {
        return distinguishingCharacteristics;
    }

    public void setDistinguishingCharacteristics(String distinguishingCharacteristics) {
        this.distinguishingCharacteristics = distinguishingCharacteristics;
    }

    public String getKnowledgeSkillsAndAbilities() {
        return knowledgeSkillsAndAbilities;
    }

    public void setKnowledgeSkillsAndAbilities(String knowledgeSkillsAndAbilities) {
        this.knowledgeSkillsAndAbilities = knowledgeSkillsAndAbilities;
    }

    public String getDocumentsRequiredAtTimeOfApplication() {
        return documentsRequiredAtTimeOfApplication;
    }

    public void setDocumentsRequiredAtTimeOfApplication(String documentsRequiredAtTimeOfApplication) {
        this.documentsRequiredAtTimeOfApplication = documentsRequiredAtTimeOfApplication;
    }

    public String getExamplesOfAssignedWorkAreas() {
        return examplesOfAssignedWorkAreas;
    }

    public void setExamplesOfAssignedWorkAreas(String examplesOfAssignedWorkAreas) {
        this.examplesOfAssignedWorkAreas = examplesOfAssignedWorkAreas;
    }

    public String getWorkEnvironment() {
        return workEnvironment;
    }

    public void setWorkEnvironment(String workEnvironment) {
        this.workEnvironment = workEnvironment;
    }

    public String getExamplesOfEquipmentSuppliesUsedToPerformTasks() {
        return examplesOfEquipmentSuppliesUsedToPerformTasks;
    }

    public void setExamplesOfEquipmentSuppliesUsedToPerformTasks(String examplesOfEquipmentSuppliesUsedToPerformTasks) {
        this.examplesOfEquipmentSuppliesUsedToPerformTasks = examplesOfEquipmentSuppliesUsedToPerformTasks;
    }

    public String getEssentialDutiesAndResponsibilities() {
        return essentialDutiesAndResponsibilities;
    }

    public void setEssentialDutiesAndResponsibilities(String essentialDutiesAndResponsibilities) {
        this.essentialDutiesAndResponsibilities = essentialDutiesAndResponsibilities;
    }

    public String getPositionRequirements() {
        return positionRequirements;
    }

    public void setPositionRequirements(String positionRequirements) {
        this.positionRequirements = positionRequirements;
    }

    public String getSalaryAndBenefits() {
        return salaryAndBenefits;
    }

    public void setSalaryAndBenefits(String salaryAndBenefits) {
        this.salaryAndBenefits = salaryAndBenefits;
    }

    public String getAaEoeStatement() {
        return aaEoeStatement;
    }

    public void setAaEoeStatement(String aaEoeStatement) {
        this.aaEoeStatement = aaEoeStatement;
    }

    public String getPreferredQualifications() {
        return preferredQualifications;
    }

    public void setPreferredQualifications(String preferredQualifications) {
        this.preferredQualifications = preferredQualifications;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", referenceCode='" + referenceCode + '\'' +
                ", division='" + division + '\'' +
                ", classification='" + classification + '\'' +
                ", termsOfEmployment='" + termsOfEmployment + '\'' +
                ", flaStatus='" + flaStatus + '\'' +
                ", applyLink='" + applyLink + '\'' +
                ", jobFamily='" + jobFamily + '\'' +
                ", jobCategory='" + jobCategory + '\'' +
                ", positionSummary='" + positionSummary + '\'' +
                ", positionExpectations='" + positionExpectations + '\'' +
                ", distinguishingCharacteristics='" + distinguishingCharacteristics + '\'' +
                ", knowledgeSkillsAndAbilities='" + knowledgeSkillsAndAbilities + '\'' +
                ", documentsRequiredAtTimeOfApplication='" + documentsRequiredAtTimeOfApplication + '\'' +
                ", examplesOfAssignedWorkAreas='" + examplesOfAssignedWorkAreas + '\'' +
                ", workEnvironment='" + workEnvironment + '\'' +
                ", examplesOfEquipmentSuppliesUsedToPerformTasks='" + examplesOfEquipmentSuppliesUsedToPerformTasks + '\'' +
                ", essentialDutiesAndResponsibilities='" + essentialDutiesAndResponsibilities + '\'' +
                ", positionRequirements='" + positionRequirements + '\'' +
                ", salaryAndBenefits='" + salaryAndBenefits + '\'' +
                ", aaEoeStatement='" + aaEoeStatement + '\'' +
                ", preferredQualifications='" + preferredQualifications + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
