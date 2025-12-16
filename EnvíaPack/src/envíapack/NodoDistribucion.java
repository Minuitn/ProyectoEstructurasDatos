package envíapack;

/**
 *
 * @author melic
 */
public class NodoDistribucion {
    
    private GuiaEnvio dato;
    private NodoDistribucion siguiente;
    private NodoDistribucion anterior;

    public NodoDistribucion(GuiaEnvio dato) {
        this.dato = dato;
    }

    public GuiaEnvio getDato() {
        return dato;
    }

    public void setDato(GuiaEnvio dato) {
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
