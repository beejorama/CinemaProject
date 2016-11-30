package EntityManagers;

import Entities.Screen;
import Entities.Seat;

public interface ScreenManager {
	
	// Create
	public void persistScreen(Screen input);
	
	// Update
	public void updateScreenSize(int id, int input);
	public void updateScreenLayout(int id, Seat[][] input);
	
	// Delete
	public void deleteScreen(int id);
	
}
