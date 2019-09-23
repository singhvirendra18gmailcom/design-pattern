package org.pompi.pattern.visitor.pattern.client;

import org.pompi.pattern.visitor.pattern.visitable.PompiVisitibale;
import org.pompi.pattern.visitor.pattern.visitable.impl.Food;
import org.pompi.pattern.visitor.pattern.visitable.impl.Liquor;
import org.pompi.pattern.visitor.pattern.visitable.impl.Medicine;
import org.pompi.pattern.visitor.pattern.visitor.PompiTaxVisitor;
import org.pompi.pattern.visitor.pattern.visitor.impl.PompiDelhiTaxVisitor;

public class Client {

	public static void main(String[] args) {
	
		PompiVisitibale food=new Food(23, 100);
		PompiVisitibale medicine=new Medicine(100, 23);
		PompiVisitibale liquor=new Liquor(12, 2);
		
		PompiTaxVisitor taxVisitor=new PompiDelhiTaxVisitor();
		
		System.out.println("tax on food -> "+ food.accept(taxVisitor));
		System.out.println("tax on food -> "+ medicine.accept(taxVisitor));
		System.out.println("tax on food -> "+ liquor.accept(taxVisitor));
		
		
	}
}
