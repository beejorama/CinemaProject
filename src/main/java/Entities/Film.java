package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Films")
public class Film {
	
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
	
	public Film(String title, String description, int year, int runtime, String imgPath){
		this.title = title;
		this.description = description;
		this.year = year;
		this.runtime = runtime;
		this.imgPath = imgPath;
	}
	
	// Getters and Setters

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

}
