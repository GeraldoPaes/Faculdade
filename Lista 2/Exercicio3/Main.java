import java.util.ArrayList;

public class Loteria {

	public static void main(String[] args) {
		
		Bilhete bilhetePremiado = new Bilhete(6);
		
		for(int i = 6; i <= 15; i++) {
			ArrayList<Bilhete> bilhetes = new ArrayList<>();
			int sorteio = 0, quadras = 0, quinas = 0, megasena = 0, cont = 0;
			
			while(true) {
				sorteio++;
				cont = 0;
				Bilhete bilheteSorteado = new Bilhete(i);
				while(true) {
					
					if(bilhetes.contains(bilheteSorteado)){
						bilheteSorteado = new Bilhete(i);
					}
					else {
						bilhetes.add(bilheteSorteado);
						break;
					}
				}
				
				for(int j = 0; j < i; j++) {
					for(int k = 0; k < 6; k++) {
						if(bilheteSorteado.getNumeros()[j] == bilhetePremiado.getNumeros()[k]) {
							cont++;
						}
					}
				}
				
				if(cont == 4) {
					quadras++;
				}
				else if(cont == 5) {
					quinas++;
				}
				else if(cont == 6) {
					megasena++;
					System.out.println("\nPARABÉNS! Você ganhou na Mega-Sena após " + sorteio + " tentativas!\nBilhete Vencedor: " + bilheteSorteado.toString() + "\n");
					break;
				}
				
				//System.out.println("Sorteio de número " + sorteio + " realizado. O bilhete sorteado " + bilheteSorteado.toString() + " NÃO CONTÉM todos os números do bilhete premiado " + bilhetePremiado.toString());
				
				if(sorteio % 10000 == 0) {
					System.out.println("Tô rodando.");
				}
			}
			
			System.out.println("Jogos de " + i + " números: você apostou " + sorteio + " vezes para ganhar na mega-sena. Dentre esses jogos, você acertou " + quadras + " quadras e " + quinas + " quinas.");
			break;
		}
	}

}
