package com.javaLive.byType;

import org.springframework.beans.factory.annotation.Autowired;

public class Room {
	private String roomNumber;
	@Autowired
	private Student allotedTo;

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Student getAllotedTo() {
		return allotedTo;
	}

	public void setAllotedTo(Student allotedTo) {
		this.allotedTo = allotedTo;
	}

	@Override
	public String toString() {
		String name = "";
		if (allotedTo != null) {
			name = allotedTo.getName();
		}
		return "Room [roomNumber=" + roomNumber + ", allotedTo=" + name + "]";
	}
}
