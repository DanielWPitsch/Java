package Trees;

public class Main {
	
	public static void main(String args[]) {
		
		ArvoreBinaria arv = new ArvoreBinaria();
		Node no1 = new Node(1);
		Node no2 = new Node(3);
		Node no3 = new Node(14);
		arv.inserir(arv.raiz, no1.data);
		arv.inserir(arv.raiz, no2.data);
		arv.inserir(arv.raiz, no3.data);
		
		arv.exibirEmOrdem();
		
	}

}
