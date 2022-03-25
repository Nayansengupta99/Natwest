package com.nayan.model;

import lombok.Data;

@Data
public class TransactionModel {
private long accountNumber;
private String type;
private long amount;
private String currency;
private long accountForm;
}
