package Entities;

public class Screen {
	
	private int screenSize;
	private Seat[][] layout;
	
	/**
	 * Standard constructor taking in a seat layout and screen size
	 * @param layout
	 * @param screenSize
	 */
	public Screen(Seat[][] layout, int screenSize){
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
	public Seat[][] getLayout() {
		return layout;
	}
	/**
	 * @param layout the layout to set
	 */
	public void setLayout(Seat[][] layout) {
		this.layout = layout;
	}
	
}
