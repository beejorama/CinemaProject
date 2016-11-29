package EntityManagers;

import java.util.List;

import Entities.Film;

public interface FilmManager {
	
	// Create
	public void persistFilm(Film input);
	
	// Read
	public List<Film> getFilmByTitle(String input);
	public List<Film> getFilmByDecade(String input);
	public Film getFilmById(int input);
	
	// Update
	public void updateFilmTitle(int id, String input);
	public void updateFilmDescription(int id, String input);
	public void updateFilmRating(int id);
	public void updateFilmLength(int id, int input);
	public void updateFilmImage(int id, String input);
	
	// Delete
	public void deleteFilm(int id);

}
