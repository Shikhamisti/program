package programming_practice;

public class StringExample {

	public static void main(String[] args) {
		
		String s1="java";//creating string by java string literal
		
		char ch[]= {'s','t','r','i','n','g','s'};
		String s2=new String(ch);//converting char array to String
		String s3=new String("example");//creating java strings by new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
//code converts a char array into String object.
