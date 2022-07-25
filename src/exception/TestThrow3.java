package exception;

class UserDefinedException extends Exception{
	
	public UserDefinedException(String str)
{
		super(str);
			
		}
		}


public class TestThrow3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			try {
				throw new UserDefinedException("this ");
			}
			catch(UserDefinedException ude) {
				System.out.println("caught the exception");
				System.out.println(ude.getMessage());
			}
		}

	}

}
