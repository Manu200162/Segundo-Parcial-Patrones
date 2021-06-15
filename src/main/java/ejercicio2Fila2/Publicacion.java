package ejercicio2Fila2;

public class Publicacion {
    private String fechaPublicacion;
    private String tipo;
    private String informacion;

    public Publicacion(String fechaPublicacion, String tipo, String informacion) {
        this.fechaPublicacion = fechaPublicacion;
        this.tipo = tipo;
        this.informacion = informacion;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
}
