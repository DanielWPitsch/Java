import java.util.List;

public class Candidato implements Pessoa {
    private String nome;
    private String email;
    List<String> competencias;

    public Candidato() {}
    public Candidato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", competencias=" + competencias.toString() +
                '}';
    }
}
