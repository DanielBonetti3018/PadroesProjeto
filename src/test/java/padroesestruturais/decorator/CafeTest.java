package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    void deveRetornarDescricaoCafeSimples() {
        Cafe cafe = new CafeSimples();
        assertEquals("Café simples", cafe.getDescricao());
    }

    @Test
    void deveRetornarCustoCafeSimples() {
        Cafe cafe = new CafeSimples();
        assertEquals(1.0, cafe.getCusto());
    }

    @Test
    void deveRetornarDescricaoCafeComLeite() {
        Cafe cafe = new LeiteDecorator(new CafeSimples());
        assertEquals("Café simples, com Leite", cafe.getDescricao());
    }

    @Test
    void deveRetornarCustoCafeComLeite() {
        Cafe cafe = new LeiteDecorator(new CafeSimples());
        assertEquals(1.5, cafe.getCusto());
    }

    @Test
    void deveRetornarDescricaoCafeComCreme() {
        Cafe cafe = new CremeDecorator(new CafeSimples());
        assertEquals("Café simples, com Creme", cafe.getDescricao());
    }

    @Test
    void deveRetornarCustoCafeComCreme() {
        Cafe cafe = new CremeDecorator(new CafeSimples());
        assertEquals(1.75, cafe.getCusto());
    }

    @Test
    void deveRetornarDescricaoCafeComLeiteECreme() {
        Cafe cafe = new CremeDecorator(new LeiteDecorator(new CafeSimples()));
        assertEquals("Café simples, com Leite, com Creme", cafe.getDescricao());
    }

    @Test
    void deveRetornarCustoCafeComLeiteECreme() {
        Cafe cafe = new CremeDecorator(new LeiteDecorator(new CafeSimples()));
        assertEquals(2.25, cafe.getCusto());
    }
}
