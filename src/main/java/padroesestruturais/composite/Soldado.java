package padroesestruturais.composite;

public class Soldado extends Militar {
    @Override
    public String seguirOrdem(){
        return "Soldado: Executando ordem.";
    }
}
