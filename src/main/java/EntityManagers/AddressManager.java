package EntityManagers;

import java.util.List;

import Entities.Address;
import Entities.Customer;

public interface AddressManager {
	
	// Create
	public void persistAddress(Address input);
	
	// Read
	public List<Address> getAddressByCustomer(Customer input);
	
	// Update
	public void updateAddressLine1(int id, String input);
	public void updateAddressLine2(int id, String input);
	public void updateAddressTown(int id, String input);
	public void updateAddressPostcode(int id, String input);
	public void updateAddressCounty(int id, String input);
	
	// Delete
	public void deleteAddress(int id);

}
