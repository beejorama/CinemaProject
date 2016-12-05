package Controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import Entities.Showing;

@Named("showings")
@RequestScoped
public class ShowingController implements Serializable{
	
	private Showing selectedShowing;
	
	public String view(Showing s){
		selectedShowing = s;
		return "Change me to booking page";
	}

}
