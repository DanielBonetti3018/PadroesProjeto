package factorymethod;

public class Carro implements IModelo {
    @Override
    public String fabricar() {
        return "Carro fabricado";
    }
}
