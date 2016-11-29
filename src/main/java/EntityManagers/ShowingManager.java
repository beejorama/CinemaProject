package EntityManagers;

import java.util.Date;
import java.util.List;

import Entities.Film;
import Entities.Screen;
import Entities.Showing;

public interface ShowingManager {
	
	// Create
	public void persistShowing(Showing input);
	
	// Read
	public List<Showing> getShowingByFilm(Film input);
	public List<Showing> getUpcomingShowings();
	
	// Update
	public void updateShowingFilm(Film input);
	public void updateShowingTime(Date input);
	public void updateShowingScreen(Screen input);
	
	// Delete
	public void deleteShowing(Showing input);

}
