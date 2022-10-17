package com.deevyanshu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deevyanshu.Entity.Form;
import com.deevyanshu.repository.FormRepository;

@Service
public class FormService {
	
	@Autowired
	private FormRepository repository;
	
	public Form add(Form form)
	{
		return repository.save(form);
	}
	

}
