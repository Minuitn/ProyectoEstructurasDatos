package envíapack;

/**
 *
 * @author melic
 */
public class Paquete {
    
    private String descripcion;
    private String tipoEnvio;
    private double peso;

    public Paquete(String descripcion, String tipoEnvio, double peso) {
        this.descripcion = descripcion;
        this.tipoEnvio = tipoEnvio;
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String toString(){
        return descripcion +
                " | " + tipoEnvio + 
                " | " + peso + " kg\n";
    }
    
}
