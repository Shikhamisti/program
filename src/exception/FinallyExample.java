package exception;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	System.out.println("inside try block");
	int data=25/0;
	System.out.println(data);
		
}
//handles the Arithmetic exception/divide by zero exception
catch(ArithmeticException e) {
	System.out.println("Exception handled");
	System.out.println(e);
	
}
//executes regardless of exception occurred or not
finally {
	System.out.println("finally block is always executed");
	
}
	}

}
