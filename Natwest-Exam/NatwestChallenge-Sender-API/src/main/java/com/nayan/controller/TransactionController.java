package com.nayan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nayan.model.TransactionModel;
import com.nayan.service.TransactionService;

@RestController
@RequestMapping("transaction")
public class TransactionController {

	
	
	@Autowired
	private TransactionService service;
	
	@PostMapping("/send")
	public ResponseEntity<String> sendModel(@RequestBody TransactionModel model) throws JsonProcessingException {
		return new ResponseEntity<String>(service.sendTransactionObject(model),HttpStatus.OK);
	}
	@GetMapping("/see")
	public String getEncrptedString() {
		return service.getEncrptedString();
	}
	
	
}
