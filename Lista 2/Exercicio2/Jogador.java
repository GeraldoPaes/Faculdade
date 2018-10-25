import java.util.ArrayList;

public class Jogador {
	private int fichas;
	private ArrayList<Carta> cartas;
	
	public Jogador() {
		this.cartas = new ArrayList<>();
		this.fichas = 100;
	}

	public int getFichas() {
		return fichas;
	}

	public void setFichas(int fichas) {
		this.fichas = fichas;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public int getPontos() {
		int valor = 0;
		for(int i = 0; i < this.getCartas().size(); i++) {
			if(this.getCartas().get(i).getNaipe() == 'A') {
				if(valor <= 10) {
					valor += 11;
				}
				else {
					valor += 1;
				}
			}
			else {
				valor += this.getCartas().get(i).getValor();
			}
		}
		return valor;
	}
	
}
