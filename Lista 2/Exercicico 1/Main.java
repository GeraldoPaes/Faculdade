import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do Bezerro:");
		String nome1 = scan.nextLine();
		
		System.out.println("\nAgora, digite o nome do Bode:");
		String nome2 = scan.nextLine();
		
		int tam;
		
		while(true) {
			System.out.println("\nDigite o tamanho do território:");
			tam = scan.nextInt();
			
			if(tam % 2 == 0 && tam >= 6) {
				break;
			}
			else {
				System.out.println("\nValor inválido. Insira um valor par e maior ou igual a 6.");
			}
		}
		
		Territorio t = new Territorio(tam, nome1, nome2);
		
		System.out.println("\n");
		
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam; j++) {
				System.out.print(t.getPoint(i, j) + " ");
			}
			System.out.print("\n");
		}
		
		int fim = 0;
		
		while(fim == 0) {
			int jog1, jog2;
			jog1 = 1;
			jog2 = 1;
			
			while(jog1 == 1) {
				System.out.print("Jogada de "  + t.getP1Name() + " (w, a, s, d): ");
			}
		}

	}

}
