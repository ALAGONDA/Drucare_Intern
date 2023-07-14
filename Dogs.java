package Abstraction_Encup_Inheri;

public class Dogs extends Animals {
	public void dogs()
	{
		System.out.println("Dogs class dog bark");
	}

	@Override
	public void cats() {
		
		System.out.println("Dogs class cats meow");
	}

}
