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
	public void updateAddressLine1(String input);
	public void updateAddressLine2(String input);
	public void updateAddressTown(String input);
	public void updateAddressPostcode(String input);
	public void updateAddressCounty(String input);
	
	// Delete
	public void deleteAddress(Address input);

}
