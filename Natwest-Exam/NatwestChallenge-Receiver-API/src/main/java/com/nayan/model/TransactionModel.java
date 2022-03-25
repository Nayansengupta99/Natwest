package com.nayan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "transaction")
public class TransactionModel {
	@Id
	@Column
	private long accountNumber;
	@Column
	private String type;
	@Column
	private long amount;
	@Column
	private String currency;
	@Column
	private long accountForm;
}
