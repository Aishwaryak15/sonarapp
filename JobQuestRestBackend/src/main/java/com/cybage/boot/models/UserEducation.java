package com.cybage.boot.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "userEducation")
@AllArgsConstructor
@NoArgsConstructor
public class UserEducation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userEduId;
	private String collegeName;
	private int graduationYear;
	private String degreeMajor;
	private float gpaScore;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserProfileModel user_id; // Name must Match with MappedBy Value
	// private int user_id; // FOREIGN KEY

	public int getUserEduId() {
		return userEduId;
	}

	public void setUserEduId(int userEduId) {
		this.userEduId = userEduId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getDegreeMajor() {
		return degreeMajor;
	}

	public void setDegreeMajor(String degreeMajor) {
		this.degreeMajor = degreeMajor;
	}

	public float getGpaScore() {
		return gpaScore;
	}

	public void setGpaScore(float gpaScore) {
		this.gpaScore = gpaScore;
	}

	public UserProfileModel getUser_id() {
		return user_id;
	}

	public void setUser_id(UserProfileModel user_id) {
		this.user_id = user_id;
	}
	
}