package factory.client;

import factory.factory.ProcessFactory;
import factory.factory.ProcessorType;
import factory.processors.Processor;

public class Main {

	public static void main(String[] args) {
		Processor  p1=ProcessFactory.getPrcessor(ProcessorType.BUTTESCOTCH);
		p1.process();
		Processor  p2=ProcessFactory.getPrcessor(ProcessorType.STRAWBERRY);
		p2.process();
	}
}
