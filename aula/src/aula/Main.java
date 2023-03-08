package aula;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		System.out.println("hello world!");
		
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		System.out.println("Digite seu nome");
		String nome = sc.nextLine();
		p1.setNome(nome);

		System.out.println("Digite sua idade: ");
		short idade = sc.nextShort();
		p1.setIdade(idade);
		
		System.out.println("Nome: "+ p1.getNome()+"\nIdade: "+ p1.getIdade());
		
		//System.out.println("Seu nome é "+nome+ " e a sua idade é "+idade);
		
		System.out.println("-Fim-");
	
		/*
		 * CTL+D apaga uma linha 
		 * CTL+Y refaz o que foi desfeito
		 * CTL+L vai para linha procurada
		 * CTL+Shift+/ transforma em comentario
		 * syso CTRL+espaço
		 * ALT + cima ou baixo
		 * botao direito, source, generate gets e sets
		 */
	}

}
