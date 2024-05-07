package com.cybage.boot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "SavedJobsDetails")
public class SavedJobsInfoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int savedJobId;
	private int userId;
	private int jobId;
	public int getSavedJobId() {
		return savedJobId;
	}
	public void setSavedJobId(int savedJobId) {
		this.savedJobId = savedJobId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	
}
