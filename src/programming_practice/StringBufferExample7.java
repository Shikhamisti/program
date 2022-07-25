package programming_practice;

public class StringBufferExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());//default 16
sb.append("Hello");
System.out.println(sb.capacity());//now 16
sb.append("java is my fav. lang.");
System.out.println(sb.capacity());//(16*2)+2=34
sb.ensureCapacity(10);//now no change
System.out.println(sb.capacity());//now 34
sb.ensureCapacity(50);//(34*2)+2
System.out.println(sb.capacity());//70
	}

}
