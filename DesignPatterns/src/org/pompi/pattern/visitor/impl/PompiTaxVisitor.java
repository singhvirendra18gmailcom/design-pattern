package org.pompi.pattern.visitor.impl;

import org.pompi.pattern.visitor.PompiVisitor;

public class PompiTaxVisitor implements PompiVisitor{

	@Override
	public double visit(Liquor item) {
			System.out.println(this.getClass().getName() + "is calculating taxes on" + item.getClass().getName());
			return item.getPrice() * item.getQuantity() * 0.5;
	}

	@Override
	public double visit(Medicine item) {
		System.out.println(this.getClass().getName() + "is calculating taxes on" + item.getClass().getName());
		return item.getPrice() * item.getQuantity() * 0.1;
}

	@Override
	public double visit(Food item) {
		System.out.println(this.getClass().getName() + "is calculating taxes on" + item.getClass().getName());
		return item.getPrice() * item.getQuantity() * 0;
}

	
}
