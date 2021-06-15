package ejercicio1Fila2;



public class GeneradorVersionArchivos {

    private String state;
    private int contVersiones;
    public GeneradorVersionArchivos(){this.contVersiones=1;}

    public void crearVersionamiento(String state,AlmacenArchivos almacen){
        int contPalabras=0;
        for(String palabras: state.split(" ")){
            contPalabras++;
        }
        if(contPalabras>=5){
            setState(state);
            almacen.createVersion("version"+contVersiones++,createVersion());
        }
    }


    public void setState(String state) {
        System.out.println("**** Set State *****");
        System.out.println("Contenido del archivo: "+state);
        this.state = state;
    }

    public Memento createVersion(){
        System.out.println("**** Create State *****");
        System.out.println("Contenido del archivo: "+state);
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        System.out.println("Archivo restaurado: "+state);
    }
}
