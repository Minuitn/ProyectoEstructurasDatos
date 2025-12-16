package envíapack;

/**
 *
 * @author melic
 */
public class Distribucion {
    
    private GuiaEnvio guia;
    private String ciudad;
    private String direccion;
    private String fechaEntrega;

    public Distribucion(GuiaEnvio guia, String ciudad, String direccion, String fechaEntrega) {
        this.guia = guia;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.fechaEntrega = fechaEntrega;
    }

    public GuiaEnvio getGuia() {
        return guia;
    }

    public void setGuia(GuiaEnvio guia) {
        this.guia = guia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    public String toString(){
        return guia.toString() +
                " --> Destino: " + ciudad + ", "
                + direccion + " | Entrega: " + fechaEntrega 
                + "\n";
    }
}
