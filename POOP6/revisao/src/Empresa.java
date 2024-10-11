import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    List<Vaga> vagas;

    public Empresa(String nome) {
        this.nome = nome;
        this.vagas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Vaga> listarVagas() {
        for (Vaga vaga : this.vagas){
            System.out.println(vaga.toString());
        }
        return vagas;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", vagas=" + vagas.toString() +
                '}';
    }

    public void cadastrarVaga(Vaga vaga){
        vagas.add(vaga);
    }

}
