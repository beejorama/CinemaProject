package EntityManagers;

import java.util.List;

import Entities.Customer;
import Entities.Film;
import Entities.Review;

public interface ReviewManager {
	
	// Create
	public void persistReview(Review input);
	
	// Read
	public List<Review> getReviewByFilm(int id);
	public List<Review> getReviewByCustomer(String email);
	
	// Update
	public void updateReviewRating(int id, int input);
	public void updateReviewText(int id, String input);
	
	// Delete
	public void deleteReview(int id);

}
