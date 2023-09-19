import java.util.Scanner;

/**
** Função : Cifra de César para mensagens em Português que incluam 
*tanto caracteres minúsculos como maiúsculos, criptografando e descriptografando
** Autor : Daniel Warella Pitsch
** Data : 09/09/2023
** Observações:
*/

public class ED2Lista1Questao11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a mensagem: ");
        String mensagem = sc.nextLine();
        System.out.print("Informe a chave (um inteiro): ");
        int chave = sc.nextInt();
        sc.close();

        String mensagemCriptografada = criptografar(mensagem, chave);
        System.out.println("Mensagem criptografada: " + mensagemCriptografada);

        String mensagemDescriptografada = descriptografar(mensagemCriptografada, chave);
        System.out.println("Mensagem descriptografada: " + mensagemDescriptografada);
    }

    public static String criptografar(String mensagem, int chave) {
        StringBuilder resultado = new StringBuilder();

        for (char caracter : mensagem.toCharArray()) {
            if (Character.isLetter(caracter)) {
                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                resultado.append((char) ((caracter - base + chave) % 26 + base));
            } else {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }

    public static String descriptografar(String mensagem, int chave) {
        return criptografar(mensagem, 26 - chave); 
    }

}
