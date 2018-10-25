import java.util.Random;
import java.util.Arrays;

public class Bilhete {
	private int[] numeros;
	
	public Bilhete(int tam) {
		Random rand = new Random();
		this.numeros = new int[tam];
		
		for(int i = 0; i < tam; i++) {
			this.numeros[i] = rand.nextInt(60) + 1;
			for(int j = i - 1; j >= 0; j--) {
				if(this.numeros[i] == this.numeros[j]) {
					i--;
					break;
				}
			}
		}
		
		this.numeros = ordena(this.numeros, tam);
	}

	public int[] getNumeros() {
		return numeros;
	}
	
	public String toString() {
		return Arrays.toString(this.numeros);
	}
	
	public int[] ordena(int[] bilhete, int tam) {
		int holder;
		
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam; j++) {
				if(bilhete[i] < bilhete[j]) {
					holder = bilhete[i];
					bilhete[i] = bilhete[j];
					bilhete[j] = holder;
				}
			}
		}
		
		return bilhete;
	}
	
}
