package com.nttdata.spring.persistence;

import org.springframework.stereotype.Component;

@Component
public class NttdataPerson {

	private String name, surname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + surname;
	}
	
	

}
