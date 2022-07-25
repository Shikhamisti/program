package exception;

class MyCustomException extends Exception {
	
}

public class TestCustomException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			try
			{//throw an object of user defined exception
				throw new MyCustomException();
			}
			catch(MyCustomException ex) {
				System.out.println("caught the exception");
				System.out.println(ex.getMessage());
				
				
			}
			System.out.println("rest of the code.....");
			
		}
	}

}
