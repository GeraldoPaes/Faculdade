public class Main {

	public static void main(String[] args) {
		System.out.println("Padrão 1:");
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");	
		}
		
		System.out.println("\nPadrão 2:\n");
		
		for(int i = 10; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("\nPadrão 3:\n");
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(i > j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
		
		System.out.println("\nPadrão 4:\n");
		
		for(int i = 9; i >= 0; i--) {
			for(int j = 0; j < 10; j++) {
				if(i > j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}

}
