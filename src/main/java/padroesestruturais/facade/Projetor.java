package padroesestruturais.facade;

public class Projetor extends Dispositivos {
    private boolean ligado;
    @Override
    void ligar() {
        ligado = true;
    }
    @Override
    void desligar() {
        ligado = false;
    }
    public boolean estaLigado() {
        return ligado;
    }

}
