package programming_practice;

public class StringBufferExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb= new StringBuffer();
System.out.println(sb.capacity());//by default-16
sb.append("Hello");
System.out.println(sb.capacity());//now 16
sb.append("java is my fav. language");
System.out.println(sb.capacity());//now(16*2)+2=34i.e(oldcapacity*2)+2
}

}
