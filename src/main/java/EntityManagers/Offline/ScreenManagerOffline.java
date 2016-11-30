package EntityManagers.Offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import Entities.Screen;
import Entities.Seat;
import EntityManagers.ScreenManager;
import Utilities.DummyData;

@Default
@Stateless
public class ScreenManagerOffline implements ScreenManager {

	@Inject
	private DummyData dummyData;
	
	public void persistScreen(Screen input) {
		dummyData.getScreens().add(input);
	}

	public void updateScreenSize(int id, int input) {
		for(Screen s : dummyData.getScreens()){
			if(s.getId() == id){
				s.setScreenSize(input);
				break;
			}
		}
	}

	public void updateScreenLayout(int id, Seat[][] input) {
		for(Screen s : dummyData.getScreens()){
			if(s.getId() == id){
				s.setLayout(input);
				break;
			}
		}
	}

	public void deleteScreen(int id) {
		List<Screen> list = dummyData.getScreens();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getId() == id){
				list.remove(i);
				break;
			}
		}
	}

}
