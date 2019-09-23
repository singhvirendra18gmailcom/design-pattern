package org.pompi.pattern.visitor.impl;

import org.pompi.pattern.visitor.PompiVisitor;

public class Food implements PompiVisitibale{

	private int price;
	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public Food(int price, int quantity) {
		super();
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public double accept(PompiVisitor visitor) {
		return visitor.visit(this);
	}

}
