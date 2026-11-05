package Factory;

public class CreadorCoche  extends CreadorServicio {
    
    @Override
    protected Servicio crearServicio() {
        return new Coche();
    }
}
