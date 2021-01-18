package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Account;

@RestController
public class AddController {

	@PostMapping(value = "/add", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> addAcc(@RequestBody Account account) {
		return new ResponseEntity<String>("Account added successfully", HttpStatus.CREATED);
		system.println("Lingesh");
	}

}
