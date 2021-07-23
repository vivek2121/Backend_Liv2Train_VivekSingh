package com.liv2train.dto;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class TrainingCenterDto {

	private Long trainingCenterId;
	@Size(max = 40,message = "center name must be less than 40")
	private String centerName;
	@Pattern(regexp="^[a-zA-Z0-9]{12}",message = "Center Code must be 12 character")
	private String centerCode;
	private AddressDto address;
	private Long studentCapacity;
	private List<String> coursesOffered;
	@Email
	private String contactEmail;
	@Pattern(regexp="(^$|[0-9]{10})",message = "Please enter a valid phone number")
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

	public AddressDto getAddress() {
		return address;
	}
	public void setAddress(AddressDto address) {
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
	public TrainingCenterDto(Long trainingCenterId, String centerName, String centerCode, AddressDto address,
			Long studentCapacity, List<String> coursesOffered,String contactEmail,
			String contactPhone) {
		super();
		this.trainingCenterId = trainingCenterId;
		this.centerName = centerName;
		this.centerCode = centerCode;
		this.address = address;
		this.studentCapacity = studentCapacity;
		this.coursesOffered = coursesOffered;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
	}
	public TrainingCenterDto() {
	}
	
	
}
