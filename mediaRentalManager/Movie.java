package mediaRentalManager;

//Generate getters and setters
//generate constructor
public class Movie extends Media {
	private String rating;
	
	
	/*
	 * Title: Gone with the Wind, Copies Available: 2, Rating: PG
	 */
	
	@Override
	public String toString() {
		return "Title: "+super.getTitle()+", Copies Availble: "+super.getCopiesAvailable()
		+", Rating: "+this.rating;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public Movie(String title, int copiesAvailable, String rating) {
		super(title, copiesAvailable);
		this.rating = rating;
	}
	public Movie() {
		
	}
	

}
