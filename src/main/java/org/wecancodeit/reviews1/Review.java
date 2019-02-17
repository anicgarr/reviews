package org.wecancodeit.reviews1;

public class Review {

	private long id;
	private String title;
	private String reviewCategory;

	public Review(long id, String title, String reviewCategory) {
		this.id=id;
		this.title=title;
		this.reviewCategory=reviewCategory;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getReviewCategory() {
		return reviewCategory;
	}
}
