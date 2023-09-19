
public class Noh <T>{
	
    private T elemento;
    private Noh <T> proximo;

    public Noh(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public Noh(T elemento, Noh<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Noh<T> getProximo() {
        return proximo;
    }

    public void setProximo(Noh<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Noh{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }

}
