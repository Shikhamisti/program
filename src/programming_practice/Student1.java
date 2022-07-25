package programming_practice;

public class Student1 {
	int rollno;
	String name;
	String city;
	

	public Student1(int rollno, String name, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}


	@Override
	public String toString() {//overriding the toString() method
		return "Student1 [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student1 s1=new Student1(101,"raj","chennai");
Student1 s2 =new Student1(102,"vijay","delhi");

System.out.println(s1);
System.out.println(s2);


	}

}
