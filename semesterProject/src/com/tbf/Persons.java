package com.tbf;

import java.util.ArrayList;

public class Persons {
	private String personCode;
	private String brokerStatus;
	private Name name;
	private String Address;
	private ArrayList<String> emailAddress;

	
	public Persons(String personCode, String brokerStatus, Name name, String address, ArrayList<String> emailAddress) {
		super();
		this.personCode = personCode;
		this.brokerStatus = brokerStatus;
		this.name = name;
		this.Address = address;
		this.setEmailAddress(emailAddress);
	}


	public Persons(String personCode, String brokerStatus, Name name, String address) {
		super();
		this.personCode = personCode;
		this.brokerStatus = brokerStatus;
		this.name = name;
		this.Address = address;
	}


	public String getPersonCode() {
		return personCode;
	}

	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}

	public String getBrokerStatus() {
		return brokerStatus;
	}

	public void setBrokerStatus(String brokerStatus) {
		this.brokerStatus = brokerStatus;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}


	public ArrayList<String> getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(ArrayList<String> emailAddress) {
		this.emailAddress = emailAddress;
	}


}
