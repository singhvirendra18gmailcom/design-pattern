package factory.processors;



public class StrawberryProcessor implements Processor {

	@Override
	public void process() {
		System.out.println("processing using" + this.getClass().getSimpleName());
	}

}
