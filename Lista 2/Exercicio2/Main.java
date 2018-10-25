import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Blackjack Rural:\n" + 
				"Legenda dos naipes: P – PAUS / C – COPAS / E – ESPADAS / O - OUROS");
		
		int num;
		
		System.out.println("\nQuantos decks de baralho você deseja utilizar nessa partida?");
		
		while(true) {
			num = scan.nextInt();
			
			if(num < 2 || num > 10) {
				System.out.println("\nNúmero inválido de decks. Por favor, escolha um número entre 2 e 10.");
			}
			else {
				break;
			}
		}
		
		//Geração de Deck
		ArrayList<Carta> deck = new ArrayList<>();
		
		for(; num > 0; num--) {
			for(int i = 0; i < 4; i++) {
				for(int j = 1; j <= 13; j++) {
					deck.add(new Carta(i, j));
				}
			}
		}
		
		Collections.shuffle(deck);
		
		System.out.println("\nIniciando partida...\n" + 
				"=============================================");
		
		Jogador jog = new Jogador();
		Jogador banca = new Jogador();
		
		int disp = 1, fim = 0, cont = 0, flag = 0, draw;
		
		while(fim == 0) {
			int aposta;
			char choice;
			draw = 0;
			
			System.out.println("Disputa n." + disp);
			System.out.println("Quantidade de cartas no montante: " + deck.size());
			System.out.println("Quantidade de fichas: " + jog.getFichas());
			System.out.println("Digite sua aposta (mínimo de 2) ou 'X' para sair do jogo.");
			aposta = scan.nextInt();
			
			//Banca pega a sua primeira carta.
			banca.getCartas().add(deck.get(cont));
			deck.remove(cont);
			cont++;
			
			while(flag == 0) {
				System.out.println("\nEssas são as cartas da banca:");
				for(int i = 0; i < banca.getCartas().size(); i++) {
					System.out.print(banca.getCartas().get(i).toString());
					if(i < banca.getCartas().size() - 1) {
						System.out.print(" | ");
					}
				}
				System.out.println("\nTotal de pontos: " + banca.getPontos());
				
				System.out.println("------x------");
					
				//Jogador pega suas cartas.
				jog.getCartas().add(deck.get(cont));
				deck.remove(cont);
				cont++;
				if(draw == 0) {
					jog.getCartas().add(deck.get(cont));
					deck.remove(cont);
					cont++;
				}
				draw = 1;
				
				System.out.println("Essas são as suas cartas:");
				for(int i = 0; i < jog.getCartas().size(); i++) {
					System.out.print(jog.getCartas().get(i).toString());
					if(i < jog.getCartas().size() - 1) {
						System.out.print(" | ");
					}
				}
				System.out.println("\nTotal de pontos: " + jog.getPontos());
				
				System.out.println("\nO que você deseja fazer?");
				System.out.println("(H) HIT - para pedir mais cartas, ou");
				System.out.println("(S) STAY - para parar e deixar a banca jogar");
				
				while(true) {
					choice = scan.next().charAt(0);
					
					if(choice != 'h' && choice != 's' && choice != 'H' && choice != 'S') {
						System.out.println("Comando inválido.");
					}
					else if(choice == 'h' || choice == 'H'){
						break;
					}
					else {
						flag = 1;
						break;
					}
				}
			}
			
			int win;
			
			while(true) {
				if(banca.getPontos() > 21){
					win = 1;
					break;
				}
				else if(banca.getPontos() <= jog.getPontos()) {
					banca.getCartas().add(deck.get(cont));
					deck.remove(cont);
					cont++;
				}
				else {
					win = 0;
					break;
				}
			}
			
			System.out.println("\nEssas são as cartas da banca:");
			for(int i = 0; i < banca.getCartas().size(); i++) {
				System.out.print(banca.getCartas().get(i).toString());
				if(i < banca.getCartas().size() - 1) {
					System.out.print(" | ");
				}
			}
			System.out.println("\nTotal de pontos: " + banca.getPontos());
			
			System.out.println("------x------");
			
			System.out.println("Essas são as suas cartas:");
			for(int i = 0; i < jog.getCartas().size(); i++) {
				System.out.print(jog.getCartas().get(i).toString());
				if(i < jog.getCartas().size() - 1) {
					System.out.print(" | ");
				}
			}
			System.out.println("\nTotal de pontos: " + jog.getPontos());
			
			if(win == 1) {
				System.out.println("RESULTADO: A banca estourou 21 pontos!\nVocê ganhou e recebeu " + aposta + " fichas!");
				jog.setFichas(jog.getFichas() + aposta);
			}
			else {
				System.out.println("RESULTADO: A banca ganhou e você perdeu " + aposta + "fichas!");
				jog.setFichas(jog.getFichas() - aposta);
			}
			
			break;
		}
		
		scan.close();
	}

}
