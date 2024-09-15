public class Pessoa {
    private String nome;
    private double renda;
    private int situacao;
    public Conta conta;
    public Endereco endereco;

    public Pessoa(){}
    public Pessoa(String nome, double renda, int situacao){
        this.nome = nome;
        this.renda = renda;
        this.situacao = 1;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public double getRenda(){
        return renda;
    }

    public int getSituacao(){
        return situacao;
    }

}
