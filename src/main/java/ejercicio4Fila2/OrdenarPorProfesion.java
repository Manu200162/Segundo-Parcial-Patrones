package ejercicio4Fila2;

public class OrdenarPorProfesion implements IModoOrdenamiento{
    @Override
    public void ordenar(Persona[] personasArr) {
        System.out.println("Se realizara un ordenamiento segun la profesion de las personas");
        System.out.println("***********************************************");
        Persona[]arr = ordenamiento(personasArr);
        printArray(arr);
        System.out.println("***********************************************");
    }

    public Persona[] ordenamiento(Persona[] arr){
        String aux;
        for(int i=1;i<=arr.length;i++){
            for(int j=0;j< arr.length-i;j++){
                if(arr[j].getProfesion().compareTo(arr[j+1].getProfesion())>0){
                    aux= arr[j].getProfesion();
                    arr[j]=arr[j+1];
                    arr[j+1].setProfesion(aux);
                }
            }
        }

        return arr;
    }
    public void printArray(Persona arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.println("Profesion: "+arr[i].getProfesion()+" Nombre: "+arr[i].getNombre());
        }
        System.out.println();
    }


}
