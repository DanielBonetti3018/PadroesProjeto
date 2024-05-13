package padroesestruturais.composite;

import org.junit.jupiter.api.Test;
import padroesestruturais.composite.GrupoMilitar;
import padroesestruturais.composite.Soldado;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MilitarTest {
    @Test
void testSoldado() {
    Soldado soldado = new Soldado();
    assertEquals("Soldado: Executando ordem.", soldado.seguirOrdem());
}

    @Test
    void testGrupoMilitar() {
        GrupoMilitar grupoMilitar = new GrupoMilitar();
        Soldado soldado1 = new Soldado();
        Soldado soldado2 = new Soldado();
        grupoMilitar.adicionarMilitar(soldado1);
        grupoMilitar.adicionarMilitar(soldado2);
        assertEquals("Soldado: Executando ordem.\nSoldado: Executando ordem.\n", grupoMilitar.seguirOrdem());
    }

    @Test
    void testHierarquiaMilitar() {
        GrupoMilitar exercito = new GrupoMilitar();
        GrupoMilitar divisao = new GrupoMilitar();
        Soldado soldado1 = new Soldado();
        Soldado soldado2 = new Soldado();
        exercito.adicionarMilitar(divisao);
        divisao.adicionarMilitar(soldado1);
        divisao.adicionarMilitar(soldado2);
        assertEquals("Soldado: Executando ordem.\nSoldado: Executando ordem.\nSoldado: Executando ordem.\nSoldado: Executando ordem.\n", exercito.seguirOrdem());
    }
}
