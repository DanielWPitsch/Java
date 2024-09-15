import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        try{
            Endereco endereco1 = new Endereco("rua sem nome", "586321-456", "manguabeach", 123, "HellCife");
            Endereco endereco2 = new Endereco("rua com nome", "586321-123", "manguabeach", 323, "HellCife");

            PessoaFisica pessoaF1 = new PessoaFisica("Daniel", 2234.5, 13, "123456789101", "2341234");
            PessoaJuridica pessoaJ1 = new PessoaJuridica("Potency", 22314.5, 11, "09.346.601/0001-25");

            Conta conta1 = new Conta(1233, "01-01-2022", "123456", 1222.22);
            Conta conta2 = new Conta(122143, "01-11-2022", "123456", 31222.22);

            pessoaF1.setEndereco(endereco1);
            pessoaF1.setConta(conta1);

            pessoaJ1.setEndereco(endereco2);
            pessoaJ1.setConta(conta2);

            pessoaF1.conta.depositar(500, pessoaF1.getSituacao());
            pessoaF1.conta.depositar(500, pessoaF1.getSituacao());
            pessoaF1.conta.sacar(200, pessoaF1.getSituacao());
            pessoaF1.conta.sacar(200, pessoaF1.getSituacao());

            pessoaJ1.conta.depositar(1000, pessoaJ1.getSituacao());
            pessoaJ1.conta.depositar(1000, pessoaJ1.getSituacao());
            pessoaJ1.conta.transferir(500, conta1, pessoaJ1.getSituacao());
            pessoaJ1.conta.transferir(500, conta1, pessoaJ1.getSituacao());

            System.out.println("-Pessoa Fisica-\n");
            pessoaF1.conta.imprimirExtrato();
            System.out.println("-Pessoa Juridica-\n");
            pessoaJ1.conta.imprimirExtrato();

            pessoaF1.conta.sacar(2000, pessoaF1.getSituacao());

            System.out.printf("\n-Fim-");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }

    }
}