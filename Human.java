package Abstraction_Encup_Inheri;

public class Human extends Monkey  implements BasicAnimal{

	@Override
	public void eat() {
		System.out.println("Eating");
		
	}

	@Override
	public void sleep() {
		
		System.out.println("Sleeping");
	}

}
