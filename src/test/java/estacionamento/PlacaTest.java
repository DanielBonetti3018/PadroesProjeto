package estacionamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlacaTest {

    @Test
    public void deveRetornarNrPlaca() {
        Placa.getInstance().setNrPlaca("HPX-9066");
        assertEquals("HPX-9066", Placa.getInstance().getNrPlaca()   );
    }

    @Test
    public void deveRetornarHorarioEntrada() {
        Placa.getInstance().setHorarioEntrada("5:15");
        assertEquals("5:15", Placa.getInstance().getHorarioEntrada());
    }

    @Test
    public void deveRetornarHoraioSaida() {
        Placa.getInstance().setHorarioSaida("6:15");
        assertEquals("6:15", Placa.getInstance().getHorarioSaida());
    }

}
