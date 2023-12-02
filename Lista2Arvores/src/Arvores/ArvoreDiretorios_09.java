package Arvores;

public class ArvoreDiretorios_09 {
	
    private Diretorio_09 root;
    private Diretorio_09 currentDirectory;

    public ArvoreDiretorios_09() {
        root = new Diretorio_09("/", null);
        currentDirectory = root;
    }

    // Método para adicionar um diretório
    public void addDirectorio(Diretorio_09 diretorio) {
        currentDirectory.subdiretorios.add(diretorio);
    }

    // Método para adicionar um arquivo
    public void addArquivo(Arquivo_09 nome) {
        currentDirectory.arquivos.add(nome);
    }

    // Método para listar o conteúdo do diretório atual
    public void listar() {
        System.out.println("Conteúdo de " + currentDirectory.nome + ":");
        System.out.println("Diretórios:");
        for (Diretorio_09 directory : currentDirectory.subdiretorios) {
            System.out.println(directory.nome);
        }
        System.out.println("Arquivos:");
        for (Arquivo_09 file : currentDirectory.arquivos) {
            System.out.println(file);
        }
    }

    // Método para navegar para um diretório filho
    public void abrirDiretorio(String nome) {
        for (Diretorio_09 directorio : currentDirectory.subdiretorios) {
            if (directorio.nome.equals(nome)) {
                currentDirectory = directorio;
                return;
            }
        }
        System.out.println("Diretório não encontrado: " + nome);
    }

    // Método para navegar para o diretório pai
    public void navegar() {
        if (currentDirectory.pai != null) {
            currentDirectory = currentDirectory.pai;
        } else {
            System.out.println("Você já está no diretório raiz.");
        }
    

}
