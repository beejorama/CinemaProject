package EntityManagers.Offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import Entities.Ticket;
import EntityManagers.TicketManager;
import Utilities.DummyData;

@Default
@Stateless
public class TicketManagerOffline implements TicketManager {

	@Inject
	private DummyData dummyData;
	
	public void persistTicket(Ticket input) {
		dummyData.getTickets().add(input);
	}

	public List<Ticket> getTicketByFilm(int id) {
		List<Ticket> returnList = new ArrayList<Ticket>();
		List<Ticket> searchList = dummyData.getTickets();
		for(Ticket t : searchList){
			if(t.getId() == id){
				returnList.add(t);
			}
		}
		return returnList;
	}

	public List<Ticket> getTicketByCustomer(String email) {
		List<Ticket> returnList = new ArrayList<Ticket>();
		List<Ticket> searchList = dummyData.getTickets();
		for(Ticket t : searchList){
			if(t.getOrder().getCustomer().getEmail().equals(email)){
				returnList.add(t);
			}
		}
		return returnList;
	}

	public void deleteTicket(int id) {
		List<Ticket> list = dummyData.getTickets();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getId() == id){
				list.remove(i);
				break;
			}
		}
	}

}
