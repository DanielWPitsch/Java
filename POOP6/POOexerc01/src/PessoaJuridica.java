public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, double renda, int situacao, String cnpj) {
        super(nome, renda, situacao);
        this.cnpj = cnpj;
    }
}
