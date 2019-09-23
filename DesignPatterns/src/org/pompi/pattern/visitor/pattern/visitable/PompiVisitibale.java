package org.pompi.pattern.visitor.pattern.visitable;

import org.pompi.pattern.visitor.pattern.visitor.PompiTaxVisitor;

public interface PompiVisitibale {
	
	double accept(PompiTaxVisitor visitor);

}
