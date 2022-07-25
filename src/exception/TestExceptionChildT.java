package exception;

class ParentP{
	void msg() throws Exception{
		System.out.println("parent method");
		
	}
}

public class TestExceptionChildT extends ParentP {
	void msg() throws ArithmeticException{
		System.out.println("child method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParentP p= new TestExceptionChildT();
try {
	p.msg();
}
catch(Exception e) {}



	}

}
