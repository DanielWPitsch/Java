package Trees;

import java.util.LinkedList;
import java.util.Queue;

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

	<T extends Comparable<T> > Node inserir(Node raiz, Object data) {
		if(arvoreVazia(raiz)) {
			raiz = new Node(data);
		}else if(raiz.data.toString().compareTo(data.toString()) > 0){
			raiz.esquerda = inserir(raiz.esquerda, data);
		}else {
			raiz.direita = inserir(raiz.direita, data);
		}
		return raiz;
	}
	
	public void exibirEmOrdem() {
		exibirEmOrdem(raiz);
	}
	
	private void exibirEmOrdem(Node raiz) {
		if(!arvoreVazia(raiz)) {
			exibirEmOrdem(raiz.esquerda);
			System.out.print(raiz.data + "  ");
			exibirEmOrdem(raiz.direita);
		}
	}
	
	public void exibirPreOrdem() {
		exibirPreOrdem(raiz);
	}
	
	private void exibirPreOrdem(Node raiz) {
		if(!arvoreVazia(raiz)) {
			System.out.print(raiz.data + "  ");
			exibirEmOrdem(raiz.esquerda);
			exibirEmOrdem(raiz.direita);
		}
	}
	
	public void exibirPosOrdem() {
		exibirPosOrdem(raiz);
	}
	
	private void exibirPosOrdem(Node raiz) {
		if(!arvoreVazia(raiz)) {
			exibirEmOrdem(raiz.esquerda);
			exibirEmOrdem(raiz.direita);
			System.out.print(raiz.data + "  ");
		}
	}
	
	//metodos imprimindo ao inverso
	
	
	//exibir a arvore "graficamente"
	public static void imprimeArvore(Node raiz, int level) {
		if(raiz == null) {
			return;
		}
		imprimeArvore(raiz.direita, level + 1);
		for(int i =0; i<level; i++) {
			System.out.println("      ");
		}
		System.out.println(raiz.data);
		imprimeArvore(raiz.esquerda, level + 1);
	}
	
	public void exibirNivel() {
		Node tree = raiz;
		if(tree == null) {
			return;
		}
		Queue<Node> fila = new LinkedList<>();
		fila.add(tree);
		while(!fila.isEmpty()) {
			Node no= fila.poll();
			System.out.println(no.data + "  ");
			if(no.esquerda !=null) {
				fila.add(no.esquerda);
			}
			if(no.direita != null) {
				fila.add(no.direita);
			}
		}
	}
}
