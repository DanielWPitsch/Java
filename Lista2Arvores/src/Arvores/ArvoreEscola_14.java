package Arvores;


public class ArvoreEscola_14 {
	
    private NohAluno_14 root;

    public ArvoreEscola_14() {
        root = null;
    }

    public void inserirAluno(Aluno_14 aluno) {
        root = inserir(root, aluno);
        System.out.println("Aluno inserido com sucesso!");
    }

    private NohAluno_14 inserir(NohAluno_14 node, Aluno_14 aluno) {
        if (node == null) {
            return new NohAluno_14(aluno);
        }

        if (aluno.rgm < node.aluno.rgm) {
            node.left = inserir(node.left, aluno);
        } else if (aluno.rgm > node.aluno.rgm) {
            node.right = inserir(node.right, aluno);
        }

        return node;
    }

    public void removerAluno(int rgm) {
        root = remover(root, rgm);
    }

    private NohAluno_14 remover(NohAluno_14 node, int rgm) {
        if (node == null) {
            System.out.println("Aluno não encontrado.");
            return node;
        }

        if (rgm < node.aluno.rgm) {
            node.left = remover(node.left, rgm);
        } else if (rgm > node.aluno.rgm) {
            node.right = remover(node.right, rgm);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            node.aluno = menor(node.right);
            node.right = remover(node.right, node.aluno.rgm);
        }

        System.out.println("Aluno removido com sucesso!");
        return node;
    }

    private Aluno_14 menor(NohAluno_14 node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.aluno;
    }

    public void pesquisarAluno(int rgm) {
        NohAluno_14 alunoEncontrado = pesquisar(root, rgm);
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: RGM=" + alunoEncontrado.aluno.rgm + ", Nome=" + alunoEncontrado.aluno.nome);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    private NohAluno_14 pesquisar(NohAluno_14 node, int rgm) {
        if (node == null || node.aluno.rgm == rgm) {
            return node;
        }

        if (rgm < node.aluno.rgm) {
            return pesquisar(node.left, rgm);
        }

        return pesquisar(node.right, rgm);
    }

    public void esvaziarArvore() {
        root = null;
        System.out.println("Árvore esvaziada.");
    }

    public void exibirArvore() {
        System.out.println("Conteúdo da árvore (in-order):");
        emOrdem(root);
    }

    private void emOrdem(NohAluno_14 node) {
        if (node != null) {
            emOrdem(node.left);
            System.out.println("RGM: " + node.aluno.rgm + ", Nome: " + node.aluno.nome);
            emOrdem(node.right);
        }
    }


}
