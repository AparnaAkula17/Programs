package model1;

import java.util.Set;

public class Item1
{
	private long id;
	private double price;
	private String description;

	private Set<Cart1> carts;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Cart1> getCarts() {
		return carts;
	}

	public void setCarts(Set<Cart1> carts) {
		this.carts = carts;
	}
}
