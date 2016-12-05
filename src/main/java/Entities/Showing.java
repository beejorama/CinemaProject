package Entities;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Showings")
public class Showing {

	@Id
	@Column(name = "id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "FKfilmID")
	private Film film;
	
	@Column(name = "time")
	private Calendar time;
	
	@ManyToOne
	@JoinColumn(name = "FKscreenID")
	private Screen screen;
	
	@Column(name = "seats")
	private Seat[][] seats;
	
	@OneToMany(mappedBy = "showing")
	private List<Ticket> tickets;
	
	/**
	 * Constructor taking the film, time and screen
	 * @param film
	 * @param time
	 * @param screen
	 */
	public Showing(Film film, int year, int month, int date, int hour, int minute, Screen screen){
		this.film = film;
		Calendar c = new GregorianCalendar();
		c.set(year, month, date, hour, minute);
		this.time = c;
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
	
	public String getFormattedDate(){
		String returnDate = "";
		returnDate = returnDate + time.get(Calendar.DAY_OF_MONTH) + "/" + (time.get(Calendar.MONTH)+1) + "/" + time.get(Calendar.YEAR);
		return returnDate;
	}
	
	public String getFormattedTime(){
		String returnTime = "";
		returnTime = returnTime + time.get(Calendar.HOUR_OF_DAY) + ":" + time.get(Calendar.MINUTE);
		return returnTime;
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
	public Calendar getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(Calendar time) {
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

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the seats
	 */
	public Seat[][] getSeats() {
		return seats;
	}

	/**
	 * @param seats the seats to set
	 */
	public void setSeats(Seat[][] seats) {
		this.seats = seats;
	}
	
}
