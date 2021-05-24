package com.example.student.dto;

import java.util.Date;

public class StudentAllDto {
	private String name;
	private Date birthDate;
	private Integer gender;
	private String address;
	private String nameClass;
	private String nameDepartment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public String getNameDepartment() {
		return nameDepartment;
	}
	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}
	public StudentAllDto(String name, Date birthDate, Integer gender, String address, String nameClass,
			String nameDepartment) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.address = address;
		this.nameClass = nameClass;
		this.nameDepartment = nameDepartment;
	}
	public StudentAllDto() {
		super();
	}
	
	
	
}
