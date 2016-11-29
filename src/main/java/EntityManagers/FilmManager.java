package EntityManagers;

import java.util.List;

import Entities.Film;

public interface FilmManager {
	
	// Create
	public void persistFilm(Film input);
	
	// Read
	public List<Film> getFilmByTitle(String input);
	public List<Film> getFilmByKeyword(String input);
	public List<Film> getFilmByDecade(String input);
	
	// Update
	public void updateFilmTitle(String input);
	public void updateFilmDescription(String input);
	public void updateFilmRating();
	public void updateFilmLength(int input);
	public void updateFilmImage(String input);
	
	// Delete
	public void deleteFilm(Film input);

}
