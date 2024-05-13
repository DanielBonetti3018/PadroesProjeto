package padroesestruturais.flyweigth;

import org.junit.jupiter.api.Test;
import padroesestruturais.flyweight.BatalhaoFactory;
import padroesestruturais.flyweight.Divisao;
import padroesestruturais.flyweight.Soldado;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class DivisaoTest {

    @Test
    void deveRetornarSoldados() {
        Divisao divisao = new Divisao();
        divisao.cadastrar("Silva", "Decimo", "dec");
        divisao.cadastrar("Juarez", "Decimo", "dec");
        divisao.cadastrar("Leone", "Decimo", "dec");
        divisao.cadastrar("De Paula", "Naval", "nav");

        List<String> saidaEsperada = Arrays.asList(
                "Soldado{nome='Silva', batalhão='Decimo', Abreviação='dec'}",
                "Soldado{nome='Juarez', batalhão='Decimo', Abreviação='dec'}",
                "Soldado{nome='Leone', batalhão='Decimo', Abreviação='dec'}",
                "Soldado{nome='De Paula', batalhão='Naval', Abreviação='nav'}");

        assertEquals(saidaEsperada, divisao.obterSoldados());
    }

    @Test
    void deveRetornarTotalBatalhoes() {
        Divisao divisao = new Divisao();
        divisao.cadastrar("Silva","Decimo", "dec");
        divisao.cadastrar("Juarez","Decimo", "dec");
        divisao.cadastrar("Leone","Decimo", "dec");
        divisao.cadastrar("De Paula","Naval", "nav");

        assertEquals(2, BatalhaoFactory.getTotalBatalhoes());
    }
}
