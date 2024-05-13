package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MusicTest {

        @Test
        public void testeReproducaoMP4() {
        PlayerMp3 playerDeMusicaMP3 = new PlayerMp3();
        IPlayerdeVideo adaptadorMP4 = new AdapterMp4(playerDeMusicaMP3);

        String arquivoMP4 = "musica.mp4";
        adaptadorMP4.reproduzir(arquivoMP4);
        assertTrue(true);
    }

        @Test
        public void testeReproducaoVLC() {
        PlayerMp3 playerDeMusicaMP3 = new PlayerMp3();
        IPlayerdeVideo adaptadorVLC = new AdapterVLC(playerDeMusicaMP3);

        String arquivoVLC = "musica.vlc";
        adaptadorVLC.reproduzir(arquivoVLC);

        assertTrue(true);
    }
}
