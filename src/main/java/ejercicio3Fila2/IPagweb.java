package ejercicio3Fila2;


public interface IPagweb {
    void attach(IUsuario observer);
    void deattach(IUsuario observer);
    void notifyObserver(Publicacion publicacion);

}
