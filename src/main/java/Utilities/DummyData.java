package Utilities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Singleton;
import javax.ejb.Startup;

import Entities.*;

@Startup
@Singleton
public class DummyData {
	
	private List<Address> addresses;
	private List<Customer> customers;
	private List<Film> films;
	private List<Order> orders;
	private List<Review> reviews;
	private List<Screen> screens;
	private List<Showing> showings;
	private List<Ticket> tickets;
	
	public DummyData(){
		addresses = new ArrayList();
		customers = new ArrayList();
		films = new ArrayList();
		orders = new ArrayList();
		reviews = new ArrayList();
		screens = new ArrayList();
		showings = new ArrayList();
		tickets = new ArrayList();
		
		Film f1 = new Film("Pulp Fiction", "The lives of two mob hit men, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption.", "Quentin Tarantino", "John Travolta / Uma Thurman / Samuel L. Jackson / Bruce Willis", 1994, 120, "img/posters/pulp-fiction.jpg");
		films.add(f1);
		Film f2 = new Film("Interstellar", "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.", "Christopher Nolan", "Matthew McConaughey / Anne Hathaway", 2014, 169, "img/posters/interstellar.jpeg");
		films.add(f2);
		Film f3 = new Film("The Usual Suspects", "A sole survivor tells of the twisty events leading up to a horrific gun battle on a boat, which begin when five criminals meet at a seemingly random police lineup.", "Bryan Singer", "Kevin Spacey / Benicio Del Toro", 1995, 106, "img/posters/usual-suspects.jpg");
		films.add(f3);
		
		Screen s1 = new Screen(new Seat[10][7], 400);
		screens.add(s1);
		
		Showing sh1 = new Showing(f1, 2016, 11, 25, 12, 30, s1);
		showings.add(sh1);
		f1.getShowings().add(sh1);
		Showing sh2 = new Showing(f2, 2016, 11, 12, 14, 25, s1);
		showings.add(sh2);
		f2.getShowings().add(sh2);
		Showing sh3 = new Showing(f3, 2017, 0, 1, 1, 1, s1);
		showings.add(sh3);
		f3.getShowings().add(sh3);
		
		Showing sh4 = new Showing(f1, 2016, 11, 27, 12, 30, s1);
		showings.add(sh4);
		f1.getShowings().add(sh4);
		Showing sh5 = new Showing(f1, 2016, 11, 27, 17, 30, s1);
		showings.add(sh5);
		f1.getShowings().add(sh5);
		
		// Add more dummy data
	}

	/**
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	/**
	 * @return the customers
	 */
	public List<Customer> getCustomers() {
		return customers;
	}

	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	/**
	 * @return the films
	 */
	public List<Film> getFilms() {
		return films;
	}

	/**
	 * @param films the films to set
	 */
	public void setFilms(List<Film> films) {
		this.films = films;
	}

	/**
	 * @return the orders
	 */
	public List<Order> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}

	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	/**
	 * @return the screens
	 */
	public List<Screen> getScreens() {
		return screens;
	}

	/**
	 * @param screens the screens to set
	 */
	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	/**
	 * @return the showings
	 */
	public List<Showing> getShowings() {
		return showings;
	}

	/**
	 * @param showings the showings to set
	 */
	public void setShowings(List<Showing> showings) {
		this.showings = showings;
	}

	/**
	 * @return the tickets
	 */
	public List<Ticket> getTickets() {
		return tickets;
	}

	/**
	 * @param tickets the tickets to set
	 */
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	


}
