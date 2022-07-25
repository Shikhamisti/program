package exception;
class Parent8{
	void msg() throws Exception{
		System.out.println("parent method");
		
	}
}

public class TestExceptionClass8 extends Parent8 {
	void msg() {
		System.out.println("child method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent8 p=new TestExceptionClass8();
		try {
			p.msg();
			
		}
catch(Exception e) {}
	}

}
