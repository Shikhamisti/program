package exception;

import java.io.IOException;

class M{
	void method() throws IOException{
		System.out.println("device operation performed");
		
	}
}

public class TestThrows3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
M m=new M();
m.method();
System.out.println("normal flow");

	}

}
