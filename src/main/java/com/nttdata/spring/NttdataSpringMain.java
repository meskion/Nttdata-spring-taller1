package com.nttdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.persistence.NttdataPerson;
import com.nttdata.spring.services.NttdataPersonManagementServiceI;

@SpringBootApplication
public class NttdataSpringMain implements CommandLineRunner {

	@Autowired
	private NttdataPersonManagementServiceI service;
	
	public static void main(String[] args) {
		SpringApplication.run(NttdataSpringMain.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		
		NttdataPerson manu = new NttdataPerson();
		manu.setName("Manu");
		manu.setSurname("Fdez");
		service.insert(manu);
		
		NttdataPerson javi = new NttdataPerson();
		javi.setName("Javi");
		javi.setSurname("Esmerado");
		service.insert(javi);
		
		service.searchAll().forEach(System.out::println);
		
		System.out.println("------------");
		
		service.searchByFullName("Manu", "Fdez").forEach(System.out::println);
		
	}

}
