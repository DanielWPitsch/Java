package Arvores;

/**
** Função : Processos de um sistema operacional apresentados com arvore
** Autor : Daniel Warella Pitsch
** Data : 28/09/2023
** Observações:
*/

public class ED2Lista2Questao12 {
	public static void main(String[] args) {
        // Criando Processos           (id, nome, prioridade, tempoDeExecucao)
        Processo_12 sistema = new Processo_12(1, "Sistema", 1, 10);
        Processo_12 aplicativo1 = new Processo_12(2, "Aplicativo 1", 2, 5);
        Processo_12 aplicativo2 = new Processo_12(3, "Aplicativo 2", 2, 2);
        Processo_12 servidorWeb = new Processo_12(4, "Servidor Web", 3, 3);

        // Adicionando subProcessos 
        //  -PRECISA SER ARVORE BINARIA DE BUSCA!-

        // Listando a estrutura de Processos
    }

    public static void listarProcesso_12s(Processo_12 processo, int nivel) {
    	/*StringBuilder prefixo = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            prefixo.append("  "); // Dois espaços por nível
        } 

        System.out.println(prefixo.toString() + "|-- " + Processo_12.getNome());

        for (Processo_12 subProcesso_12 : Processo_12.getSubprocessos()) {
            listarProcesso_12s(subProcesso_12, nivel + 1);
        } */
    }
}
