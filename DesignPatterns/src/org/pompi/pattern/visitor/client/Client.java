package org.pompi.pattern.visitor.client;

import org.pompi.pattern.visitor.PompiVisitor;
import org.pompi.pattern.visitor.impl.Food;
import org.pompi.pattern.visitor.impl.Liquor;
import org.pompi.pattern.visitor.impl.Medicine;
import org.pompi.pattern.visitor.impl.PompiTaxVisitor;
import org.pompi.pattern.visitor.impl.PompiVisitibale;

public class Client {

	public static void main(String[] args) {
	
		PompiVisitibale food=new Food(23, 100);
		PompiVisitibale medicine=new Medicine(100, 23);
		PompiVisitibale liquor=new Liquor(12, 2);
		
		PompiVisitor taxVisitor=new PompiTaxVisitor();
		
		System.out.println("tax on food -> "+ food.accept(taxVisitor));
		System.out.println("tax on food -> "+ medicine.accept(taxVisitor));
		System.out.println("tax on food -> "+ liquor.accept(taxVisitor));
		
		
	}
}
