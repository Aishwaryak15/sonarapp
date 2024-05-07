package com.cybage.boot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicInfoDTO {
	private String userName;
	private String userContactNo;
	private String userLocation;
	private String primaryRole;
	private int yearsOfExpInPrimaryRole;
	private String openToFollowingRoles;
	private String userBio;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserContactNo() {
		return userContactNo;
	}
	public void setUserContactNo(String userContactNo) {
		this.userContactNo = userContactNo;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public String getPrimaryRole() {
		return primaryRole;
	}
	public void setPrimaryRole(String primaryRole) {
		this.primaryRole = primaryRole;
	}
	public int getYearsOfExpInPrimaryRole() {
		return yearsOfExpInPrimaryRole;
	}
	public void setYearsOfExpInPrimaryRole(int yearsOfExpInPrimaryRole) {
		this.yearsOfExpInPrimaryRole = yearsOfExpInPrimaryRole;
	}
	public String getOpenToFollowingRoles() {
		return openToFollowingRoles;
	}
	public void setOpenToFollowingRoles(String openToFollowingRoles) {
		this.openToFollowingRoles = openToFollowingRoles;
	}
	public String getUserBio() {
		return userBio;
	}
	public void setUserBio(String userBio) {
		this.userBio = userBio;
	}
	
	
}
