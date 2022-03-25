package com.nayan.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nayan.decrption.*;

import com.nayan.feign.PostClient;
import com.nayan.model.TransactionModel;
import com.nayan.repository.TransactionRepository;

@Service
public class ReceiverApiService {

	@Autowired
	private PostClient client;

	@Autowired
	private TransactionRepository repo;
	final String secretKey = System.getenv("SECRET_KEY");

	public String getResponse() {
		return client.getEncrptedString();
	}

	public TransactionModel decrptResponse() throws JsonParseException, JsonMappingException, IOException {
		String encrptedJsonObject = getResponse();
		String decryptedString = TransactionEncryption.decrypt(encrptedJsonObject, secretKey);
		ObjectMapper objectMapper = new ObjectMapper();
		TransactionModel model = objectMapper.readValue(decryptedString, TransactionModel.class);
		return model;
	}

	public String saveTransation() throws JsonParseException, JsonMappingException, IOException {
		TransactionModel model = decrptResponse();
		repo.save(model);
		return "Saved Successfully in db";

	}

}
