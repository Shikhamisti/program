package exception;

import java.io.FileNotFoundException;

public class TestThrow2 {
	public static void method() throws FileNotFoundException{
		FileReader file=new FileReader();
		BufferReader fileInput =new BufferedReader(file);
		throw new FileNotFoundException();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	method();
	
}
catch(FileNotFoundException e){
	e.printStackTrace();
	
}
System.out.println("rest of the code...");
	}

}
