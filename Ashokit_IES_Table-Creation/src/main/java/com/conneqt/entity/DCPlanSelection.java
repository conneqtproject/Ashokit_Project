package com.conneqt.entity;

import javax.persistence.*;

@Entity
@Table(name = "DC_PLAN_SELECTION")
public class DCPlanSelection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_selection_id")
    private Long planSelectionId;

    @Column(name = "case_num")
    private String caseNum;

    @Column(name = "plan_id")
    private Long planId;

	public Long getPlanSelectionId() {
		return planSelectionId;
	}

	public void setPlanSelectionId(Long planSelectionId) {
		this.planSelectionId = planSelectionId;
	}

	public String getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(String caseNum) {
		this.caseNum = caseNum;
	}

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

    
}

