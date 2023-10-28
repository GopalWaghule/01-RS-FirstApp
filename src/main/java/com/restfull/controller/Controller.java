package com.restfull.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/home")
	public ResponseEntity<String> welcome(){
		
		String msg="Welcome to the ............";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
		
	}
	
	

}
