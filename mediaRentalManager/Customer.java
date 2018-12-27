package mediaRentalManager;

import java.util.ArrayList;
import java.util.List;

/*
 * Create getters/setters
 * constructors
 */
public class Customer {
	
	private String name;
	private String address;
	private String plan;
	
	private List<String> rented = new ArrayList<>();
	private List<String> queued = new ArrayList<>();
	
	public void addToQueuedList(String mediaTitle) {
		queued.add(mediaTitle);
	}
	
	public void addToRentedList(String mediaTitle) {
		rented.add(mediaTitle);
	}
	
	public void removeFromQueuedList(String mediaTitle) {
		queued.remove(mediaTitle);
	}
	
	public void removeFromRentedList(String mediaTitle) {
		rented.remove(mediaTitle);
	}
	
	//return object info in this format:
	/*Name: Albert, Mike, Address: 11 Apple Mount VA, Plan: LIMITED
	  Rented: []
	  Queue: []
	*/
	@Override
	public String toString() {
		return "Name: "+this.name+", Address: "+this.address+", Plan: "+this.plan+"\n"
				+"Rented: "+rented+"\n"+"Queue: "+queued;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public List<String> getRented() {
		return rented;
	}

	public void setRented(List<String> rented) {
		this.rented = rented;
	}

	public List<String> getQueued() {
		return queued;
	}

	public void setQueued(List<String> queued) {
		this.queued = queued;
	}

	public Customer(String name, String address, String plan, List<String> rented, List<String> queued) {
		super();
		this.name = name;
		this.address = address;
		this.plan = plan;
		this.rented = rented;
		this.queued = queued;
	}

public Customer() {
	
}
	
}
