package com.cybage.boot.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CompanyInfo")
public class CompanyInfoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int compId;
	private String compName;
	private String compEmail;
	private String compPassword;
	private String compContactName;
	private String compContactNo;
	private String compDesc;
	private String tag1;
	private String tag2;
	private String tag3;
	private String tag4;
	private String compVideoUrl;
	private String compTagLine;
	private String compWebsiteUrl;
	private String foundedAt;
	private String compType;
	private String compHeadquaters;
	private double compRating;
	private String noOfFollower;
	private String compBannerImg;
	private String compPosterImg;

	@OneToMany(mappedBy = "compId", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<JobDetailInfoModel> jobs;

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

	public String getCompDesc() {
		return compDesc;
	}

	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}

	public String getTag1() {
		return tag1;
	}

	public void setTag1(String tag1) {
		this.tag1 = tag1;
	}

	public String getTag2() {
		return tag2;
	}

	public void setTag2(String tag2) {
		this.tag2 = tag2;
	}

	public String getTag3() {
		return tag3;
	}

	public void setTag3(String tag3) {
		this.tag3 = tag3;
	}

	public String getTag4() {
		return tag4;
	}

	public void setTag4(String tag4) {
		this.tag4 = tag4;
	}

	public String getCompVideoUrl() {
		return compVideoUrl;
	}

	public void setCompVideoUrl(String compVideoUrl) {
		this.compVideoUrl = compVideoUrl;
	}

	public String getCompTagLine() {
		return compTagLine;
	}

	public void setCompTagLine(String compTagLine) {
		this.compTagLine = compTagLine;
	}

	public String getCompWebsiteUrl() {
		return compWebsiteUrl;
	}

	public void setCompWebsiteUrl(String compWebsiteUrl) {
		this.compWebsiteUrl = compWebsiteUrl;
	}

	public String getFoundedAt() {
		return foundedAt;
	}

	public void setFoundedAt(String foundedAt) {
		this.foundedAt = foundedAt;
	}

	public String getCompType() {
		return compType;
	}

	public void setCompType(String compType) {
		this.compType = compType;
	}

	public String getCompHeadquaters() {
		return compHeadquaters;
	}

	public void setCompHeadquaters(String compHeadquaters) {
		this.compHeadquaters = compHeadquaters;
	}

	public double getCompRating() {
		return compRating;
	}

	public void setCompRating(double compRating) {
		this.compRating = compRating;
	}

	public String getNoOfFollower() {
		return noOfFollower;
	}

	public void setNoOfFollower(String noOfFollower) {
		this.noOfFollower = noOfFollower;
	}

	public String getCompBannerImg() {
		return compBannerImg;
	}

	public void setCompBannerImg(String compBannerImg) {
		this.compBannerImg = compBannerImg;
	}

	public String getCompPosterImg() {
		return compPosterImg;
	}

	public void setCompPosterImg(String compPosterImg) {
		this.compPosterImg = compPosterImg;
	}

	public List<JobDetailInfoModel> getJobs() {
		return jobs;
	}

	public void setJobs(List<JobDetailInfoModel> jobs) {
		this.jobs = jobs;
	}
	
	
}