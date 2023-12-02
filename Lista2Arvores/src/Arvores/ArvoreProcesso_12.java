package Arvores;

public class ArvoreProcesso_12 {
	
	private NohProcesso_12 root;

    public ArvoreProcesso_12() {
        root = null;
    }

    // Adicionar um processo à árvore
    public void addProcess(Processo_12 processo) {
        root = insert(root, processo);
    }

    private NohProcesso_12 insert(NohProcesso_12 node, Processo_12 processo) {
        if (node == null) {
            return new NohProcesso_12(processo);
        }

        if (processo.prioridade < node.processo.prioridade) {
            node.left = insert(node.left, processo);
        } else {
            node.right = insert(node.right, processo);
        }

        return node;
    }

    public void removeProcess(int id) {
        root = delete(root, id);
    }
    
    private NohProcesso_12 delete(NohProcesso_12 node, int id) {
        if (node == null) {
            return node;
        }

        if (id < node.processo.id) {
            node.left = delete(node.left, id);
        } else if (id > node.processo.id) {
            node.right = delete(node.right, id);
        } else {
            // Nó com o ID encontrado
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Caso tenha dois filhos, encontrar o nó sucessor
            node.processo = menor(node.right);

            // Deletar o nó sucessor
            node.right = delete(node.right, node.processo.id);
        }

        return node;
    }
    
    private Processo_12 menor(NohProcesso_12 node) {
        Processo_12 menor = node.processo;
        while (node.left != null) {
            menor = node.left.processo;
            node = node.left;
        }
        return menor;
    }
    
    void emOrdem(NohProcesso_12 node) {
        if (node != null) {
            emOrdem(node.left);
            System.out.println("ID: " + node.processo.id + ", Prioridade: " + node.processo.prioridade + ", Tempo de Execução: " + node.processo.tempoDeExecucao);
            emOrdem(node.right);
        }
    }

}
