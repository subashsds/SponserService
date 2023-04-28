package com.slavic.dto;

public class Response<T> {
	
	private T data;
	private Boolean success;
	private String message;
	
	private ErrorMsg error;
	
	public Response(T data) {
		super();
		this.data = data;
	}
	
	public Response() {
		super();
	}
	
	
	public Response (ErrorMsg error,T data) {
		super();
		this.data = data;
		this.error = error;
		
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public ErrorMsg getError() {
		return error;
	}
	public void setError(ErrorMsg error) {
		this.error = error;
	}
	
	

}
