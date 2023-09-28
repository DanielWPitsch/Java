package Arvores;

class Processo_12 {
	private int id;
    private String nome;
    private int prioridade;
    private int tempoDeExecucao;
    Processo_12 left;
    Processo_12 right;

    public Processo_12(int id, String nome, int prioridade, int tempoDeExecucao) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.tempoDeExecucao = tempoDeExecucao;
        this.left = null;
        this.right = null;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int getTempoDeExecucao() {
		return tempoDeExecucao;
	}

	public void setTempoDeExecucao(int tempoDeExecucao) {
		this.tempoDeExecucao = tempoDeExecucao;
	}
    
}
