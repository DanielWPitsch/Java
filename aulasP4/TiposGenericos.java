package aulasP4;

public class TiposGenericos<T> {
	
	T info;
	
	TiposGenericos<T> proximo;
	
	public String toString() {
		return "Celula{" + "info=" + info + "}->";
	}

}
