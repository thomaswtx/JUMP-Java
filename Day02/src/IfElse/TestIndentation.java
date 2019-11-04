package IfElse;

public class TestIndentation {

	public static void main(String[] args) {
		int x = 1;
		int y = 3;
		int z = 4;
		
		if( x < y) 
			System.out.println("Hello");
			if(x < z) 
				System.out.println("Goodbye");
		else
			System.out.println("This is the second else");
			
			if( x < y) 
				System.out.println("Hello");
				if(x < z) 
					System.out.println("Goodbye");
				else
				System.out.println("This is the second else");

	}

}
