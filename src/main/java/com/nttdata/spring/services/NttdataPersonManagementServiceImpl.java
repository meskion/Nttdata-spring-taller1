package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NttdataPerson;
import com.nttdata.spring.persistence.NttdataPersonDaoI;

@Service
public class NttdataPersonManagementServiceImpl implements NttdataPersonManagementServiceI {

	@Autowired
	private NttdataPersonDaoI personDao;

	@Override
	public void insert(NttdataPerson person) {
		personDao.insert(person);
	}

	@Override
	public List<NttdataPerson> searchAll() {
		return personDao.searchAll();
	}

	@Override
	public List<NttdataPerson> searchByFullName(String name, String surname) {
		return personDao.searchByFullName(name, surname);
	}
}
