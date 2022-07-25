package programming_practice;

final class Employee {
	final String pancardNumber;
	public Employee(String pancardNumber)
	{
		this.pancardNumber=pancardNumber;
		
	}
	public String getpancardNumber() {
		return pancardNumber;
		
	}

}
public class ImmutableDemo{
	public static void main(String ar[]) {
	
		Employee e= new Employee("AAABC123");
		String s1=e.getpancardNumber();
		System.out.println("Pancard Number:" +s1);
	}
}