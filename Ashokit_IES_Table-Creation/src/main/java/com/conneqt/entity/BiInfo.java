package com.conneqt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BI_INFO")
public class BiInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "benefit_id")
    private Long benefitId;

   
    @JoinColumn(name = "case_num", referencedColumnName = "case_num")
    private String caseInfo;

    @Column(name = "benefit_month_year")
    private String benefitMonthYear;

    @Column(name = "benefit_amt")
    private double benefitAmount;

    @Column(name = "transaction_date")
    private Date transactionDate;

    @Column(name = "transaction_status")
    private String transactionStatus;

	public Long getBenefitId() {
		return benefitId;
	}

	public void setBenefitId(Long benefitId) {
		this.benefitId = benefitId;
	}

	public String getCaseInfo() {
		return caseInfo;
	}

	public void setCaseInfo(String caseInfo) {
		this.caseInfo = caseInfo;
	}

	public String getBenefitMonthYear() {
		return benefitMonthYear;
	}

	public void setBenefitMonthYear(String benefitMonthYear) {
		this.benefitMonthYear = benefitMonthYear;
	}

	public double getBenefitAmount() {
		return benefitAmount;
	}

	public void setBenefitAmount(double benefitAmount) {
		this.benefitAmount = benefitAmount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

    
}
