package envíapack;

/**
 *
 * @author melic
 */
public class ListaGuia {
    
    private NodoGuia inicio;
    
    public ListaGuia(){
        inicio = null;
    }
    
    public boolean vacia(){
        return inicio == null;
    }
    
    public void insertar(GuiaEnvio g){
        NodoGuia nuevo = new NodoGuia();
        nuevo.setDato(g);
        if (vacia()) {
            inicio = nuevo;
        } else {
            NodoGuia aux = inicio;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public GuiaEnvio eliminar(int index){
        if (vacia()) {
            return null;
        }
        
        if (index == 0) {
            GuiaEnvio g = inicio.getDato();
            inicio = inicio.getSiguiente();
            return g;
        }
        
        NodoGuia aux = inicio;
        for (int i = 0; i < index - 1; i++) {
            aux = aux.getSiguiente();
        }
        NodoGuia eliminar = aux.getSiguiente();
        if (eliminar== null) {
            return null;
        }
        aux.setSiguiente(eliminar.getSiguiente());
        return eliminar.getDato();    
    }
    
    public String toString(){
        if (vacia()) {
            return "No hay guías generadas.";
        } 
        String s = "";
        NodoGuia aux = inicio;       
        while (aux != null){
            s += aux.getDato().toString();
            aux = aux.getSiguiente();
        }
        return s;
    }

    public NodoGuia getInicio() {
        return inicio;
    }

    public void setInicio(NodoGuia inicio) {
        this.inicio = inicio;
    }
    
    
}
