public class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;

    public PessoaFisica(){}

    public PessoaFisica(String nome, double renda, int situacao, String cpf, String rg){
        super(nome, renda, situacao);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

}
