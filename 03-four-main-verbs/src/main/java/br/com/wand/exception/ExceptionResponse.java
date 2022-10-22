package br.com.wand.exception;

import java.io.Serializable;

public class ExceptionResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private java.util.Date timestamp;
	private String message;
	private String details;
	
	public ExceptionResponse(java.util.Date date, String message, String details) {
		super();
		this.timestamp = date;
		this.message = message;
		this.details = details;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public java.util.Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	
}
