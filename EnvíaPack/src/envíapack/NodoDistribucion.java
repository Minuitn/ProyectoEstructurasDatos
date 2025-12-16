package envíapack;

/**
 *
 * @author melic
 */
public class NodoDistribucion {
    
    private Distribucion dato;
    private NodoDistribucion siguiente;
    private NodoDistribucion anterior;

    public NodoDistribucion(Distribucion dato) {
        this.dato = dato;
    }

    public Distribucion getDato() {
        return dato;
    }

    public void setDato(Distribucion dato) {
        this.dato = dato;
    }

    public NodoDistribucion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDistribucion siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDistribucion getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDistribucion anterior) {
        this.anterior = anterior;
    }
    
    
}
