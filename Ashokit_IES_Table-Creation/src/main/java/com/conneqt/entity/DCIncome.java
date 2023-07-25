package com.conneqt.entity;

import javax.persistence.*;

@Entity
@Table(name = "DC_INCOME")
public class DCIncome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "income_id")
    private Long incomeId;

    @Column(name = "salary_income")
    private double salaryIncome;

    @Column(name = "rent_income")
    private double rentIncome;

    @Column(name = "property_income")
    private double propertyIncome;

  
 
    @JoinColumn(name = "case_num", referencedColumnName = "case_num")
    private String caseEntity;


	public Long getIncomeId() {
		return incomeId;
	}


	public void setIncomeId(Long incomeId) {
		this.incomeId = incomeId;
	}


	public double getSalaryIncome() {
		return salaryIncome;
	}


	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}


	public double getRentIncome() {
		return rentIncome;
	}


	public void setRentIncome(double rentIncome) {
		this.rentIncome = rentIncome;
	}


	public double getPropertyIncome() {
		return propertyIncome;
	}


	public void setPropertyIncome(double propertyIncome) {
		this.propertyIncome = propertyIncome;
	}


	public String getCaseEntity() {
		return caseEntity;
	}


	public void setCaseEntity(String caseEntity) {
		this.caseEntity = caseEntity;
	}

    

    
}
