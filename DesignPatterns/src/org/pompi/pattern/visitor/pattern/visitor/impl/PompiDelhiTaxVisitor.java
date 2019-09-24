package org.pompi.pattern.visitor.pattern.visitor.impl;

import org.pompi.pattern.visitor.pattern.visitable.impl.PompiFood;
import org.pompi.pattern.visitor.pattern.visitable.impl.Liquor;
import org.pompi.pattern.visitor.pattern.visitable.impl.Medicine;
import org.pompi.pattern.visitor.pattern.visitor.PompiTaxVisitor;


/**
 * this implementation for <tt> PompiTaxVisitor </tt> for Delhi city in India
 * 
 * @author singh
 *
 */
public class PompiDelhiTaxVisitor implements PompiTaxVisitor{

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
	public double visit(PompiFood item) {
		System.out.println(this.getClass().getName() + "is calculating taxes on" + item.getClass().getName());
		return item.getPrice() * item.getQuantity() * 0;
}

	
}
