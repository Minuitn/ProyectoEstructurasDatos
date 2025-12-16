package envíapack;

/**
 *
 * @author melic
 */
public class GuiaEnvio {
    
    private static int contadorGuias = 1;
    private int numeroGuia;
    private String descripcion;
    private String tipoEnvio;
    private String codigoSeguimiento;
    private String fecha;

    public GuiaEnvio(Paquete paquete, String fecha) {
        this.numeroGuia = contadorGuias++;
        this.descripcion = paquete.getDescripcion();
        this.tipoEnvio = paquete.getTipoEnvio();
        this.codigoSeguimiento = "CODE-" + numeroGuia;
        this.fecha = fecha;
    }

    public static int getContadorGuias() {
        return contadorGuias;
    }

    public static void setContadorGuias(int contadorGuias) {
        GuiaEnvio.contadorGuias = contadorGuias;
    }

    public int getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(int numeroGuia) {
        this.numeroGuia = numeroGuia;
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

    public String getCodigoSeguimiento() {
        return codigoSeguimiento;
    }

    public void setCodigoSeguimiento(String codigoSeguimiento) {
        this.codigoSeguimiento = codigoSeguimiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String toString(){
        return "Guía #" + numeroGuia
                + " | " + descripcion
                + " | " + tipoEnvio
                + " | " + codigoSeguimiento
                + " | " + fecha + "\n";
    }
    
}
