/**
 * 
 */
package org.pompi.pattern.visitor.pattern.visitor;

import org.pompi.pattern.visitor.pattern.visitable.impl.PompiFood;
import org.pompi.pattern.visitor.pattern.visitable.impl.Liquor;
import org.pompi.pattern.visitor.pattern.visitable.impl.Medicine;

/**
 * An uses of this interface can get calculated tax on following items i.e. 
 * @see Liquor , @see Medicine , @See Food.
 * 
 *  @author singh
 *
 */
public interface PompiTaxVisitor {

	/**
	 * 
	 * @param liquor
	 * @return taxable amount on @see Liquor type
	 */
	double visit(Liquor liquor);

	/**
	 * 
	 * @param medicine
	 * @return taxable amount on @see Medicine type
	 */
	double visit(Medicine medicine);

	/**
	 * 
	 * @param food
	 * @return taxable amount on @see Food Type
	 */
	double visit(PompiFood food);
	

}
