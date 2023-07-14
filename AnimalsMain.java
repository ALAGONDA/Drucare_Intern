package Abstraction_Encup_Inheri;

public class AnimalsMain {
	public static void main(String[] args) {
		Cats cats = new Cats();
		cats.cats();
		cats.dogs();
		
		Dogs dogs = new Dogs();
		dogs.cats();
		dogs.dogs();
	}

}
