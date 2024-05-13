package padroesestruturais.adapter;

public class AdapterVLC implements IPlayerdeVideo{
    private IPlayerdeMusica playerDeMusica;

    public AdapterVLC(IPlayerdeMusica playerDeMusica) {
        this.playerDeMusica = playerDeMusica;
    }

    @Override
    public void reproduzir(String arquivo) {
        playerDeMusica.tocar("MP3", arquivo);
    }
}
