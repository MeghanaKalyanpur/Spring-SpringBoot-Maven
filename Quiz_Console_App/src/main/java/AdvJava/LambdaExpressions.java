package AdvJava;

public class LambdaExpressions {
	
	interface A{
		void show();// by default public and abstarct
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//anonymous inner class
		A a= new A(){

			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
			
		};

	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		A a= ()-> System.out.println("inshow");		
//
//	}

}
