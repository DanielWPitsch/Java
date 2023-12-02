package Arvores;

/**
** Função : Processos de um sistema operacional apresentados com arvore
** Autor : Daniel Warella Pitsch
** Data : 28/09/2023
** Observações:
*/

public class ED2Lista2Questao12 {
	public static void main(String[] args) {
		ArvoreProcesso_12 arv = new ArvoreProcesso_12();
        // Criando Processos           (id, nome, prioridade, tempoDeExecucao)
        Processo_12 sistema = new Processo_12(1, "Sistema", 1, 10);
        NohProcesso_12 np1 = new NohProcesso_12(sistema);
        Processo_12 aplicativo1 = new Processo_12(2, "Aplicativo 1", 2, 5);
        NohProcesso_12 np2 = new NohProcesso_12(aplicativo1);
        Processo_12 aplicativo2 = new Processo_12(3, "Aplicativo 2", 4, 2);
        NohProcesso_12 np3 = new NohProcesso_12(aplicativo2);
        Processo_12 servidorWeb = new Processo_12(4, "Servidor Web", 3, 3);
        NohProcesso_12 np4 = new NohProcesso_12(servidorWeb);

        // Adicionando subProcessos 
        arv.addProcess(sistema);
        arv.addProcess(aplicativo1);
        arv.addProcess(aplicativo2);
        arv.addProcess(servidorWeb);

        // Listando a estrutura de Processos
        arv.emOrdem(np1);
    }

    public static void listarProcesso_12s(Processo_12 processo, int nivel) {
    	
    }
}
