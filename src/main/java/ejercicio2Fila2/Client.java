package ejercicio2Fila2;

public class Client {

    public static void main(String[] args){

        PagWeb pagWeb =new PagWeb();

        SeguidorRegistrado seguidor1 = new SeguidorRegistrado("Videos, Noticias",
                new Persona("Juan34","27 años"));
        SeguidorRegistrado seguidor2 = new SeguidorRegistrado("Noticias",
                new Persona("Ana34","26 años"));
        SeguidorRegistrado seguidor3 = new SeguidorRegistrado("Videos, Noticias",
                new Persona("Pedro67","19 años"));
        SeguidorRegistrado seguidor4 = new SeguidorRegistrado("Videos, Noticias,Fotos",
                new Persona("Andre45","35 años"));
        SeguidorRegistrado seguidor5 = new SeguidorRegistrado("Videos, Fotos",
                new Persona("Jose56","20 años"));

        pagWeb.attach(seguidor1);
        pagWeb.attach(seguidor2);
        pagWeb.attach(seguidor3);
        pagWeb.attach(seguidor4);
        pagWeb.attach(seguidor5);

        pagWeb.agregarPublicacion(new Publicacion("12/01/2021","Videos","video de perritos"));

    }

}
