package Builder;

public class BuilderVuelo implements ReservaBuilder {

private Reserva reserva;
    
   public void crearReserva(){
    reserva = new Reserva();

   }
   public void informacionCliente(){
    reserva.infoCliente = "";
   }
   public void pago(){
   }

   public void destino(){

   }
   public void seguro(){

   }
   public void fechaInicio(){

   }
   public void fechaFin(){}

  public void habitacion(){

  }
   public void asiento(){

   }
    public void equipaje(){

    }
}
