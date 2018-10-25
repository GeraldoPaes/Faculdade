public class Carta {
	private char naipe;
	private String nome;
	private int valor;
	
	public Carta(int naipe, int nome) {
		
		//Definição do Naipe:
		if(naipe == 0) {
			this.naipe = 'E';
		}
		else if(naipe == 1) {
			this.naipe = 'P';
		}
		else if(naipe == 2) {
			this.naipe = 'C';
		}
		else if(naipe == 3) {
			this.naipe = 'O';
		}
		
		//Definição da Carta
		if(nome == 1) {
			this.nome = "A";
		}
		else if(nome == 11) {
			this.nome = "J";
		}
		else if(nome == 12) {
			this.nome = "Q";
		}
		else if(nome == 13) {
			this.nome = "K";
		}
		
		//Definição do Valor
		if(nome <= 10) {
			this.valor = nome;
		}
		else {
			this.valor = 10;
		}
	}
	
	public char getNaipe() {
		return naipe;
	}

	public void setNaipe(char naipe) {
		this.naipe = naipe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String toString() {
		if(this.nome != null) {
			return this.nome + " - " + this.naipe;
		}
		else {
			return this.valor + " - " + this.naipe;
		}
	}
}
