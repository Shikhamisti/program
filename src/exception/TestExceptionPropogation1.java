package exception;

public class TestExceptionPropogation1 {
	void m() {
		int data =50/0;
		
	}
	void n() {
		m();
		
	}
	void p() {
		try {
			n();
			
		}
		catch(Exception e) {
			System.out.println("exception handled");}
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestExceptionPropogation1 obj=new 	TestExceptionPropogation1();
		obj.p();
		System.out.println("normal flow");
		

	}

}
