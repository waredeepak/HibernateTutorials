package com.annotations.apps;import javax.persistence.*;@Entity@Table(name = "CHEQUE_PAYMENT2")public class ChequePayment extends Payment {	@Column(name = "cctype")	private String chequeType;	public String getChequeType() {		return chequeType;	}	public void setChequeType(String chequeType) {		this.chequeType = chequeType;	}}