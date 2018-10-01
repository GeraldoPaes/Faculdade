public class Produto {
	private String descricao;
	private float pesoEmKg;
	private double precoUnitario;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPesoEmKg() {
		return pesoEmKg;
	}

	public void setPesoEmKg(float pesoEmKg) {
		this.pesoEmKg = pesoEmKg;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Produto() {
		
	}
	
	public Produto(String descricao, float peso, double preco) {
		this.descricao = descricao;
		this.pesoEmKg = peso;
		this.precoUnitario = preco;
	}
	
	public String toString() {
		return this.descricao + "\nPreço: R$" + this.precoUnitario + "  Peso: " + this.pesoEmKg + " Kg";
	}
	
}
