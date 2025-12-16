package envíapack;

/**
 *
 * @author melic
 */
public class ColaPaquete {
    
    private NodoPaquetes inicio;
    private NodoPaquetes fin;

    public ColaPaquete() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean vacia(){
        return inicio == null;      
    }
    
    public void encolar(Paquete p){
        NodoPaquetes nuevo = new NodoPaquetes(p);
        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public Paquete desencolar(){
        if (vacia()) {
            return null;
        }
        
        Paquete p = inicio.getDato();
        inicio = inicio.getSiguiente();
        
        if (inicio == null) {
            fin = null;
        }
        return p;
    }
    
    public String toString(){
        if (vacia()) {
            return "No hay paquetes apilados.";
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

    public NodoPaquetes getFin() {
        return fin;
    }

    public void setFin(NodoPaquetes fin) {
        this.fin = fin;
    }
    
    
}
