package factory.factory;

import factory.processors.ButterscotchProcessor;
import factory.processors.ChoclateProcessor;
import factory.processors.Processor;
import factory.processors.StrawberryProcessor;
import factory.processors.VanillaProcessor;

public class ProcessFactory {

	public static Processor getPrcessor(ProcessorType type) {
		Processor processor = null;
		switch (type) {
		case BUTTESCOTCH:
			processor = new ButterscotchProcessor();
			break;
		case VANILLA:
			processor = new VanillaProcessor();
			break;
		case CHOCLATE:
			processor = new ChoclateProcessor();
			break;
		case STRAWBERRY:
			processor = new StrawberryProcessor();
			break;
		default:
			throw new IllegalArgumentException();

		}
		return processor;
	}
}
