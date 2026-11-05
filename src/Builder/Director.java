package Builder;

public class Director {

    private ReservaBuilder reservaBuilder;

    public Director(ReservaBuilder reservaBuilder) {
        this.reservaBuilder = reservaBuilder;
    }
    public void construirReserva() {
        reservaBuilder.crearReserva();
        reservaBuilder.informacionCliente();
        reservaBuilder.pago();
        reservaBuilder.destino();
        reservaBuilder.seguro();
        reservaBuilder.fechaInicio();
        reservaBuilder.fechaFin();
        reservaBuilder.habitacion();
        reservaBuilder.asiento();
        reservaBuilder.equipaje();
    }
}
