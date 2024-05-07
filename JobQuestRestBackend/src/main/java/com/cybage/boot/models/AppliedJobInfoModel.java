package com.cybage.boot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "AppliedJobDetails")
public class AppliedJobInfoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int appliedJobId;
	private int id;
	private int jobId;
	private int compId;
	private String jobName;
	private Boolean isJobRejected;
	public int getAppliedJobId() {
		return appliedJobId;
	}
	public void setAppliedJobId(int appliedJobId) {
		this.appliedJobId = appliedJobId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public Boolean getIsJobRejected() {
		return isJobRejected;
	}
	public void setIsJobRejected(Boolean isJobRejected) {
		this.isJobRejected = isJobRejected;
	}
	
	
	
}
