package EntityManagers;

import Entities.Screen;

public interface ScreenManager {
	
	// Create
	public void persistScreen(Screen input);
	
	// Update
	public void updateScreenSize(int id, int input);
	public void updateScreenLayout(int id, boolean[][] input);
	
	// Delete
	public void deleteScreen(int id);
	
}
