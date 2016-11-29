package Entities;

import java.util.Date;

public class Showing {

	private Film film;
	private Date time;
	private Screen screen;
	
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
