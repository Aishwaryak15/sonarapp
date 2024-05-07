package com.cybage.boot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {
	private int eventId;
	private String eventName;
	private String posterImage;
	private String bannerImage;
	private String organizerName;
	private String tech;
	private String dateTime;
	private int noOfRegistration;
	private String aboutContest;
	private String rulesToFollow;
	private String rewards;
	private String aboutQrganizer;
	private double rating;
	private String contactDetails;
	private String founder;
	private String companySize;
	private String industryType;
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getPosterImage() {
		return posterImage;
	}
	public void setPosterImage(String posterImage) {
		this.posterImage = posterImage;
	}
	public String getBannerImage() {
		return bannerImage;
	}
	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}
	public String getOrganizerName() {
		return organizerName;
	}
	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public int getNoOfRegistration() {
		return noOfRegistration;
	}
	public void setNoOfRegistration(int noOfRegistration) {
		this.noOfRegistration = noOfRegistration;
	}
	public String getAboutContest() {
		return aboutContest;
	}
	public void setAboutContest(String aboutContest) {
		this.aboutContest = aboutContest;
	}
	public String getRulesToFollow() {
		return rulesToFollow;
	}
	public void setRulesToFollow(String rulesToFollow) {
		this.rulesToFollow = rulesToFollow;
	}
	public String getRewards() {
		return rewards;
	}
	public void setRewards(String rewards) {
		this.rewards = rewards;
	}
	public String getAboutQrganizer() {
		return aboutQrganizer;
	}
	public void setAboutQrganizer(String aboutQrganizer) {
		this.aboutQrganizer = aboutQrganizer;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public String getCompanySize() {
		return companySize;
	}
	public void setCompanySize(String companySize) {
		this.companySize = companySize;
	}
	public String getIndustryType() {
		return industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	
	
}
