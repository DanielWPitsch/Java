import java.util.ArrayList;

public class Conta implements IExtrato{
    private long numero;
    private String dataAbertura;
    private String dataEncerramento;
    private String senha;
    private int situacao;
    private double saldo;
    //private Movimento movimento;
    ArrayList<Movimento> extrato = new ArrayList<Movimento>();

    public Conta(){}

    public Conta(long numero, String dataAbertura, String senha, double saldo){
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.senha = senha;
        this.situacao = 1;
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public String getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(String dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void imprimirExtrato() {
        for (Movimento m : extrato) {
            System.out.println(m.toString());
        }
    }

    public void sacar(double valor, int situacaoDonoConta)throws Exception{
        if(situacaoDonoConta!= 1 || situacao != 1){
            throw new Exception("Conta ou todas as contas desativadas!");
        }
        else if(this.saldo < valor){
            throw new Exception("Saldo insuficiente!");
        }else{
            saldo -= valor;
            Movimento m = new Movimento(TipoMovimentoEnum.SAQUE, -valor);
            extrato.add(m);
        }
    }
    public void depositar(double valor, int situacaoDonoConta) throws Exception{
        if(situacaoDonoConta!= 1 || situacao != 1){
            throw new Exception("Conta ou todas as contas desativadas!");
        }
        saldo += valor;
        Movimento m = new Movimento(TipoMovimentoEnum.DEPOSITO, valor);
        extrato.add(m);
    }

    public void transferir(double valor, Conta conta, int situacaoDonoConta) throws Exception{
        if(situacaoDonoConta!= 1 || situacao != 1){
            throw new Exception("Conta ou todas as contas desativadas!");
        }
        else if(this.saldo < valor){
            throw new Exception("Saldo insuficiente!");
        } else{
            saldo -= valor;
            conta.setSaldo(valor);
            Movimento m = new Movimento(TipoMovimentoEnum.TRANSFERENCIA, -valor);
            Movimento m2 = new Movimento(TipoMovimentoEnum.TRANSFERENCIA, valor);
            extrato.add(m);
            conta.extrato.add(m2);
        }
    }
}
