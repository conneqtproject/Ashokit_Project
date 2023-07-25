package com.conneqt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "IES_PLANS")
public class IES_Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAN_ID")
    private Long planId;

    @Column(name = "PLAN_NAME")
    private String planName;

    @Column(name = "PLAN_START_DATE")
    private Date planStartDate;

    @Column(name = "PLAN_END_DATE")
    private Date planEndDate;

    @Column(name = "PLAN_CATEGORY")
    private String planCategory;

    @Column(name = "ACTIVE_SW", columnDefinition = "CHAR(1) default 'Y'")
    private String activeSw;

  
    @JoinColumn(name = "CREATED_BY", referencedColumnName = "USER_ID")
    private String createdBy;

 
    @JoinColumn(name = "UPDATED_BY", referencedColumnName = "USER_ID")
    private String updatedBy;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Date getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(Date planStartDate) {
		this.planStartDate = planStartDate;
	}

	public Date getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}

	public String getPlanCategory() {
		return planCategory;
	}

	public void setPlanCategory(String planCategory) {
		this.planCategory = planCategory;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}

