package Arvores;

import java.util.Scanner;

/**
** Função : Sistema de alunos com árvore BINÁRIA DE PESQUISA
** Autor : Daniel Warella Pitsch
** Data : 04/10/2023
** Observações:
*/

public class ED2Lista2Questao14 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int opc;
	    ArvoreEscola_14 arv = new ArvoreEscola_14();
		
	    do{
        	System.out.println("Informe qual opção deseja: "
        			+ "1- inserir aluno"
        			+ "2- remover aluno"
        			+ "3- pesquisar aluno"
        			+ "4- esvaziar arvore"
        			+ "5- exibir arvore"
        			+ "0- Sair");
        	opc = scanner.nextInt();
        	switch (opc) {
        		case 0:
        			break;
        		case 1:
        			System.out.print("Digite o RGM do aluno: ");
        		    int rgm = scanner.nextInt();
        		    scanner.nextLine(); 
        		    System.out.print("Digite o nome do aluno: ");
        		    String nome = scanner.nextLine();
        		    Aluno_14 aluno = new Aluno_14(rgm, nome);
        		    arv.inserirAluno(aluno);
        			break;
        		case 2:
        			System.out.println("Informe o RGM do aluno a ser removido: ");
        			int rgm1 = scanner.nextInt();
        			arv.removerAluno(rgm1);
        			break;
        		case 3:
        			System.out.println("Informe o RGM do aluno a ser removido: ");
        			int rgm2 = scanner.nextInt();
        			arv.pesquisarAluno(rgm2);
        			break;
        		case 4:
        			System.out.println("Arvore esvaziada!");
        			arv.esvaziarArvore();
        			break;
        		case 5:
        			opc=0;
        			break;
        		default:
        			System.out.println("Opcção inválida!");
        			break;
        	}
        	
        }while(opc != 0);
	}
	
}
