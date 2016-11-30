package Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Customer {
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "surname")
	private String surname;
	
	@Id
	@Column(name = "email")
	private String email;
	
	@Column(name = "hashPass")
	private String hashPass;
	
	@Column(name = "salt")
	private String salt;
	
	@Column(name = "dob")
	private Date DOB;
	
	@OneToMany(mappedBy = "customer")
	private List<Address> addresses;
	
	@OneToMany(mappedBy = "customer")
	private List<Order> orders;
	
	@OneToMany(mappedBy = "customer")
	private List<Review> reviews;
		
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
	 * @param input the hashPass to set
	 */
	public void setHashPass(String input){
		hashPass = input;
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
