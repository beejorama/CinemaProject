package EntityManagers;

import java.util.List;

import Entities.Customer;
import Entities.Order;

public interface OrderManager {
	
	// Create
	public void persistOrder(Order input);

	// Read
	public List<Order> getOrderByCustomer(String email);
	
}
