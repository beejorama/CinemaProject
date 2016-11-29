package EntityManagers;

import Entities.Customer;

public interface CustomerManager {

	// Create
	public void persistCustomer(Customer input);
	
	// Read
	public Customer getCustomerByEmail(String input);
	
	// Update
	public void updateCustomerEmail(String email, String input);
	public void updateCustomerFirstname(String email, String input);
	public void updateCustomerSurname(String email, String input);
	public void updateCustomerPassword(String email, String input);
	
	// Delete
	public void deleteCustomer(String email);
	
}
