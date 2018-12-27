package mediaRentalManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaRentalManager implements MediaRentalManagerInt{
	
	private List<Customer> customers = new ArrayList<>();
	private List<Media> media = new ArrayList<>();
	private int limitedPlanLimit;
	
	@Override
	public void addCustomer(String name, String address, String plan) {
		Customer c= new Customer();
		customers.add(c);
	}
	
	@Override
	public String getAllCustomersInfo() {
		StringBuilder stb = new StringBuilder("***** Customers' Information *****");
		//This line will sort Customers by name
		Collections.sort(customers,(a,b) -> a.getName().compareTo(b.getName()) );
		
		//TODO add each customer info to stb. separate by new line
		for(Customer c:customers) {
			stb.append(c.getName()+"\n");
		}
		
		
		
		
		return stb.toString();
	}

	@Override
	public void addMovie(String title, int copiesAvailable, String rating) {
		//create Movie Object then add to media list	
		Movie m=new Movie();
		media.add(m);
		
	}

	@Override
	public void addAlbum(String title, int copiesAvailable, String artist, String songs) {
		//create Album Object then add to media list	
		Album a= new Album();
		media.add(a);
	}
	
	@Override
	public String getAllMediaInfo() {
		StringBuilder stb = new StringBuilder("***** Media Information *****\n");
		//This line will sort media by name
		Collections.sort(media, (a,b) -> a.getTitle().compareTo(b.getTitle()));
		//TODO add each media info to stb. separate by new line
		for(Media medi:media) {
			stb.append(medi.getTitle()+"\n");
		}

		return stb.toString();
	}

	@Override
	public void setLimitedPlanLimit(int limitedPlanLimit) {
		// TODO assign to limitedPlanLimit.
		//Customers with LIMITED plan can only rent that many media
		this.limitedPlanLimit=limitedPlanLimit;
		
	}

	@Override
	public boolean addToQueue(String customerName, String mediaTitle) {
		//TODO find the customer by name and add mediaTitle
		//return true if customer is found and media added otherwise false
		for(Customer custom:customers) {
			if(custom.getName().equalsIgnoreCase(customerName)) {
				((Customer) media).addToQueuedList(mediaTitle);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean removeFromQueue(String customerName, String mediaTitle) {
		//TODO find the customer by name and remove media from Queue
		//return true if customer is found and media is also in queue and
		//was removed otherwise false
		for(Customer custom:customers) {
			if(custom.getName().equalsIgnoreCase(customerName)) {
				((Customer) media).removeFromQueuedList(mediaTitle);
				return true;
			}
		}
		return false;
	}

	@Override
	public String processRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean returnMedia(String customerName, String mediaTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<String> searchMedia(String title, String rating, String artist, String songs) {
		// TODO Auto-generated method stub
		return null;
	}

}
