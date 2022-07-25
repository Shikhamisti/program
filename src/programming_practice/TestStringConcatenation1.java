package programming_practice;

public class TestStringConcatenation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Sachin" +"Tendulkar";
System.out.println(s);
}

}
//the java compiler transform above code-
//String s=(new StringBuilder()).append("Sachin").append("Tendulkar").toString();
