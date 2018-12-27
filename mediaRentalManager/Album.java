package mediaRentalManager;

/*
 * create getters/setters
 * constructors
 */
public class Album extends Media {
	
	private String artist;
	private String songs;
	
	
	/*
	 *return format: Title: Bad, Copies Available: 2, Artist: Mike J, Songs: Mirror, Far Away
	 */
	@Override
	public String toString() {
		return "Title: Bad, Copies Available: 2, Artist: Mike J, Songs: Mirror, Far Away";
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public String getSongs() {
		return songs;
	}


	public void setSongs(String songs) {
		this.songs = songs;
	}


	public Album(String artist, String songs) {
		super();
		this.artist = artist;
		this.songs = songs;
	}
	public Album() {
		
	}
	

}
