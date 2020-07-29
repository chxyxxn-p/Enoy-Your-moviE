package com.eye.domain;

public class TheaterRoom {
	private int theater_room_no;
	private Theater theater;
	private String name;
	private int max_seat;
	
	public int getTheater_room_no() {
		return theater_room_no;
	}
	public void setTheater_room_no(int theater_room_no) {
		this.theater_room_no = theater_room_no;
	}
	public Theater getTheater() {
		return theater;
	}
	public void setTheater(Theater theater) {
		this.theater = theater;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMax_seat() {
		return max_seat;
	}
	public void setMax_seat(int max_seat) {
		this.max_seat = max_seat;
	}
}
