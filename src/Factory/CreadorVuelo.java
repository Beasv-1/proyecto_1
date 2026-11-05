package Factory;

public class CreadorVuelo extends CreadorServicio{

    @Override 
    protected Servicio crearServicio() {
        return new Vuelo();
    }
}
