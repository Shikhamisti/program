package programming_practice;

import java.util.StringJoiner;

public class StrJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringJoiner s=new StringJoiner(",");//string joiner object
s.add("Hello");
s.add("world");
System.out.println(s.toString());
}

}
