package Arvores;

import java.util.Scanner;

/**
** Função : Arvore de diretorios e arquivos
** Autor : Daniel Warella Pitsch
** Data : 26/09/2023
** Observações:
*/

public class ED2Lista2Questao09 {
	public static void main(String args[]) {
		
		int opc=1;
		ArvoreDiretorios_09 arv = new ArvoreDiretorios_09();
		Scanner sc = new Scanner(System.in);
		System.out.println("-Sistema de Diretorios e Arquivos-");
        System.out.println("Informe o nome do diretorio raiz: ");
        String r = sc.next();
        Diretorio_09 raiz = new Diretorio_09(r);
        
        do{
        	System.out.println("Informe qual opção deseja: "
        			+ "1- Criar arquivo"
        			+ "2- Criar pasta"
        			+ "3- Mostrar arquivos e diretorios"
        			+ "4- Entrar em um diretorio"
        			+ "5- Voltar 1 diretorio"
        			+ "0- Sair");
        	opc = sc.nextInt();
        	switch (opc) {
        		case 0:
        			break;
        		case 1:
        			System.out.println("Inofrme o nome do arquivo que deseja criar: ");
        			String nomeArquivo = sc.next();
        			Arquivo_09 arquivo = new Arquivo_09(nomeArquivo);
        			arv.addArquivo(arquivo);
        			break;
        		case 2:
        			System.out.println("Inofrme o nome do diretorio que deseja criar: ");
        			String nomeDiretorio = sc.next();
        			Diretorio_09 diretorio = new Diretorio_09(nomeDiretorio);
        			arv.addDirectorio(diretorio);
        			break;
        		case 3:
        			arv.listar();
        			break;
        		case 4:
        			System.out.println("informe o nome do diretorio que deseja acessar: ");
        			String diretorio1 = sc.next();
        			arv.abrirDiretorio(diretorio1);
        			break;
        		case 5:
        			arv.navegar();
        			break;
        		default:
        			System.out.println("Opcção inválida!");
        			break;
        	}
        	
        }while(opc != 0);
        System.out.println("-Fim-");
    }
}
