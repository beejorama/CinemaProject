package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Seats")
public class Seat {
	
	@Column(name = "occupied")
	private boolean occupied;
	
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
