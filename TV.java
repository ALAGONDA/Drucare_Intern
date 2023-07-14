package Abstraction_Encup_Inheri;

public class TV implements TVRemote,SmartTvRemote{

	@Override
	public void tvRemote() {
		System.out.println("Its tv remote");
		
	}

	@Override
	public void smartTvRemote() {
		System.out.println("ITS a smart tv remote");
		
	}

}
