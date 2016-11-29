package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Screens")
public class Screen {
	
	@Id
	@Column(name = "id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "size")
	private int screenSize;
	
	@Column(name = "layout")
	private boolean[][] layout;
	
	/**
	 * Standard constructor taking in a seat layout and screen size
	 * @param layout
	 * @param screenSize
	 */
	public Screen(boolean[][] layout, int screenSize){
		this.layout = layout;
		this.screenSize = screenSize;
	}
	
	// Getters and Setters
	
	
	
	/**
	 * @return the screenSize
	 */
	public int getScreenSize() {
		return screenSize;
	}
	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	/**
	 * @return the layout
	 */
	public boolean[][] getLayout() {
		return layout;
	}
	/**
	 * @param layout the layout to set
	 */
	public void setLayout(boolean[][] layout) {
		this.layout = layout;
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
	
}
