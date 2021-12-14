package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.persistence.NttdataPerson;

public interface NttdataPersonManagementServiceI {

	void insert(NttdataPerson person);

	List<NttdataPerson> searchAll();

	List<NttdataPerson> searchByFullName(String name, String surname);

}
