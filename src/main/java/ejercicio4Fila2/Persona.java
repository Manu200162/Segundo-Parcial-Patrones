package ejercicio4Fila2;

public class Persona {
    private int ci;
    private String nombre;
    private String fechaDeNacimiento;
    private String profesion;

    public Persona(int ci, String nombre, String fechaDeNacimiento, String profesion) {
        this.ci = ci;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.profesion = profesion;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
