import java.util.List;

public class Vaga {
    private String titulo;
    private String descricao;
    List<Candidato> candidatos;
    List<String> competenciasNecessarias;

    public Vaga() {}

    public Vaga(String titulo, String descricao, List<Candidato> candidatos, List<String> competenciasNecessarias) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.candidatos = candidatos;
        this.competenciasNecessarias = competenciasNecessarias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public List<String> getCompetenciasNecessarias() {
        return competenciasNecessarias;
    }

    public void setCompetenciasNecessarias(List<String> competenciasNecessarias) {
        this.competenciasNecessarias = competenciasNecessarias;
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", candidatos=" + candidatos.toString() +
                ", competenciasNecessarias=" + competenciasNecessarias +
                '}';
    }

    public void candidatarCandidato(Candidato candidato) throws Exception {
        if(candidatos.contains(candidato)){
            throw new Exception("Candidato já está candidatado");
        }else{
            candidatos.add(candidato);
        }
    }

    public List<Candidato> getCompetencias() {
        List<Candidato> selecionados = null;
        for(Candidato candidato : candidatos) {
            if(candidatos.containsAll(getCompetenciasNecessarias())){
                selecionados.add(candidato);
            }
        }
        return selecionados;
    }

}
