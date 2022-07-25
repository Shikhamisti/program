package programming_practice;

public class Student {
	int rollno;
	String name;
	String city;
	
	

	public Student(int rollno, String name, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(101,"raj","lucknow");
Student s2=new Student(102,"vijay","delhi");

System.out.println(s1);//compiler writes here s1.toString()
System.out.println(s2);//compiler writes here s2.toString()

	}

}
