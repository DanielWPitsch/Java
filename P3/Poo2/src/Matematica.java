
public class Matematica extends Disciplina{
	private double nota3;
	private double nota4;
	
	public double media(double n1, double n2, double n3, double n4) {
		double media = (n1+n2+n3+n4) /4;
		return media;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

}
