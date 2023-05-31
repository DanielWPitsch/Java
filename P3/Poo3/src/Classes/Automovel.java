package Classes;

public abstract class Automovel {
	private String cor;
	
	public Automovel(String cor) {
		this.cor = cor;
	}
	
	public abstract void Ligar();

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
