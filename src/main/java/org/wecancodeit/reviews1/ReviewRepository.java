package org.wecancodeit.reviews1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository() {
		Review review1 = new Review(1L, "Review1", "cars");
		Review review2 = new Review(2L, "Review2", "bikes");
		Review review3 = new Review(3L, "Review3", "houses");

		reviewList.put(review1.getId(), review1);
		reviewList.put(review2.getId(), review2);
		reviewList.put(review3.getId(), review3);

	}

	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findOne(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
