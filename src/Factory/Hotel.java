package Factory;
public class Hotel implements Servicio {

    @Override 
    public void mostrar() {
        System.out.println("Servicio de hotel creado");
    }

}
