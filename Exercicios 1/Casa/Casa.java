public class Casa {
	private String cor;
	private Porta porta1;
	private Porta porta2;
	private Porta porta3;
	
	public Casa(){
		this.porta1 = new Porta();
		this.porta2 = new Porta();
		this.porta3 = new Porta();
		this.cor = "Branco";
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String s) {
		this.cor = s;
	}
	
	public Porta getPorta1() {
		return porta1;
	}

	public void setPorta1(Porta p1) {
		this.porta1 = p1;
	}

	public Porta getPorta2() {
		return porta2;
	}

	public void setPorta2(Porta p2) {
		this.porta2 = p2;
	}

	public Porta getPorta3() {
		return porta3;
	}

	public void setPorta3(Porta p3) {
		this.porta3 = p3;
	}

	public void pinta(String s) {
		this.setCor(s);
	}
	
	public int quantasPortasEstaoAbertas() {
		int x = 0;
		
		if(porta1.estaAberta() == true) {
			x += 1;
		}
		if(porta2.estaAberta() == true) {
			x += 1;
		}
		if(porta3.estaAberta() == true) {
			x += 1;
		}
		
		return x;
	}
}
