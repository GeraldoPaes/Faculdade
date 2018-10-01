import java.time.LocalDateTime;
import java.util.Random;

public class NotaFiscal {
	private Produto[] produtos;
	private double descontoPercentual;
	private LocalDateTime dataHora;
	
	public NotaFiscal() {
		this.produtos = new Produto[20];
		Random r = new Random();
		this.descontoPercentual = r.nextInt(15) + 1;
		this.dataHora = LocalDateTime.now();
	}
	
	public NotaFiscal(double desconto) {
		this.produtos = new Produto[20];
		this.descontoPercentual = desconto;
		this.dataHora = LocalDateTime.now();
	}
	
	public double getDescontoPercentual() {
		return this.descontoPercentual;
	}
	
	public void setDescontoPercentual(double d) {
		this.descontoPercentual = d;
	}
	
	public LocalDateTime getDataHora() {
		return this.dataHora;
	}
	
	public void addProduto(Produto produto) {
		for(int i = 0; i < this.produtos.length; i++) {
			if(produtos[i] == null) {
				produtos[i] = produto;
				break;
			}
		}
	}
	
	public double calcularValorTotal() {
		double total= 0;
		for(int i = 0; i < this.produtos.length; i++) {
			total += produtos[i].getPrecoUnitario();
		}
		total = (total*(100-this.getDescontoPercentual()))/100;
		return total;
	}
}
