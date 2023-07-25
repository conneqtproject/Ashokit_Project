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
@Table(name = "IES_USER")
public class IES_User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "USER_EMAIL")
    private String userEmail;

    @Column(name = "USER_PWD")
    private String userPwd;

    @Column(name = "USER_PHNO")
    private String userPhNo;

    @Column(name = "USER_GENDER")
    private String userGender;

    @Column(name = "USER_DOB")
    private Date userDob;

    @Column(name = "USER_SSN")
    private String userSsn;

    @Column(name = "ACTIVE_SW", columnDefinition = "VARCHAR(1) default 'Y'")
    private String activeSw;

    @Column(name = "ACC_STATUS", columnDefinition = "VARCHAR(20) default 'LOCKED'")
    private String accStatus;

   
    @Column(name = "ROLE_ID")
    private String role;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "UPDATE_DATE")
    private Date updateDate;

   
    @JoinColumn(name = "CREATED_BY")
    private String createdBy;

    
    @JoinColumn(name = "UPDATED_BY")
    private String updatedBy;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserPhNo() {
		return userPhNo;
	}

	public void setUserPhNo(String userPhNo) {
		this.userPhNo = userPhNo;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public Date getUserDob() {
		return userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public String getUserSsn() {
		return userSsn;
	}

	public void setUserSsn(String userSsn) {
		this.userSsn = userSsn;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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

    
}

