package Entities;

public class Seat {
	
	private Showing showing;
	private char row;
	private char number;
	private boolean occupied;
	
	/**
	 * @return the showing
	 */
	public Showing getShowing() {
		return showing;
	}
	/**
	 * @param showing the showing to set
	 */
	public void setShowing(Showing showing) {
		this.showing = showing;
	}
	/**
	 * @return the row
	 */
	public char getRow() {
		return row;
	}
	/**
	 * @param row the row to set
	 */
	public void setRow(char row) {
		this.row = row;
	}
	/**
	 * @return the number
	 */
	public char getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(char number) {
		this.number = number;
	}
	/**
	 * @return the occupied
	 */
	public boolean isOccupied() {
		return occupied;
	}
	/**
	 * @param occupied the occupied to set
	 */
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	

}
