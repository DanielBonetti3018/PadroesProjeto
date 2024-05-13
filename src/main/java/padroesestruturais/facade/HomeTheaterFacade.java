package padroesestruturais.facade;

class HomeTheaterFacade {
    private Projetor projetor;
    private Amplificador amplificador;
    private Luzes luzes;

    public HomeTheaterFacade(Projetor projetor, Amplificador amplificador, Luzes luzes) {
        this.projetor = projetor;
        this.amplificador = amplificador;
        this.luzes = luzes;
    }

    public void ligarSistema() {
        projetor.ligar();
        amplificador.ligar();
        luzes.ligar();
    }

    public void desligarSistema() {
        projetor.desligar();
        amplificador.desligar();
        luzes.desligar();
    }
}