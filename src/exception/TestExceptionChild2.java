package exception;

class Parent1{
	void msg() {
		System.out.println("Parent method");
		
	}
}

public class TestExceptionChild2 extends Parent1{
	void msg()throws ArithmeticException{
		System.out.println("child method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent1 p=new TestExceptionChild2();
p.msg();
	}

}
