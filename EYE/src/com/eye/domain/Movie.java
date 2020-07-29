package com.eye.domain;

import org.springframework.web.multipart.MultipartFile;

public class Movie {
	private int movie_no;	//sequence
	private String poster;
	private String title;
	private int running_time;
	private MovieGenre movieGenre;
	private String release_date;
	private MovieLimit movieLimit;
	private int viewer;	//default 0
	private int screen_flag;	//default 0
	
	private MultipartFile posterFile;
	
	public int getMovie_no() {
		return movie_no;
	}
	public void setMovie_no(int movie_no) {
		this.movie_no = movie_no;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRunning_time() {
		return running_time;
	}
	public void setRunning_time(int running_time) {
		this.running_time = running_time;
	}
	public MovieGenre getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(MovieGenre movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public MovieLimit getMovieLimit() {
		return movieLimit;
	}
	public void setMovieLimit(MovieLimit movieLimit) {
		this.movieLimit = movieLimit;
	}
	public int getViewer() {
		return viewer;
	}
	public void setViewer(int viewer) {
		this.viewer = viewer;
	}
	public int getScreen_flag() {
		return screen_flag;
	}
	public void setScreen_flag(int screen_flag) {
		this.screen_flag = screen_flag;
	}
	public MultipartFile getPosterFile() {
		return posterFile;
	}
	public void setPosterFile(MultipartFile posterFile) {
		this.posterFile = posterFile;
	}
	
	
}
