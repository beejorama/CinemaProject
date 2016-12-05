package EntityManagers.Offline;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import Entities.Film;
import Entities.Screen;
import Entities.Showing;
import EntityManagers.ShowingManager;
import Utilities.DummyData;

@Default
@Stateless
public class ShowingManagerOffline implements ShowingManager {

	@Inject
	private DummyData dummyData;
	
	public void persistShowing(Showing input) {
		dummyData.getShowings().add(input);
	}

	public List<Showing> getShowingByFilm(int id) {
		List<Showing> returnList = new ArrayList<Showing>();
		List<Showing> searchList = dummyData.getShowings();
		for(Showing s : searchList){
			if(s.getFilm().getId() == id){
				returnList.add(s);
			}
		}
		return returnList;
	}

	public void updateShowingFilm(int id, Film input) {
		for(Showing s : dummyData.getShowings()){
			if(s.getId() == id){
				s.setFilm(input);
				break;
			}
		}
	}

	public void updateShowingTime(int id, int hour, int minute) {
		for(Showing s : dummyData.getShowings()){
			if(s.getId() == id){
				s.getTime().set(Calendar.HOUR, hour);
				s.getTime().set(Calendar.MINUTE, minute);
				break;
			}
		}
	}

	public void updateShowingScreen(int id, Screen input) {
		for(Showing s : dummyData.getShowings()){
			if(s.getId() == id){
				s.setScreen(input);
				break;
			}
		}
	}

	public void deleteShowing(int id) {
		List<Showing> list = dummyData.getShowings();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getId() == id){
				list.remove(i);
				break;
			}
		}
	}

}
