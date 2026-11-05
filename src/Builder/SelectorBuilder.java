package Builder;

public class SelectorBuilder {

    public static ReservaBuilder seleccionar(String tipo){
        if ( tipo.equals("Hotel")){
            return new BuilderHotel();
        } else if (tipo.equals("Vuelo")){
            return new BuilderVuelo();
        } else if (tipo.equals("Coche")){
            return new BuilderCoche();
        } else {
            throw new IllegalArgumentException("Tipo de reserva no válido: " + tipo);
         

        }
    }

}
