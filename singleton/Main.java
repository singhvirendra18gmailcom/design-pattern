package singleton;

public class Main {

	public static void main(String[] args) {
		
		Resource r1=Resource.get();
		Resource r2=Resource.get();
		System.out.println(Resource.get());
		System.out.println(Resource.get());
		
		if(r1==r2){
			System.out.println("both objects are same: its singleton");
		}else{
			System.out.println("both objects are not same: its not singleton");
		}
		
	}
}
