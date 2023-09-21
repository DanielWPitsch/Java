package Trees;

public class ArvoreBinaria {
	//Arvore binaria usando a classe Node como base
	
	Node raiz;
	
	public ArvoreBinaria() {
		raiz =null;
	}
	
	public void inserir(Object data) {
		raiz = inserir(raiz, data);
	}
	
	boolean arvoreVazia(Node t) {
		return t ==null;
	}

	private <T extends Comparable<T> > Node inserir(Node raiz, Object data) {
		if(arvoreVazia(raiz)) {
			raiz = new Node(raiz);
		}else if(raiz.data.toString().compareTo(data.toString()) > 0){
			raiz.esquerda = inserir(raiz.esquerda, data);
		}else {
			raiz.direita = inserir(raiz.direita, data);
		}
		return raiz;
	}
	
	
}
