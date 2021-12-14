package com.nttdata.spring.persistence;

import java.util.List;

public interface NttdataPersonDaoI {

	void insert(NttdataPerson person);

	List<NttdataPerson> searchAll();

	List<NttdataPerson> searchByFullName(String name, String surname);
	
}
