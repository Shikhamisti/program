package programming_practice;

public class StrBuilder {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Hello");
		StringBuilder s2=new StringBuilder("World");
		StringBuilder s=s1.append(s2);//String 3 to store resuklt
		System.out.println(s.toString());
		
	}

}
