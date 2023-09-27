package Arvores;

import java.util.ArrayList;
import java.util.List;

public class Diretorio_09 {
	private String nome;
    private List<Arquivo_09> arquivos;
    private List<Diretorio_09> subdiretorios;

    //recebe o nome e seta arraylist vazio para arquivos e subdiretorios
    public Diretorio_09(String nome) {
        this.nome = nome;
        this.arquivos = new ArrayList<>();
        this.subdiretorios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionaArquivo(Arquivo_09 a) {
        arquivos.add(a);
    }

    public void adicionarSubdiretorio(Diretorio_09 sub) {
        subdiretorios.add(sub);
    }
    
    //retorna a lista de arquivos
    public List<Arquivo_09> getArquivos() {
        return arquivos;
    }
    
    //retorna a lista de subdiretorios
    public List<Diretorio_09> getSubdiretorios() {
        return subdiretorios;
    }
}
