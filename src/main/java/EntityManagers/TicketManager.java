package EntityManagers;

import java.util.List;

import Entities.Customer;
import Entities.Film;
import Entities.Ticket;

public interface TicketManager {
	
	// Create
	public void persistTicket(Ticket input);
	
	// Read
	public List<Ticket> getTicketByFilm(int id);
	public List<Ticket> getTicketByCustomer(String email);
	
	// Delete
	public void deleteTicket(int id);

}
