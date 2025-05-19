package Day_4;

class fixedamount{
	public int fixedamount=10000;
}

abstract class Withdrawal {
	abstract void Withdrawal(int amount);
	
}
public class bank_scenario extends Withdrawal {
	 fixedamount f1=new fixedamount();
	 @Override
		void Withdrawal(int amount) {
			f1.fixedamount-=amount;
			 System.out.println("Withdrawn: "+amount);
			 System.out.println("Available Balance: "+f1.fixedamount);
			
		}
	 

	public static void main(String[] args) {
		int amount = Integer.parseInt(args[0]);
		bank_scenario d=new bank_scenario();
		d.Withdrawal(amount);

	}


	

	
}
