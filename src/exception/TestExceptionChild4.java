package exception;

class ParentT{
	void msg() throws Exception{
		System.out.println("parent method");
		
	}
}

public class TestExceptionChild4  extends ParentT{
	void msg() throws Exception{
		System.out.println("child method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentT p=new TestExceptionChild4();
		try {
			p.msg();
			
		}
catch(Exception e) {}
	}

}
