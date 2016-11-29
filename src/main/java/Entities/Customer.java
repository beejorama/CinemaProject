package Entities;

import java.util.Date;

public class Customer {
	
	private String firstname;
	private String surname;
	private String email;
	private String hashPass;
	private String salt;
	private Date DOB;
	
	// Interesting methods
	
	public boolean validatePassword(String input){
		// if(input.scramble(salt) == hashPass){
		// 		return true;
		// }
		// else{
		// 		return false;
		// }
		return false;
	}
	
	
	// Getters and Setters
	
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the hashPass
	 */
	public String getHashPass() {
		return hashPass;
	}
	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}
	/**
	 * @return the dOB
	 */
	public Date getDOB() {
		return DOB;
	}
	/**
	 * @param dOB the dOB to set
	 */
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	
	

}
