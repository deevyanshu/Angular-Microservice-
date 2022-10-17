package com.deevyanshu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deevyanshu.Entity.Form;
import com.deevyanshu.service.FormService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/v1/form")
public class FormController {
	
	@Autowired
	private FormService service;
	
	
	@PostMapping("/add")
	public ResponseEntity<Form> add(@RequestBody Form form)
	{
		
		return ResponseEntity.ok(service.add(form));
	}
	
	

}
