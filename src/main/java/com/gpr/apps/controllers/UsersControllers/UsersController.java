package com.gpr.apps.controllers.UsersControllers;

import org.springframework.http.ResponseEntity;

import com.gpr.apps.controllers.ControllerBase;

public class UsersController extends ControllerBase {
	
    public ResponseEntity<?> getUsers() {
		return ControllerBase.successResponse("Angeeel");	
	}
    
    public ResponseEntity<?> createUser() {
    	return ControllerBase.successResponse("Angeeel");
	}
	
    public ResponseEntity<?> updateUser(Integer id) {
    	return ControllerBase.successResponse(id); 	
	}
    
    public ResponseEntity<?> deleteUser(Integer id) {	
    	return ControllerBase.successResponse(id);
	}
	
}
