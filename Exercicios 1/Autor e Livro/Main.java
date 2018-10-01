import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String n1, n2;
		String e1, e2;
		char g1, g2;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro autor: ");
		n1 = reader.next();
		System.out.println("Agora, digite o gênero do primeiro autor (M para masculino, F para feminino): ");
		g1 =  reader.next().charAt(0);
		System.out.println("Por fim, digite o email do primeiro autor: ");
		e1 = reader.next();
		
		Author a1 = new Author(n1, e1, g1);
		
		System.out.println("\nAgora, vamos aos dados do segundo autor.");
		
		System.out.println("\nDigite o nome do segundo autor: ");
		n2 = reader.next();
		System.out.println("Agora, digite o gênero do segundo autor (M para masculino, F para feminino): ");
		g2 =  reader.next().charAt(0);
		System.out.println("Por fim, digite o email do segundo autor: ");
		e2 = reader.next();
		
		Author a2 = new Author(n2, e2, g2);
		
		String nb1, nb2;
		double p1, p2;
		int qt1, qt2;
		
		System.out.println("\nCom os dados de ambos os autores prontos, é hora de definir os seus livros.");
		
		System.out.println("\nDigite o nome do livro do primeiro autor: ");
		nb1 = reader.next();
		System.out.println("Agora, digite o preço do livro do primeiro autor: ");
		p1 =  reader.nextDouble();
		System.out.println("Por fim, digite a quantidade em estoque desse livro: ");
		qt1 = reader.nextInt();
		
		Book b1 = new Book(nb1, a1, p1, qt1);
		
		System.out.println("\nAgora, vamos aos dados do segundo livro.");
		
		System.out.println("\nDigite o nome do livro do segundo autor: ");
		nb2 = reader.next();
		System.out.println("Agora, digite o preço do livro do segundo autor: ");
		p2 =  reader.nextDouble();
		System.out.println("Por fim, digite a quantidade em estoque desse livro: ");
		qt2 = reader.nextInt();
		
		Book b2 = new Book(nb2, a2, p2, qt2);
		
		System.out.println("\nCom isso, temos:");
		
		System.out.println("\n" + b1.toString());
		System.out.println("\n" + b2.toString());
		
		reader.close();
	}

}
