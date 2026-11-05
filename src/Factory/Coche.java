package Factory;


public class Coche implements Servicio{

    @Override 

    public void mostrar() {
        System.out.println("Servicio de coche creado");
    }

}
