package factory.processors;



public class ButterscotchProcessor implements Processor {

	@Override
	public void process() {
		System.out.println("processing using" + this.getClass().getSimpleName());
	}

}
