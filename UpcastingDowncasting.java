package OOPs;

public class UpcastingDowncasting extends UpDemo {
	
	public void man()
	{
		System.out.println("SUb class ");
	}

	public static void main(String[] args) {
		UpDemo downcasting =  new UpcastingDowncasting();
		downcasting.man();
		

	}

}
