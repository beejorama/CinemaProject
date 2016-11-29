package Entities;

import java.util.Date;

public class Showing {

	private Film film;
	private Date time;
	private Screen screen;
	private Seat[][] seats;
	
	/**
	 * Constructor taking the film, time and screen
	 * @param film
	 * @param time
	 * @param screen
	 */
	public Showing(Film film, Date time, Screen screen){
		this.film = film;
		this.time = time;
		this.screen = screen;
		seats = screen.getLayout();
	}
	
	/**
	 * Book a seat for a showing
	 * Sets the seat as occupied
	 * @param row
	 * @param col
	 */
	public void bookSeat(int row, int col){
		seats[col][row].setOccupied(true);
	}
	
	/**
	 * @return the film
	 */
	public Film getFilm() {
		return film;
	}
	/**
	 * @param film the film to set
	 */
	public void setFilm(Film film) {
		this.film = film;
	}
	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}
	/**
	 * @return the screen
	 */
	public Screen getScreen() {
		return screen;
	}
	/**
	 * @param screen the screen to set
	 */
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	
	
	
}
