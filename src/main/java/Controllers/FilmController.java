package Controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Entities.Film;
import service.FilmService;

@Named("films")
@RequestScoped
public class FilmController implements Serializable{
	
	@Inject
	private FilmService filmService;
	
	private Film selectedFilm;
	
	// Interesting methods
	
	// Get featured films
	
	// Get showing films
	public List<Film> getShowingFilms(){
		return filmService.getShowingFilms();
	}
	
	// Select a film to view
	public String view(Film f){
		selectedFilm = f;
		return "filmdetail.xhtml";
	}

	// Get film by id
	
	
	// Getters and setters
	
	/**
	 * @return the selectedFilm
	 */
	public Film getSelectedFilm() {
		return selectedFilm;
	}

	/**
	 * @param selectedFilm the selectedFilm to set
	 */
	public void setSelectedFilm(Film selectedFilm) {
		this.selectedFilm = selectedFilm;
	}
	


}
