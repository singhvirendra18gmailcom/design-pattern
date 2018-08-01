package factory.processors;



public class VanillaProcessor implements Processor{

	@Override
	public void process() {
		System.out.println("processing using" + this.getClass().getSimpleName());
		
	}

}
