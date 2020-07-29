package com.eye.domain;

public class Review {
	private int review_no;
	private Movie movie;
	private Member member;
	private String contents;
	private String reg_date;
	private int score;
	private int hide_flag;
	
	public int getReview_no() {
		return review_no;
	}
	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getHide_flag() {
		return hide_flag;
	}
	public void setHide_flag(int hide_flag) {
		this.hide_flag = hide_flag;
	}
}
