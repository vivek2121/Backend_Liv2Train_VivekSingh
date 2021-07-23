package com.liv2train.response;

import java.util.Date;

public class TrainingResponse {

	private Date timestamp;
	private String status;
	private String message;
	private Object data;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public TrainingResponse(Date timestamp, String status, String message, Object data) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
		this.data = data;
	}
	public TrainingResponse() {
	}
	
	
}
