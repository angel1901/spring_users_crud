package com.gpr.apps.controllers.UsersControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

@RequestMapping("users")

public class UserRoutes{
	
	UsersController controller = new UsersController();
	
	
	@GetMapping("")
    public ResponseEntity<?> getUsers(){
		return controller.getUsers();
	}
	
	@PostMapping("")
	public ResponseEntity<?> createUser(){
		return controller.createUser();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUser(@PathVariable Integer id){	
		return controller.updateUser(id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer id){
		return controller.deleteUser(id);
	}

}