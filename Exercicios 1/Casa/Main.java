public class Main {

	public static void main(String[] args) {
		Casa c1 = new Casa();
		
		System.out.println("Essa casa está pintada de " + c1.getCor() + " e " + c1.quantasPortasEstaoAbertas() + " de suas portas estão abertas.");
		
		c1.setCor("Verde");
		
		c1.getPorta1().abre();
		
		System.out.println("\nAgora, essa casa está pintada de " + c1.getCor() + " e " + c1.quantasPortasEstaoAbertas() + " de suas portas estão abertas.");
		
		c1.getPorta2().abre();
		c1.getPorta3().abre();
		
		System.out.println("\nPor fim, agora, " + c1.quantasPortasEstaoAbertas() + " de suas portas estão abertas.");
	}
