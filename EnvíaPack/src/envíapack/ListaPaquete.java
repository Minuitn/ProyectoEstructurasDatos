package envíapack;

/**
 *
 * @author melic
 */
public class ListaPaquete {
    
    private NodoPaquetes inicio;

    public ListaPaquete() {
        this.inicio = null;
    }
    
    public boolean vacia(){
        return inicio == null;
    }
    
    public void insertar(Paquete p){
        NodoPaquetes nuevo = new NodoPaquetes(p);
        
        if (vacia()) {
            inicio = nuevo;
        } else {
            NodoPaquetes aux = inicio;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public Paquete eliminar(int index){
        if (vacia()) {
            return null;
        }
        
        if (index == 0) {
            Paquete p = inicio.getDato();
            inicio = inicio.getSiguiente();
            return p;
        }
        
        NodoPaquetes aux = inicio;
        for (int i = 0; i < index - 1; i++) {
            aux = aux.getSiguiente();
        }
        NodoPaquetes eliminar = aux.getSiguiente();
        if (eliminar== null) {
            return null;
        }
        aux.setSiguiente(eliminar.getSiguiente());
        return eliminar.getDato();    
    }
    
        public String toString(){
            if (vacia()) {
                return "No hay paquetes registrados en el sistema.";
            }
            
            String s = "";
            NodoPaquetes aux = inicio;
            while (aux != null){
                s += aux.getDato().toString();
                aux = aux.getSiguiente();
            }
            return s;
        }

    public NodoPaquetes getInicio() {
        return inicio;
    }

    public void setInicio(NodoPaquetes inicio) {
        this.inicio = inicio;
    }
        
    public Paquete obtenerUltimo() {
        if (vacia()) {
            return null;
        }

        NodoPaquetes aux = inicio;
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }
        return aux.getDato();
    }
    
    public Paquete eliminarUltimo() {
        if (vacia()) {
            return null;
        }

        if (inicio.getSiguiente() == null) {
            Paquete p = inicio.getDato();
            inicio = null;
            return p;
        }

        NodoPaquetes aux = inicio;
        while (aux.getSiguiente().getSiguiente() != null) {
            aux = aux.getSiguiente();
        }

        Paquete p = aux.getSiguiente().getDato();
        aux.setSiguiente(null);
        return p;
    }

  
}

