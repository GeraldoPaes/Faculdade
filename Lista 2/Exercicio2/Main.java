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
		
		System.out.println("\nIniciando partida...");
		
		Jogador jog = new Jogador();
		Jogador banca = new Jogador();
		
		int disp = 1, fim = 0, flag = 0, draw, win;
		
		while(fim == 0) {
			
			if(deck.size() == 0) {
				for(; num > 0; num--) {
					for(int i = 0; i < 4; i++) {
						for(int j = 1; j <= 13; j++) {
							deck.add(new Carta(i, j));
						}
					}
				}
				
				Collections.shuffle(deck);
			}
			
			jog.getCartas().clear();
			banca.getCartas().clear();
			
			System.out.println("=============================================");
			int aposta;
			char choice;
			draw = 0;
			win = 2;
			flag = 0;
			
			System.out.println("Disputa n." + disp);
			System.out.println("Quantidade de cartas no montante: " + deck.size());
			System.out.println("Quantidade de fichas: " + jog.getFichas());
			while(true) {
				System.out.println("Digite sua aposta (mínimo de 2) ou '0' para sair do jogo.");
				aposta = scan.nextInt();
				
				if(aposta == 0) {
					fim = 1;
					break;
				}
				else if(aposta < 2) {
					System.out.println("Valor inválido.\n");
				}
				else if(aposta > jog.getFichas()) {
					System.out.println("Você não tem fichas o suficiente para fazer essa aposta!\n");
				}
				else {
					break;
				}
			}
			
			if(fim == 1) {
				break;
			}
			
			//Banca pega a sua primeira carta.
			banca.getCartas().add(deck.get(0));
			deck.remove(0);
			
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
				jog.getCartas().add(deck.get(0));
				deck.remove(0);
				if(draw == 0) {
					jog.getCartas().add(deck.get(0));
					deck.remove(0);
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
				
				if(jog.getPontos() > 21) {
					win = 3;
					System.out.println("Você estourou 21 pontos e perdeu " + aposta + " fichas!");
					jog.setFichas(jog.getFichas() - aposta);
					break;
				}
				
				System.out.println("\nO que você deseja fazer?");
				System.out.println("(H) HIT - para pedir mais cartas, ou");
				System.out.println("(S) STAY - para parar e deixar a banca jogar");
				
				while(true) {
					choice = scan.next().charAt(0);
					scan.nextLine();
					
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
			
			while(win == 2) {
				if(banca.getPontos() > 21){
					win = 1;
					break;
				}
				else if(banca.getPontos() <= jog.getPontos()) {
					banca.getCartas().add(deck.get(0));
					deck.remove(0);
				}
				else {
					win = 0;
					break;
				}
			}
			
			if(win != 3) {
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
			}
			
			if(win == 1) {
				System.out.println("RESULTADO: A banca estourou 21 pontos!\nVocê ganhou e recebeu " + aposta + " fichas!\n");
				jog.setFichas(jog.getFichas() + aposta);
			}
			else if(win == 0){
				System.out.println("RESULTADO: A banca ganhou e você perdeu " + aposta + " fichas!\n");
				jog.setFichas(jog.getFichas() - aposta);
			}
			
			disp++;
		}
		
		if(jog.getFichas() == 100) {
			System.out.println("\nVocê terminou com o mesmo número de fichas que começou, tente outra vez!");
		}
		else if(jog.getFichas() > 100) {
			System.out.println("\nParabéns! Você ganhou " + (jog.getFichas() - 100) + " fichas!");
		}
		else {
			System.out.println("\nQue pena! Você perdeu " + (100 - jog.getFichas()) + " fichas! Tente outra vez!");
		}
		
		scan.close();
	}

}
