package polymorphismExample;

public class testPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet = new Pet();
		Cat cat = new Cat();
		
		if(cat instanceof Pet) {
			System.out.println("Instanceof: True");
		}
		
		if(pet.getClass().equals(cat)) {
			System.out.println("getClass: True");
		}
		else {
			System.out.println("getClass: False");
		}
		
		
		

	}

}
