package com.student.rest.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentData")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String age;
	@Column(name="mobile_number")
	private String mobileNumber;
	private String address;
	@Column(name="roll_no")
	private String rollNo;
	
	@CreationTimestamp
	@Column(name="created_date")
	private LocalDateTime createdDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", mobileNumber=" + mobileNumber + ", address="
				+ address + ", rollNo=" + rollNo + ", createdDate=" + createdDate + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Student(long id, String name, String age, String mobileNumber, String address, String rollNo,
			LocalDateTime createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.rollNo = rollNo;
		this.createdDate = createdDate;
	}
	
	
}
