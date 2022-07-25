package exception;

public class TestThrowAndThrows {
	
	static void method() throws ArithmeticException{
		System.out.println("inside the method()");
		throw new ArithmeticException("throwing arithmetic Exception");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			try {
				method();
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("caught in main() method");
			}
		}
	}

}
