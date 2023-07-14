package Abstraction_Encup_Inheri;

public class BankC extends Bank{
public int depositAmount;
	
	
	public BankC(int depositAmount) {
		super();
		this.depositAmount = depositAmount;
	}


	@Override
	public void getBalance() {
		 
		System.out.println("Amount Deposited in Bank A : "+depositAmount);
	}

}
