package com.cybage.boot.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterCompanyDTO {
	private int compId;
	@NotEmpty(message = "User Name cannot be empty!!!")
	private String compName;
	private String compEmail;
	private String compPassword;
	private String compContactName;
	private String compContactNo;
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompEmail() {
		return compEmail;
	}
	public void setCompEmail(String compEmail) {
		this.compEmail = compEmail;
	}
	public String getCompPassword() {
		return compPassword;
	}
	public void setCompPassword(String compPassword) {
		this.compPassword = compPassword;
	}
	public String getCompContactName() {
		return compContactName;
	}
	public void setCompContactName(String compContactName) {
		this.compContactName = compContactName;
	}
	public String getCompContactNo() {
		return compContactNo;
	}
	public void setCompContactNo(String compContactNo) {
		this.compContactNo = compContactNo;
	}
	
	
	
}
