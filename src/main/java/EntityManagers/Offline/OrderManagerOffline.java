package EntityManagers.Offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import Entities.Order;
import EntityManagers.OrderManager;
import Utilities.DummyData;

@Default
@Stateless
public class OrderManagerOffline implements OrderManager {

	@Inject
	private DummyData dummyData;
	
	public void persistOrder(Order input) {
		dummyData.getOrders().add(input);
	}

	public List<Order> getOrderByCustomer(String email) {
		List<Order> returnList = new ArrayList<Order>();
		List<Order> searchList = dummyData.getOrders();
		for(Order o : searchList){
			if(o.getCustomer().getEmail().equals(email)){
				returnList.add(o);
			}
		}
		return returnList;
	}

}
