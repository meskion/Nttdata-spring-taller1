package com.nttdata.spring.persistence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class NttdataPersonDaoImpl implements NttdataPersonDaoI {


	NttdataBuilding building;
	
	public NttdataPersonDaoImpl() {
		this.building = new NttdataBuilding();
	}

	@Override
	public void insert(NttdataPerson person) {

		for (int i = 0; i < building.FLOORS; i++) {
			for (int j = 0; j < building.ROOMS; j++) {
				if (building.getRooms()[i][j] == null) {
					building.getRooms()[i][j] = person;
					return;
				}
			}
		}
	}

	@Override
	public List<NttdataPerson> searchAll() {

		return List.of(building.getRooms()).stream().flatMap(room -> Arrays.stream(room).filter(p -> p != null))
				.collect(Collectors.toList());
	}

	@Override
	public List<NttdataPerson> searchByFullName(String name, String surname) {

		return List.of(building.getRooms()).stream().flatMap(
				room -> Arrays.stream(room).filter(p -> p != null && p.getName().equals(name) && p.getSurname().equals(surname)))
				.collect(Collectors.toList());

	}
}
