package com.ssafy.board.model.dto;

public class Location {
	private int id;
	private String location;

	public Location() {
	}

	public Location(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "LocationList [id=" + id + ", location=" + location + "]";
	}
}
