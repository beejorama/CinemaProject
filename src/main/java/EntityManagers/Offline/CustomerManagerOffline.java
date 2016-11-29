package EntityManagers.Offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import Entities.Customer;
import EntityManagers.CustomerManager;
import Utilities.DummyData;

@Default
@Stateless
public class CustomerManagerOffline implements CustomerManager {

	@Inject
	private DummyData dummyData;
	
	public void persistCustomer(Customer input) {
		dummyData.getCustomers().add(input);
	}

	public Customer getCustomerByEmail(String input) {
		Customer returnCustomer = null;
		List<Customer> searchList = dummyData.getCustomers();
		for(Customer c : searchList){
			if(c.getEmail().equals(input)){
				returnCustomer = c;
				break;
			}
		}
		return returnCustomer;
	}

	public void updateCustomerEmail(String email, String input) {
		for(Customer c : dummyData.getCustomers()){
			if(c.getEmail().equals(email)){
				c.setEmail(input);
				break;
			}
		}
	}

	public void updateCustomerFirstname(String email, String input) {
		for(Customer c : dummyData.getCustomers()){
			if(c.getEmail().equals(email)){
				c.setFirstname(input);
				break;
			}
		}
	}

	public void updateCustomerSurname(String email, String input) {
		for(Customer c : dummyData.getCustomers()){
			if(c.getEmail().equals(email)){
				c.setSurname(input);
				break;
			}
		}
	}

	public void updateCustomerPassword(String email, String input) {
		for(Customer c : dummyData.getCustomers()){
			if(c.getEmail().equals(email)){
				// input = input.hashPassword()
				// password stuff
				c.setHashPass(input);
				break;
			}
		}
	}

	public void deleteCustomer(String email) {
		List<Customer> list = dummyData.getCustomers();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getEmail().equals(email)){
				list.remove(i);
				break;
			}
		}
	}

}
