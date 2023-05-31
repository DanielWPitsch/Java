package View;

import Classes.Elba;
import Classes.FordKa;
import Classes.Jetta;

public class Principal {
	public static void main(String args[]) {
		Jetta jetta1 = new Jetta("azul");
		FordKa ford1 = new FordKa("preto");
		Elba elba1 = new Elba("rosa");
		
		System.out.println("Cor do Jetta: "+jetta1.getCor());
		jetta1.Ligar();
		System.out.println("\nCor do Ford Ka: "+ford1.getCor());
		ford1.Ligar();
		System.out.println("\nCor do Elba: "+elba1.getCor());
		elba1.Ligar();
		elba1.acenderFarol();
		
		
	}

}
