package com.liv2train.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class TrainingCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long trainingCenterId;

	private String centerName;

	private String centerCode;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_address_id")
	private Address address;

	private Long studentCapacity;

	@ElementCollection(targetClass = String.class)
	private List<String> coursesOffered;

	@CreationTimestamp
	private Date createdOn;

	private String contactEmail;

	private String contactPhone;

	public Long getTrainingCenterId() {
		return trainingCenterId;
	}

	public void setTrainingCenterId(Long trainingCenterId) {
		this.trainingCenterId = trainingCenterId;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getStudentCapacity() {
		return studentCapacity;
	}

	public void setStudentCapacity(Long studentCapacity) {
		this.studentCapacity = studentCapacity;
	}

	public List<String> getCoursesOffered() {
		return coursesOffered;
	}

	public void setCoursesOffered(List<String> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public TrainingCenter() {

	}

}
