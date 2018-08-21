package com.capgemini.doctors.exception;

public class DoctorException extends Exception {

	public DoctorException() {
		super();
		
	}

	public DoctorException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		
	}

	public DoctorException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public DoctorException(String arg0) {
		super(arg0);
		
	}

	public DoctorException(Throwable arg0) {
		super(arg0);
		
	}



}
