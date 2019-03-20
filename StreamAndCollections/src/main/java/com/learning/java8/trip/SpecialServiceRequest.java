package com.learning.java8.trip;

public class SpecialServiceRequest {
	private String code;

	private String status;

	public SpecialServiceRequest() {
		// TODO Auto-generated constructor stub
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SpecialServiceRequest [code=" + code + ", status=" + status + "]";
	}

}
