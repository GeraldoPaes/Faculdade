public class Territorio {
	
	private int size;
	private char[][] mapa;
	private String p1Name;
	private String p2Name;
	private int p1L;
	private int p1C;
	private int p2L;
	private int p2C;
	
	public Territorio(int n, String name1, String name2) {
		this.size = n;
		this.mapa = new char[this.size][this.size];
		this.p1Name = name1;
		this.p2Name = name2;
		
		for(int i = 0; i < this.size; i++) {
			for(int j = 0; j < this.size; j++) {
				this.mapa[i][j] = '*';
			}
		}
		
		this.mapa[0][0] = this.p1Name.charAt(0);
		this.mapa[this.size][this.size] = this.p2Name.charAt(0);
		this.p1L = 0;
		this.p1C = 0;
		this.p2L = this.size;
		this.p2C = this.size;
	}
	
	public void movePlayer1(String d) {
		char move = d.charAt(0);
		
		switch(move) {
		case 'w': mapa[this.p1L - 1][this.p1C] = this.p1Name.charAt(0);
		break;
		case 'a': mapa[this.p1L][this.p1C - 1] = this.p1Name.charAt(0);
		break;
		case 's': mapa[this.p1L + 1][this.p1C] = this.p1Name.charAt(0);
		break;
		case 'd': mapa[this.p1L][this.p1C + 1] = this.p1Name.charAt(0);
		break;
		}
	}
	
	public void movePlayer2(String d) {
		char move = d.charAt(0);
		
		switch(move) {
		case 'w': mapa[this.p2L - 1][this.p2C] = this.p1Name.charAt(0);
		break;
		case 'a': mapa[this.p2L][this.p2C - 1] = this.p1Name.charAt(0);
		break;
		case 's': mapa[this.p2L + 1][this.p2C] = this.p1Name.charAt(0);
		break;
		case 'd': mapa[this.p2L][this.p2C + 1] = this.p1Name.charAt(0);
		break;
		}
	}

}
