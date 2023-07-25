package com.conneqt.entity;

import javax.persistence.*;

@Entity
@Table(name = "DC_EDUCATION")
public class DCEducation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_id")
    private Long educationId;

    @Column(name = "highest_degree")
    private String highestDegree;

    @Column(name = "graduation_year")
    private int graduationYear;

    @Column(name = "university")
    private String university;


    @JoinColumn(name = "case_num", referencedColumnName = "case_num")
    private String citizen;

	public Long getEducationId() {
		return educationId;
	}

	public void setEducationId(Long educationId) {
		this.educationId = educationId;
	}

	public String getHighestDegree() {
		return highestDegree;
	}

	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getCitizen() {
		return citizen;
	}

	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}
    
    

   

}
