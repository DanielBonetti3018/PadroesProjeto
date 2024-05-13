package padroesestruturais.facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class HomeTheaterTest {
    @Test
    void testarLigarDesligarSistema() {
        Projetor projetor = new Projetor();
        Amplificador amplificador = new Amplificador();
        Luzes luzes = new Luzes();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projetor, amplificador, luzes);

        homeTheater.ligarSistema();

        assertTrue(projetor.estaLigado());
        assertTrue(amplificador.estaLigado());
        assertTrue(luzes.estaLigado());

        homeTheater.desligarSistema();

        assertFalse(projetor.estaLigado());
        assertFalse(amplificador.estaLigado());
        assertFalse(luzes.estaLigado());
    }

}
