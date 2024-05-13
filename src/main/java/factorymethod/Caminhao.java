package factorymethod;

public class Caminhao implements IModelo{
    @Override
    public String fabricar() {
        return "Caminhão fabricado";
    }
}
