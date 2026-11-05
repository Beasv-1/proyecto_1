package Factory;

public abstract class CreadorServicio  {

    protected abstract Servicio crearServicio();

    public void ejecutarServicio() {
        Servicio servicio = crearServicio();
        servicio.mostrar();

    }
}
