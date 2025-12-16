package envíapack;

/**
 *
 * @author melic
 */
public class PilaPaquete {
    
    private NodoPaquetes cima;
    
    public PilaPaquete(){
        this.cima = null;
    }
    
    public boolean vacia(){
        return cima == null;
    }
    
    public void apilar(Paquete p){
        NodoPaquetes nuevo = new NodoPaquetes(p);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }
    
    public Paquete desapilar(){
        if (!vacia()) {
            Paquete p = cima.getDato();
            cima = cima.getSiguiente();
            return p;
        }
        return null;
    }
    
    public String toString(){
        if (vacia()) {
            return "No hay paquetes apilados.";
        }
            
        String s = "";
        NodoPaquetes aux = cima;
        while (aux != null){
            s += aux.getDato().toString();
            aux = aux.getSiguiente();
        }
        return s;
    }

    public NodoPaquetes getCima() {
        return cima;
    }

    public void setCima(NodoPaquetes cima) {
        this.cima = cima;
    }
     
     
}
