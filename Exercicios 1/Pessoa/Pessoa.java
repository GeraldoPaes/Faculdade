public class Pessoa {
	String nome;
	int idade;
	
	public void fazerAniversario(){
		this.idade += 1;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
}
