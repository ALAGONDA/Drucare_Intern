package Abstraction_Encup_Inheri;

public class BankA extends Bank {

	
	public int depositAmount;
	
	
	public BankA(int depositAmount) {
		super();
		this.depositAmount = depositAmount;
	}


	@Override
	public void getBalance() {
		 
		System.out.println("Amount Deposited in Bank A : "+depositAmount);
	}

}
