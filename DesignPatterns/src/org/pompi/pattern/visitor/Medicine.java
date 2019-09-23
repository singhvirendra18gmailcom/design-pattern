package org.pompi.pattern.visitor;

import org.pompi.pattern.visitor.impl.PompiVisitibale;

public class Medicine implements PompiVisitibale{

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

	public Medicine(int price, int quantity) {
		super();
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public double accept(PompiVisitor visitor) {
		return visitor.visit(this);
	}

}
