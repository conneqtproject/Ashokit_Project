package com.conneqt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ED_ELIG_DTLS")
public class EdEligibilityDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ed_trace_id")
    private Long edTraceId;

    @Column(name = "plan_name")
    private String planName;

    @Column(name = "plan_status")
    private String planStatus;

    @Column(name = "elig_start_date")
    private Date eligibilityStartDate;

    @Column(name = "elig_end_date")
    private Date eligibilityEndDate;

    @Column(name = "benefit_amt")
    private Double benefitAmount;

    @Column(name = "denial_reason")
    private String denialReason;

    @Column(name = "created_date")
    private Date createdDate;

    // Assuming there is a Many-to-One relationship with another entity called CaseDetails
    
    @JoinColumn(name = "case_num")
    private String caseDetails;

	public Long getEdTraceId() {
		return edTraceId;
	}

	public void setEdTraceId(Long edTraceId) {
		this.edTraceId = edTraceId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Date getEligibilityStartDate() {
		return eligibilityStartDate;
	}

	public void setEligibilityStartDate(Date eligibilityStartDate) {
		this.eligibilityStartDate = eligibilityStartDate;
	}

	public Date getEligibilityEndDate() {
		return eligibilityEndDate;
	}

	public void setEligibilityEndDate(Date eligibilityEndDate) {
		this.eligibilityEndDate = eligibilityEndDate;
	}

	public Double getBenefitAmount() {
		return benefitAmount;
	}

	public void setBenefitAmount(Double benefitAmount) {
		this.benefitAmount = benefitAmount;
	}

	public String getDenialReason() {
		return denialReason;
	}

	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCaseDetails() {
		return caseDetails;
	}

	public void setCaseDetails(String caseDetails) {
		this.caseDetails = caseDetails;
	}

    
}
