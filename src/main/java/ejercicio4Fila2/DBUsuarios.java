package ejercicio4Fila2;

public class DBUsuarios {
    private IModoOrdenamiento modoOrdenamiento;
    private Persona[] personasArr;

    public DBUsuarios(){}

    public void ordenarDB(){
        modoOrdenamiento.ordenar(personasArr);
    }

    public IModoOrdenamiento getModoOrdenamiento() {
        return modoOrdenamiento;
    }

    public void setModoOrdenamiento(IModoOrdenamiento modoOrdenamiento) {
        this.modoOrdenamiento = modoOrdenamiento;
    }

    public Persona[] getPersonasArr() {
        return personasArr;
    }

    public void setPersonasArr(Persona[] personasArr) {
        this.personasArr = personasArr;
    }
}
