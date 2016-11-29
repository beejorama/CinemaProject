package EntityManagers.Offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import Entities.Review;
import EntityManagers.ReviewManager;
import Utilities.DummyData;

@Default
@Stateless
public class ReviewManagerOffline implements ReviewManager {

	@Inject
	private DummyData dummyData;
	
	public void persistReview(Review input) {
		dummyData.getReviews().add(input);
	}

	public List<Review> getReviewByFilm(int id) {
		List<Review> returnList = new ArrayList<Review>();
		List<Review> searchList = dummyData.getReviews();
		for(Review r : searchList){
			if(r.getId() == id){
				returnList.add(r);
			}
		}
		return returnList;
	}

	public List<Review> getReviewByCustomer(String email) {
		List<Review> returnList = new ArrayList<Review>();
		List<Review> searchList = dummyData.getReviews();
		for(Review r : searchList){
			if(r.getCustomer().getEmail().equals(email)){
				returnList.add(r);
			}
		}
		return returnList;
	}

	public void updateReviewRating(int id, int input) {
		for(Review r : dummyData.getReviews()){
			if(r.getId() == id){
				r.setRating(input);
				break;
			}
		}
	}

	public void updateReviewText(int id, String input) {
		for(Review r : dummyData.getReviews()){
			if(r.getId() == id){
				r.setText(input);
				break;
			}
		}
	}

	public void deleteReview(int id) {
		List<Review> list = dummyData.getReviews();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getId() == id){
				list.remove(i);
				break;
			}
		}
	}

}
