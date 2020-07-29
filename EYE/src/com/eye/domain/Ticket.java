package com.eye.domain;

public class Ticket {
	private int ticket_no;
	private Timetable timetable;
	private String seat_row;
	private int seat_col;
	private Member member;
	
	public int getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(int ticket_no) {
		this.ticket_no = ticket_no;
	}
	public Timetable getTimetable() {
		return timetable;
	}
	public void setTimetable(Timetable timetable) {
		this.timetable = timetable;
	}
	public String getSeat_row() {
		return seat_row;
	}
	public void setSeat_row(String seat_row) {
		this.seat_row = seat_row;
	}
	public int getSeat_col() {
		return seat_col;
	}
	public void setSeat_col(int seat_col) {
		this.seat_col = seat_col;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
}
