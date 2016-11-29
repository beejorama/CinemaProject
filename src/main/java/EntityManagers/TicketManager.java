package EntityManagers;

import java.util.List;

import Entities.Customer;
import Entities.Film;
import Entities.Ticket;

public interface TicketManager {
	
	// Create
	public void persistTicket(Ticket input);
	
	// Read
	public List<Ticket> getTicketByFilm(Film input);
	public List<Ticket> getTicketByCustomer(Customer input);
	public List<Ticket> getRecentTickets();
	
	// Delete
	public void deleteTicket(Ticket input);

}
