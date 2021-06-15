package ejercicio4Fila2;

public class OrdenarPorCi implements IModoOrdenamiento{
    @Override
    public void ordenar(Persona[] personasArr) {
        System.out.println("Se realizara un ordenamiento segun el ci de las personas");
        System.out.println("***********************************************");
        Persona[]arr = selectionSort(personasArr);
        printArray(arr);
        System.out.println("***********************************************");
    }

    public Persona[] selectionSort(Persona[] arr){
        int n = arr.length;
        for(int i=0; i<n;i++){
            int min= i;
            for(int j=i+1;j<n;j++){
                if(arr[j].getCi()<arr[min].getCi()){
                    min=j;
                }
            }
            Persona temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        return arr;
    }
    public void printArray(Persona arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.println("Ci: "+arr[i].getCi()+"Nombre: "+arr[i].getNombre());
        }
        System.out.println();
    }
}
