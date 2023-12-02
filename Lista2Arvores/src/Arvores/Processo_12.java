package Arvores;

class Processo_12 {
	int id;
    private String nome;
    int prioridade;
    int tempoDeExecucao;

    public Processo_12(int id, String nome, int prioridade, int tempoDeExecucao) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.tempoDeExecucao = tempoDeExecucao;
    }

    public Processo_12(Processo_12 processo) {
		// TODO Auto-generated constructor stub
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
