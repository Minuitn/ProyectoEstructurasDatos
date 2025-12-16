package envíapack;

/**
 *
 * @author melic
 */
public class ListaDistribucion {
    
    private NodoDistribucion inicio;
    private NodoDistribucion fin;
    
    public ListaDistribucion(){
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean vacia(){
        return inicio == null;
    }
    
    public void insertar(Distribucion d){
        NodoDistribucion nuevo = new NodoDistribucion(d);
        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
    }
    
    public String toString(){
        if (vacia()) {
            return "No hay guías en distribución.";
        }
        
        String s = "";
        NodoDistribucion aux = inicio;
        while (aux != null){
            s += aux.getDato().toString();
            aux = aux.getSiguiente();
        }
        
        return s;
    }

    public NodoDistribucion getInicio() {
        return inicio;
    }

    public void setInicio(NodoDistribucion inicio) {
        this.inicio = inicio;
    }

    public NodoDistribucion getFin() {
        return fin;
    }

    public void setFin(NodoDistribucion fin) {
        this.fin = fin;
    }
    
    
}
