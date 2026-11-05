package Factory;
public class Vuelo implements Servicio{

    @Override 
    public void mostrar() {
        System.out.println("Servicio de vuelo creado");
    }


}
