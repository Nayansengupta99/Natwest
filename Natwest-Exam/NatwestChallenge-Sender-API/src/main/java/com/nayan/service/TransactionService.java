package com.nayan.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nayan.encryption.TransactionEncryption;
import com.nayan.model.TransactionModel;



@Service
public class TransactionService {
	
	final String secretKey = System.getenv("SECRET_KEY");
	private String encrpted="";
	public String sendTransactionObject(TransactionModel model) throws JsonProcessingException {
		
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr = Obj.writeValueAsString(model);
		String encryptedString = TransactionEncryption.encrypt(jsonStr, secretKey) ;
		encrpted=encryptedString;
		return "Object Successfully send to Receiver API";
	}
	
	public String getEncrptedString() {
		return encrpted;
	}
	
	
	
	
	
	
	
}
