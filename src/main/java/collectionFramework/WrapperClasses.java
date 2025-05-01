package collectionFramework;

public class WrapperClasses {

	public static void main(String[] args) {

		WrapperClasses q= new WrapperClasses();
		q.integer();

	}
	
	public void integer() {
		//  Boxing is Primitive to Wrapper
		int a=10;
		
		Integer b=Integer.valueOf(a);
		System.out.println(b instanceof Integer);
		// Un-Boxing is Wrapping to Primitive
		
	}

}
