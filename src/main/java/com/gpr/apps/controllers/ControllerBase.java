package com.gpr.apps.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ControllerBase {
	
	public static ResponseEntity<?> successResponse (Object response) {
		return new ResponseEntity<>( response , HttpStatus.OK);
	}
	
	public static ResponseEntity<?>  errorResponse (Object response) {
		return new ResponseEntity<>( response , HttpStatus.OK);
	}
	
	
}
