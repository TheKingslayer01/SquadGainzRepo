package com.example.squadgainzapi.EntityPojos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_personal_info")
public class UserPersonalInfo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "personal_id")
	private Long personalId;
	@Column(name = "user_id")
	private Long userId;
	@Column(name = "fname")
	private String fname;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "height_cm")
	private int heightCm;
	@Column(name = "weight_kg")
	private int weightKg;
	@Column(name = "created_at")
	private Date createdAt;
	
	public UserPersonalInfo() {}

	public UserPersonalInfo(Long personalId, Long userId, String fname, int age, String gender, int heightCm,
			int weightKg, Date createdAt) {
		this.personalId = personalId;
		this.userId = userId;
		this.fname = fname;
		this.age = age;
		this.gender = gender;
		this.heightCm = heightCm;
		this.weightKg = weightKg;
		this.createdAt = createdAt;
	}

	public Long getPersonalId() {
		return personalId;
	}

	public void setPersonalId(Long personalId) {
		this.personalId = personalId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getHeightCm() {
		return heightCm;
	}

	public void setHeightCm(int heightCm) {
		this.heightCm = heightCm;
	}

	public int getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(int weightKg) {
		this.weightKg = weightKg;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
