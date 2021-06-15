package ejercicio4Fila2;

public class OrdenarPorNombre implements IModoOrdenamiento{
    @Override
    public void ordenar(Persona[] personasArr) {
        System.out.println("Se realizara un ordenamiento segun el nombre de las personas");
        System.out.println("***********************************************");
        Persona[]arr = ordenamiento(personasArr);
        printArray(arr);
        System.out.println("***********************************************");
    }

    public Persona[] ordenamiento(Persona[] arr){
       String aux;
       for(int i=1;i<=arr.length;i++){
           for(int j=0;j< arr.length-i;j++){
               if(arr[j].getNombre().compareTo(arr[j+1].getNombre())>0){
                   aux= arr[j].getNombre();
                   arr[j]=arr[j+1];
                   arr[j+1].setNombre(aux);
               }
           }
       }

        return arr;
    }
    public void printArray(Persona arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.println("Nombre: "+arr[i].getNombre()+" Ci: "+arr[i].getCi());
        }
        System.out.println();
    }

}
