package com.RestAPI.firstRestAPI;

public class EmployeeNotFoundException extends RuntimeException {
	EmployeeNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }

}
