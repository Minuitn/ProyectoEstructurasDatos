package envíapack;

/**
 *
 * @author melic
 */
public class NodoPaquetes {
    
    //Se usa para la lista, pila y cola debido a que el código de nodo
    //de estás tres estructuras es igual.
    
    private Paquete dato;
    private NodoPaquetes siguiente;

    public NodoPaquetes(Paquete dato) {
        this.dato = dato;
    }

    public Paquete getDato() {
        return dato;
    }

    public void setDato(Paquete dato) {
        this.dato = dato;
    }

    public NodoPaquetes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPaquetes siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
