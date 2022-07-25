package programming_practice;

public class TestStringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Sachin";
String s2="sachin";
String s3=new String ("Sachin");
String s4="Saurav";
System.out.println(s1.equals(s2));//true
System.out.println(s1.equals(s3));//true
System.out.println(s1.equals(s4));//false

	}

}
