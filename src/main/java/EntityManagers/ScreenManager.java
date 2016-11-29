package EntityManagers;

import java.util.List;

import Entities.Screen;
import Entities.Seat;

public interface ScreenManager {
	
	// Create
	public void persistScreen(Screen input);

	// Read
	public List<Screen> getScreenBySize();
	
	// Update
	public void updateScreenSize(int input);
	public void updateScreenLayout(Seat[][] input);
	
	// Delete
	public void deleteScreen(Screen input);
	
}
