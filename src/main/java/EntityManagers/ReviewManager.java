package EntityManagers;

import java.util.List;

import Entities.Customer;
import Entities.Film;
import Entities.Review;

public interface ReviewManager {
	
	// Create
	public void persistReview(Review input);
	
	// Read
	public List<Review> getReviewByFilm(Film input);
	public List<Review> getReviewByCustomer(Customer input);
	
	// Update
	public void updateReviewRating(int input);
	public void updateReviewText(String input);
	
	// Delete
	public void deleteReview(Review input);

}
