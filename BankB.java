package Abstraction_Encup_Inheri;

public class BankB extends Bank{
	
public int depositAmount;
	
	
	public BankB(int depositAmount) {
		super();
		this.depositAmount = depositAmount;
	}


	@Override
	public void getBalance() {
		 
		System.out.println("Amount Deposited in Bank B : "+depositAmount);
	}

}
