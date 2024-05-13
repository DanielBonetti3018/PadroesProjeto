package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdiomaTest {
    @Test

        public void deveRetornarIdiomaSelecionado() {
            Idioma.getInstance().setIdiomaSelecionado("Ingles");
            assertEquals("Ingles", Idioma.getInstance().getIdiomaSelecionado());
        }

    }
