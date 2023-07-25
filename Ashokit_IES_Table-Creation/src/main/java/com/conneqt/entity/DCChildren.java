package com.conneqt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DC_CHILDREN")
public class DCChildren {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "child_id")
    private Long childId;

    @Column(name = "child_name")
    private String childName;

    @Column(name = "child_dob")
    private Date childDob;

    @Column(name = "child_ssn")
    private String childSsn;


    @JoinColumn(name = "case_num", referencedColumnName = "case_num")
    private String caseInfo;

	public Long getChildId() {
		return childId;
	}

	public void setChildId(Long childId) {
		this.childId = childId;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public Date getChildDob() {
		return childDob;
	}

	public void setChildDob(Date childDob) {
		this.childDob = childDob;
	}

	public String getChildSsn() {
		return childSsn;
	}

	public void setChildSsn(String childSsn) {
		this.childSsn = childSsn;
	}

	public String getCaseInfo() {
		return caseInfo;
	}

	public void setCaseInfo(String caseInfo) {
		this.caseInfo = caseInfo;
	}

    
    
}