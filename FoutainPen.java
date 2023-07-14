package Abstraction_Encup_Inheri;

public class FoutainPen extends Pen{
	
	public void changeNib()
	{
		System.out.println("Change the nib of pen");
	}

	@Override
	public void write() {
		System.out.println("Writing with pen");
		
	}

	@Override
	public void refill() {
		System.out.println("refilling the pen");
		
	}

}
