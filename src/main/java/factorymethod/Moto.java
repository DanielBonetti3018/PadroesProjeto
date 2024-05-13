package factorymethod;

public class Moto implements IModelo{
    @Override
    public String fabricar() {
        return "Moto fabricada";
    }
}
