package programming_practice;

public class TestStringComparison2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Sachin";
String s2="Sachin";
String s3 =new String("Sachin");
System.out.println(s1==s2);//true
System.out.println(s1==s3);//false (becoz s3 refers to instance created in non pool
}

}
//the == operator compares refrences not values