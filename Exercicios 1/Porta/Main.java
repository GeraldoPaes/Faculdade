public class Main {

	public static void main(String[] args) {
		Porta p1 = new Porta();
		
		p1.abre();
		
		System.out.println("Esta porta está aberta? " + p1.estaAberta());
		
		p1.fecha();
		
		System.out.println("\nE agora, esta porta está aberta? " + p1.estaAberta());
		
		p1.setDimensaoX(100);
		p1.setDimensaoY(200);
		p1.setDimensaoZ(15);
		
		p1.setCor("Azul");
		
		System.out.println("\nEssa porta possui as dimensões " + p1.getDimensaoX() + "cm em X, " + p1.getDimensaoY() + "cm em Y e " + p1.getDimensaoZ() + "cm em Z. Ela está pintada de " + p1.getCor() + ".");
		
		p1.setCor("Amarelo");
		
		System.out.println("\nAgora, ela está pintada de " + p1.getCor() + "!");
		
		p1.setDimensaoX(120);
		p1.setDimensaoY(250);
		p1.setDimensaoZ(30);
		
		System.out.println("\nE agora, suas dimensões são " + p1.getDimensaoX() + "cm em X, " + p1.getDimensaoY() + "cm em Y e " + p1.getDimensaoZ() + "cm em Z!");
	}

}
