package ejercicio4Fila2;

public class Client {
    public static void main(String [] args){
        DBUsuarios db = new DBUsuarios();

        Persona[] personas = new Persona[5];
        personas[0]=new Persona(52,"Juan1","12/01/1998","Pintor");
        personas[1]=new Persona(22,"Juan11","26/07/2004","Escultor");
        personas[2]=new Persona(30,"Juan123","04/09/1999","Administrador");
        personas[3]=new Persona(15,"Juan","26/10/2003","Ingeniero");
        personas[4]=new Persona(23,"Juan1234","24/05/2002","Futbolista");

        db.setPersonasArr(personas);

        db.setModoOrdenamiento(new OrdenarPorCi());
        db.ordenarDB();

        db.setModoOrdenamiento(new OrdenarPorNombre());
        db.ordenarDB();

        db.setModoOrdenamiento(new OrdenarPorProfesion());
        db.ordenarDB();

    }
}
