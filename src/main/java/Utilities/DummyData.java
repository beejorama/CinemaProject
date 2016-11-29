package Utilities;

import java.util.Date;

import Entities.Film;
import Entities.Screen;
import Entities.Seat;
import Entities.Showing;

public class DummyData {
	
	public DummyData(){
		Film f1 = new Film("Pulp Fiction", "A cult classic by Tarantino", 1996, 120, "/path/to/img");
		Screen s1 = new Screen(new Seat[10][7], 400);
		Showing sh1 = new Showing(f1, new Date(), s1);
		
		// Add more dummy data
	}

}
