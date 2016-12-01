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
	
	// Get featured films
	
	// Get showing films
	public List<Film> getShowingFilms(){
		List<Film> list = new ArrayList<Film>();
		Film f = new Film("Whats up", "This is my film boss", 116, 200, "img/pulp.jpg");
		list.add(f);
		return list;
		// return filmService.getShowingFilms();
	}
	
	// Get film by id
	

}
