package model1;

import java.util.Set;

public class Cart1 
{
	private long id;
	private double total;

	private Set<Item1> items;
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Item1> getItems() {
		return items;
	}

	public void setItems(Set<Item1> items) {
		this.items = items;
	}

}
