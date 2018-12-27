package mediaRentalManager;

public abstract class Media {
	//Generate getters and setters
	//generate constructor
	private String title;
	private int copiesAvailable;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopiesAvailable() {
		return copiesAvailable;
	}
	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}
	public Media(String title, int copiesAvailable) {
		super();
		this.title = title;
		this.copiesAvailable = copiesAvailable;
	}
	public Media() {
		
	}
	

}
