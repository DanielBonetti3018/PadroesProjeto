package padroesestruturais.adapter;

public class AdapterMp4 implements IPlayerdeVideo {
    private IPlayerdeMusica playerDeMusica;

    public AdapterMp4(IPlayerdeMusica playerDeMusica) {
        this.playerDeMusica = playerDeMusica;
    }

    @Override
    public void reproduzir(String arquivo) {
        playerDeMusica.tocar("MP3", arquivo);
    }
}
