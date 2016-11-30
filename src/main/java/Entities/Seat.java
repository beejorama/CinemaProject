package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import Enums.SeatTypes;

@Entity
@Table(name = "Seats")
public class Seat {

	@Id
	@Column(name = "id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "occupied")
	private boolean occupied;
	
	@Column(name = "type")
	private SeatTypes type;

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

	/**
	 * @return the type
	 */
	public SeatTypes getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(SeatTypes type) {
		this.type = type;
	}
	

	
}
