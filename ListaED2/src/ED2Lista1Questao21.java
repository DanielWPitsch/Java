import java.util.Scanner;

/**
** Função : Um novo tipo Complexo para realizar aritmética com números complexos
** Autor : Daniel Warella Pitsch
** Data : 10/09/2023
** Observações:
*/

public class ED2Lista1Questao21 {
	
	private double real;
    private double imaginario;
    public ED2Lista1Questao21(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
   
    public static ED2Lista1Questao21 lerComplexo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a parte real do número complexo: ");
        double real = scanner.nextDouble();
        System.out.print("Digite a parte imaginária do número complexo: ");
        double imaginario = scanner.nextDouble();
        return new ED2Lista1Questao21(real, imaginario);
    }
    
    public ED2Lista1Questao21 somar(ED2Lista1Questao21 outro) {
        double real = this.real + outro.real;
        double imaginario = this.imaginario + outro.imaginario;
        return new ED2Lista1Questao21(real, imaginario);
    }
  
    public ED2Lista1Questao21 subtrair(ED2Lista1Questao21 outro) {
        double real = this.real - outro.real;
        double imaginario = this.imaginario - outro.imaginario;
        return new ED2Lista1Questao21(real, imaginario);
    }
 
    public ED2Lista1Questao21 multiplicar(ED2Lista1Questao21 outro) {
        double real = this.real * outro.real - this.imaginario * outro.imaginario;
        double imaginario = this.real * outro.imaginario + this.imaginario * outro.real;
        return new ED2Lista1Questao21(real, imaginario);
    }
    
    public void mostrar() {
        System.out.println("(" + this.real + ", " + this.imaginario + ")");
    }
    public static void main(String[] args) {

        System.out.println("Digite o primeiro número complexo:");
        ED2Lista1Questao21 c1 = lerComplexo();

        System.out.println("Digite o segundo número complexo:");
        ED2Lista1Questao21 c2 = lerComplexo();

        ED2Lista1Questao21 soma = c1.somar(c2);
        System.out.print("A soma dos dois números complexos é: ");
        soma.mostrar();
        
        ED2Lista1Questao21 diferenca = c1.subtrair(c2);
        System.out.print("A diferença dos dois números complexos é: ");
        diferenca.mostrar();
        
        ED2Lista1Questao21 produto = c1.multiplicar(c2);
        System.out.print("O produto dos dois números complexos é: ");
        produto.mostrar();
    }

}
