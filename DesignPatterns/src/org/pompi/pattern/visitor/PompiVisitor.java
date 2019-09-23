/**
 * 
 */
package org.pompi.pattern.visitor;

import org.pompi.pattern.visitor.impl.Food;
import org.pompi.pattern.visitor.impl.Liquor;

/**
 * @author singh
 *
 */
public interface PompiVisitor {

	double visit(Liquor liquor);
	double visit(Medicine medicine);
	double visit(Food food);
	
	
	
}
