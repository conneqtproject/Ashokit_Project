package com.conneqt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "IES_APPS")
public class IES_App {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CASE_NUM")
    private Long caseNum;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHNO")
    private String phoneNumber;

    @Column(name = "DOB")
    private Date dateOfBirth;

    @Column(name = "SSN")
    private String ssn;

    @Column(name = "STATE_NAME")
    private String stateName;

    @Column(name = "CITY_NAME")
    private String cityName;

    @Column(name = "HOUSE_NUM")
    private String houseNumber;

   
    @JoinColumn(name = "CREATED_BY", referencedColumnName = "USER_ID")
    private String createdBy;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    
    public IES_App() {
    }


	public Long getCaseNum() {
		return caseNum;
	}


	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

    // Getters and Setters (Omitted for brevity)

    // Other methods (Omitted for brevity)
}
