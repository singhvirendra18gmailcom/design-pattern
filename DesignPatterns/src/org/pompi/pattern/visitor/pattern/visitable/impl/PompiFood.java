package org.pompi.pattern.visitor.pattern.visitable.impl;

import org.pompi.pattern.visitor.pattern.visitable.PompiVisitibale;
import org.pompi.pattern.visitor.pattern.visitor.PompiTaxVisitor;

/**
 * 
 * this class represents food items , and instance of this class are @see PompiVisitable
 * and accepts @see PompiTaxVisitor
 * 
 * @author e5571531
 *
 */
public class PompiFood implements PompiVisitibale{

	
	/**
	 * This field represents price of a unit of @see PompiFood
	 */
	private int price;
	
	/**
	 * This field represents quantity aka units of @see PompiFood 
	 */
	private int quantity;

	/**
	 * @return quantity of this object
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * set the quantity of this Object
	 * @param quantity is new the quantity for this object
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * set the price for this object
	 * @param price is the new price for this object.
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 
	 * @return price of this object
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * constructs a new @see PompiFood item with specified price and quantity
	 * @param initial price for this @see PompiFood item 
	 * @param initial quantity for this @see PompiFood item
	 */
	public PompiFood(int price, int quantity) {
		super();
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public double accept(PompiTaxVisitor visitor) {
		return visitor.visit(this);
	}

}
