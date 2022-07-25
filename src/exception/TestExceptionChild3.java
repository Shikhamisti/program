package exception;
class Parent2{
	void msg() throws ArithmeticException{
		System.out.println("parent method");
		
	}
}

public class TestExceptionChild3 extends Parent2 {
	void msg() throws Exception{
		System.out.println("child method");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p= new TestExceptionChild3();
		
		try {
			p.msg();
			
		}
		catch(Exception e) {}
		

	}

}
