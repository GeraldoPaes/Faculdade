public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setIdade(18);
		p1.setNome("Anão");
		
		System.out.println("Seu nome é " + p1.nome + ", e você tem " + p1.idade + " anos.");
		
		p1.fazerAniversario();
		
		System.out.println("\nAgora que completou aniversário, " + p1.nome + ", você tem " + p1.idade + " anos.");
	}

}
