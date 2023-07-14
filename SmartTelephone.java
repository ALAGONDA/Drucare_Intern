package Abstraction_Encup_Inheri;

public class SmartTelephone extends Telephone{

	@Override
	public void call() {
		System.out.println("Calling");
		
	}

	@Override
	public void lift() {
		System.out.println("call lifting");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Call disconnecting");
		
	}

}
