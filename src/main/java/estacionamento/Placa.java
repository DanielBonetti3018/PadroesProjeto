package estacionamento;

public class Placa {

    private Placa() {};

    private static Placa instance = new Placa();

    public static Placa getInstance() {return instance;}

    private String nrPlaca;

    private String HorarioEntrada;

    private String HorarioSaida;

    public static void setInstance(Placa instance) {
        Placa.instance = instance;
    }

    public String getNrPlaca() {
        return nrPlaca;
    }

    public void setNrPlaca(String nrPlaca) {
        this.nrPlaca = nrPlaca;
    }

    public String getHorarioEntrada() {
        return HorarioEntrada;
    }

    public void setHorarioEntrada(String horarioEntrada) {
        HorarioEntrada = horarioEntrada;
    }

    public String getHorarioSaida() {
        return HorarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        HorarioSaida = horarioSaida;
    }
}
