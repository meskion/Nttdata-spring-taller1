package com.nttdata.spring.persistence;

public class NttdataBuilding {

	private NttdataPerson[][] rooms;
	final int FLOORS = 10;
	final int ROOMS = 10;
	
	public NttdataBuilding() {
		this.rooms = new NttdataPerson[FLOORS][ROOMS];
	}

	public NttdataPerson[][] getRooms() {
		return rooms;
	}

	public void setRooms(NttdataPerson[][] rooms) {
		this.rooms = rooms;
	}
	
	
	

}
