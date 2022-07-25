package exception;

public class FinalizeExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		FinalizeExample obj=new FinalizeExample();
		//printing the hashcode
		System.out.println(obj.hashCode());
		obj=null;
		//calling the garbage collector using gc()
		System.out.println("End of the garbage collection");
	}
	//definiong the finalize method
	protected  void finalize() {
		System.out.println("called the finalize method");
		
		
		
		

	}

}
