
public class ListaEncadeada<T> {
    private Noh<T> init;
    private Noh<T> end;
    public void adiciona(T elemento){
        Noh<T> celula = new Noh<T>(elemento);
        if (this.init == null && this.end == null){
            this.init = celula;
        }else {
            this.end.setProximo(celula);
        }
        this.end = celula;
    }
    public int contaNoh(Noh <T> Noh){
        if(Noh == null){
            return 0;
        }else {
            return 1 + contaNoh(Noh.getProximo());
        }
    }
    int contador(){
        return contaNoh(init);
    }
    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "init=" + init +
                '}';
    }

}
