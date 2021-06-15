package ejercicio1Fila2;

public class Memento {

    private String state;

    public Memento(String stateSaved){
        this.state=stateSaved;
    }

    public String getState(){
        return state;
    }
}
