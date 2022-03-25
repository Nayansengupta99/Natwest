package com.nayan.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.nayan.service.ReceiverApiService;

@RestController
@RequestMapping("/receiver")
public class ReceiverController {

	@Autowired
	ReceiverApiService service;
	
	@GetMapping("/save")
	public String save() throws JsonParseException, JsonMappingException, IOException {
		return service.saveTransation();
	}
	
	
	
	
	
	
	
	
	
}
