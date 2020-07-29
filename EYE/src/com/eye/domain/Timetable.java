package com.eye.domain;

public class Timetable {
	private int timetable_no;
	private TheaterRoom theaterRoom;
	private Movie movie;
	private String screen_date;
	private int start_time;
	private int end_time;
	
	public int getTimetable_no() {
		return timetable_no;
	}
	public void setTimetable_no(int timetable_no) {
		this.timetable_no = timetable_no;
	}
	public TheaterRoom getTheaterRoom() {
		return theaterRoom;
	}
	public void setTheaterRoom(TheaterRoom theaterRoom) {
		this.theaterRoom = theaterRoom;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public String getScreen_date() {
		return screen_date;
	}
	public void setScreen_date(String screen_date) {
		this.screen_date = screen_date;
	}
	public int getStart_time() {
		return start_time;
	}
	public void setStart_time(int start_time) {
		this.start_time = start_time;
	}
	public int getEnd_time() {
		return end_time;
	}
	public void setEnd_time(int end_time) {
		this.end_time = end_time;
	}
}
