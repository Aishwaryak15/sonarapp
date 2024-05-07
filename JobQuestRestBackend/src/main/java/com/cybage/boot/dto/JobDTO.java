package com.cybage.boot.dto;

import com.cybage.boot.models.CompanyInfoModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobDTO {
	private int jobId;
	private String jobName;
	private String expReq;
	private String location;
	private String postedAgo;
	private int noOfApplicant;
	private String jobDesc;
	private String role;
	private String industryType;
	private String department;
	private String empType;
	private String roleCategory;
	private String education;
	private String keySkills;
	private double salRangeMin;
	private double salRangeMax;
	private String workMode;
	private String compType;
	private CompanyInfoModel compId;
	private boolean isJobActive;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getExpReq() {
		return expReq;
	}
	public void setExpReq(String expReq) {
		this.expReq = expReq;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPostedAgo() {
		return postedAgo;
	}
	public void setPostedAgo(String postedAgo) {
		this.postedAgo = postedAgo;
	}
	public int getNoOfApplicant() {
		return noOfApplicant;
	}
	public void setNoOfApplicant(int noOfApplicant) {
		this.noOfApplicant = noOfApplicant;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getIndustryType() {
		return industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getRoleCategory() {
		return roleCategory;
	}
	public void setRoleCategory(String roleCategory) {
		this.roleCategory = roleCategory;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getKeySkills() {
		return keySkills;
	}
	public void setKeySkills(String keySkills) {
		this.keySkills = keySkills;
	}
	public double getSalRangeMin() {
		return salRangeMin;
	}
	public void setSalRangeMin(double salRangeMin) {
		this.salRangeMin = salRangeMin;
	}
	public double getSalRangeMax() {
		return salRangeMax;
	}
	public void setSalRangeMax(double salRangeMax) {
		this.salRangeMax = salRangeMax;
	}
	public String getWorkMode() {
		return workMode;
	}
	public void setWorkMode(String workMode) {
		this.workMode = workMode;
	}
	public String getCompType() {
		return compType;
	}
	public void setCompType(String compType) {
		this.compType = compType;
	}
	public CompanyInfoModel getCompId() {
		return compId;
	}
	public void setCompId(CompanyInfoModel compId) {
		this.compId = compId;
	}
	public boolean isJobActive() {
		return isJobActive;
	}
	public void setJobActive(boolean isJobActive) {
		this.isJobActive = isJobActive;
	}
	
	
}
