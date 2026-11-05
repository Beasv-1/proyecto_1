package Factory;

public class CreadorHotel extends CreadorServicio{
    
    @Override 
    protected Servicio crearServicio() {
        return new Hotel();
    }

}
