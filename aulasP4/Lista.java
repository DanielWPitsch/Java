package aulasP4;

public class Lista<T> {
	TiposGenericos<T> primeiro;
	TiposGenericos<T> ultimo;
	
	int tamanho;
	
	public Lista() { this.tamanho = 0; }
	
	public void adicionar(T informacao) {
		TiposGenericos<T> novaCelula = new TiposGenericos<>();
		novaCelula.info = informacao;
		novaCelula.proximo = null;
		
		if(primeiro == null) {
			primeiro = novaCelula;
		}else {
			ultimo.proximo = novaCelula;
		}
		ultimo = novaCelula;
		tamanho++;
	}
	
	public void imprimir() { imprimirNo(primeiro);}
	
	private void imprimirNo(TiposGenericos<T> celula) {
		if(celula != null) {
			System.out.println(""+celula.info);
			imprimirNo(celula.proximo);
		}
	}
}
