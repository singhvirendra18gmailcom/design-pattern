package org.pompi.pattern.visitor.pattern.visitable.impl;

import org.pompi.pattern.visitor.pattern.visitable.PompiVisitibale;
import org.pompi.pattern.visitor.pattern.visitor.PompiTaxVisitor;

public class Liquor implements PompiVisitibale{

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

	public Liquor(int price, int quantity) {
		super();
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public double accept(PompiTaxVisitor visitor) {
		return visitor.visit(this);
		
		
	}

}
