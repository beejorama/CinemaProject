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
	public List<Showing> getShowingByFilm(int id);
	
	// Update
	public void updateShowingFilm(int id, Film input);
	public void updateShowingTime(int id, int hour, int minute);
	public void updateShowingScreen(int id, Screen input);
	
	// Delete
	public void deleteShowing(int id);

}
