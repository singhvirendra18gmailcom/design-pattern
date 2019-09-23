package org.pompi.pattern.visitor.impl;

import org.pompi.pattern.visitor.PompiVisitor;

public interface PompiVisitibale {
	
	double accept(PompiVisitor visitor);

}
