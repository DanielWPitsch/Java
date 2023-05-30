
public class Programador extends Funcionario {
	
	private String linguagem;
	
	public Programador(String s) {
		this.linguagem = s;
	}

	public String informarLinguagem() {
		return linguagem;
	}
}
