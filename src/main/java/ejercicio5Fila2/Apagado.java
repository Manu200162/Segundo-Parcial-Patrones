package ejercicio5Fila2;

public class Apagado implements IEstadoCompu{
    @Override
    public void handler(Compu computadora) {
        System.out.println("*************El estado es de Apagado");
        System.out.println("Los programas se estan cerrando");
        computadora.setUsoCpu(0);
        computadora.setUsoMemoriaRAM(0);
        System.out.println("Se dejo de utilizar los recursos, consumo de cpu: "+computadora.getUsoCpu()+"%"+
                "Consumo de RAM: "+computadora.getUsoMemoriaRAM());
    }
}
