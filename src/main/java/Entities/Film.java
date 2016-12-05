package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Films")
public class Film {
	
	@Id
	@Column(name = "id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "year")
	private int year;
	
	@Column(name = "runtime")
	private int runtime;
	
	@Column(name = "rating")
	private int avRating;
	
	@Column(name = "imgPath")
	private String imgPath;
	
	@OneToMany(mappedBy = "film")
	private List<Showing> showings;
	
	@Column(name = "director")
	private String director;
	
	@Column(name = "actors")
	private String actors;
	
	public Film(String title, String description, String director, String actors, int year, int runtime, String imgPath){
		this.title = title;
		this.description = description;
		this.director = director;
		this.actors = actors;
		this.year = year;
		this.runtime = runtime;
		this.imgPath = imgPath;
		showings = new ArrayList<Showing>();
	}
	
	// Interesting methods
	
	public boolean isShowing(){
		for(Showing s : showings){
			if(s.getTime().compareTo(new GregorianCalendar()) > 0){
				return true;
			}
		}
		return false;
	}
	
	public List<Showing> getShowingsByDate(Showing sh){
		Calendar c = sh.getTime();
		List<Showing> returnList = new ArrayList<Showing>();
		for(Showing s : getFutureShowings()){
			Calendar sc = s.getTime();
			if(sc.get(Calendar.YEAR) == c.get(Calendar.YEAR)
					&& sc.get(Calendar.MONTH) == c.get(Calendar.MONTH)
					&& sc.get(Calendar.DATE) == c.get(Calendar.DATE)){
				returnList.add(s);
			}
		}
		return returnList;
	}
	
	public List<Showing> getFutureShowingsDates(){
		List<Showing> initialList = getFutureShowings();
		List<Showing> returnList = new ArrayList<Showing>();
		
		for(Showing s: initialList){
			boolean t = true;
			for(Showing c: returnList){
				System.out.println("In 2nd loop");
				if(s.getTime().get(Calendar.DAY_OF_MONTH) == c.getTime().get(Calendar.DAY_OF_MONTH)
					&& s.getTime().get(Calendar.MONTH) == c.getTime().get(Calendar.MONTH)
					&& s.getTime().get(Calendar.YEAR) == c.getTime().get(Calendar.YEAR)){
					t = false;
				}
			}
			if(t || returnList.size() == 0){
				returnList.add(s);
			}
		}
		return returnList;
	}
	
	public List<Showing> getFutureShowings(){
		List<Showing> returnList = new ArrayList<Showing>();
		for(Showing s: showings){
			if(s.getTime().compareTo(new GregorianCalendar()) > 0){
				returnList.add(s);
				System.out.println("Sourcing dates - " + s.getFormattedDate());
			}
		}
		return returnList;
	}
	
	
	// Getters and Setters

	public Film() {
		
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the runtime
	 */
	public int getRuntime() {
		return runtime;
	}
	/**
	 * @param runtime the runtime to set
	 */
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	/**
	 * @return the avRating
	 */
	public int getAvRating() {
		return avRating;
	}
	/**
	 * @param avRating the avRating to set
	 */
	public void setAvRating(int avRating) {
		this.avRating = avRating;
	}
	/**
	 * @return the imgPath
	 */
	public String getImgPath() {
		return imgPath;
	}
	/**
	 * @param imgPath the imgPath to set
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
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
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return the actors
	 */
	public String getActors() {
		return actors;
	}

	/**
	 * @param actors the actors to set
	 */
	public void setActors(String actors) {
		this.actors = actors;
	}

}
