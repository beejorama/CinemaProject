package EntityManagers;

import Entities.Customer;

public interface CustomerManager {

	// Create
	public void persistCustomer(Customer input);
	
	// Read
	public Customer getCustomerByEmail(String input);
	
	// Update
	public void updateCustomerEmail(String input);
	public void updateCustomerFirstname(String input);
	public void updateCustomerSurname(String input);
	public void updateCustomerPassword(String input);
	
	// Delete
	public void deleteCustomer(Customer input);
	
}
