package com.cybage.boot.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "userWorkExperience")
@AllArgsConstructor
@NoArgsConstructor
public class UserWorkExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int workExpId;
	private String companyName;
	private String titleName;
	private String startDate;
	private String endDate;
	private String workDescription;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserProfileModel user_id; // Name must Match with MappedBy Value
	// private int user_id; // FOREIGN KEY
	public int getWorkExpId() {
		return workExpId;
	}
	public void setWorkExpId(int workExpId) {
		this.workExpId = workExpId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getWorkDescription() {
		return workDescription;
	}
	public void setWorkDescription(String workDescription) {
		this.workDescription = workDescription;
	}
	public UserProfileModel getUser_id() {
		return user_id;
	}
	public void setUser_id(UserProfileModel user_id) {
		this.user_id = user_id;
	}
	
}
