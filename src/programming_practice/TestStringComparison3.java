package programming_practice;

public class TestStringComparison3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Sachin";
String s2="Sachin";
String s3="Ratan";
System.out.println(s1.compareTo(s2));//o
System.out.println(s1.compareTo(s3));//1(becoz s3> s1)
System.out.println(s3.compareTo(s1));//-1(becoz s1<s1)
	}

}
