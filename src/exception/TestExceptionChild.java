package exception;

class Parent{
	
	void msg() {
		System.out.println("parent method");
		
	}
}

public class TestExceptionChild extends Parent{
	void msg() throws IOException{
		System.out.println("TestExceptionChild");
		
	}
	
	
	


	public static void main(String[] args) {
		Parent p=new TestExceptionChild();
		p.msg();
		
		// TODO Auto-generated method stub

	}

}
