package Day_7;
class ShivaException extends Exception{
	public ShivaException(String message) {
		super(message);
	}
}

public class user_def_ex2 {
	public static void numCheck(int num) throws ShivaException{
		if(num%2==0) {
			throw new ShivaException("Niku maths vachu!!");
		}else {
			System.out.println("Niku maths radhu!!");
		}
	}

	public static void main(String[] args) {
		try {
			numCheck(18);
		}catch(ShivaException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Edhaina Maths aithe Confusing!!");
		}
		

	}

}
