package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Entities.Film;
import EntityManagers.FilmManager;

@Stateless
public class FilmService {
	
	@Inject
	private FilmManager filmManager;
	
	// Get featured films
	
	// Get showing films
	public List<Film> getShowingFilms(){
		return filmManager.getShowingFilms();
	}
	
	// Get film by id
}
