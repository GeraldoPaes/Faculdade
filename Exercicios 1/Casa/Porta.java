public class Porta {
	private boolean aberta;
	private String cor;
	private float dimensaoX;
	private float dimensaoY;
	private float dimensaoZ;
	
	public void setAberta(boolean a) {
		this.aberta = a;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String c) {
		this.cor = c;
	}

	public float getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(float dx) {
		this.dimensaoX = dx;
	}

	public float getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(float dy) {
		this.dimensaoY = dy;
	}

	public float getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(float dz) {
		this.dimensaoZ = dz;
	}

	public void abre() {
		this.setAberta(true);
	}
	
	public void fecha() {
		this.setAberta(false);
	}
	
	public void pinta(String s) {
		this.setCor(s);
	}
	
	public boolean estaAberta() {
		return this.aberta;
	}
}
