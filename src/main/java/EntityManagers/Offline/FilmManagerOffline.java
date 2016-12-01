package EntityManagers.Offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import Entities.Film;
import EntityManagers.FilmManager;
import Utilities.DummyData;

@Default
@Stateless
public class FilmManagerOffline implements FilmManager{
	
	@Inject
	private DummyData dummyData;

	public void persistFilm(Film input) {
		dummyData.getFilms().add(input);
	}
	
	public List<Film> getShowingFilms(){
		List<Film> returnList = new ArrayList<Film>();
		List<Film> searchList = dummyData.getFilms();
		for(Film f : searchList){
			if(f.isShowing()){
				returnList.add(f);
			}
		}
		return returnList;
	}

	public List<Film> getFilmByTitle(String input) {
		List<Film> returnList = new ArrayList<Film>();
		List<Film> searchList = dummyData.getFilms();
		for(Film f : searchList){
			if(f.getTitle().contains(input)){
				returnList.add(f);
			}
		}
		return returnList;
	}

	public List<Film> getFilmByDecade(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	public Film getFilmById(int input) {
		Film returnFilm = null;
		List<Film> searchList = dummyData.getFilms();
		for(Film f : searchList){
			if(f.getId() == input){
				returnFilm = f;
			}
		}
		return returnFilm;
	}

	public void updateFilmTitle(int id, String input) {
		for(Film f : dummyData.getFilms()){
			if(f.getId() == id){
				f.setTitle(input);
				break;
			}
		}
	}

	public void updateFilmDescription(int id, String input) {
		for(Film f : dummyData.getFilms()){
			if(f.getId() == id){
				f.setDescription(input);
				break;
			}
		}
	}

	public void updateFilmRating(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateFilmLength(int id, int input) {
		for(Film f : dummyData.getFilms()){
			if(f.getId() == id){
				f.setRuntime(input);
				break;
			}
		}
	}

	public void updateFilmImage(int id, String input) {
		for(Film f : dummyData.getFilms()){
			if(f.getId() == id){
				f.setImgPath(input);
				break;
			}
		}
	}

	public void deleteFilm(int id) {
		List<Film> list = dummyData.getFilms();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getId() == id){
				list.remove(i);
				break;
			}
		}
	}

}
