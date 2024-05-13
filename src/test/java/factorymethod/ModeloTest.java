package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ModeloTest {

    @Test
    void testFabricarCarro() {
        IModelo carro = ModeloFactory.obterModelo("Carro");
        assertNotNull(carro);
        assertTrue(carro instanceof Carro);
        assertEquals("Carro fabricado", carro.fabricar());
    }

    @Test
    void testFabricarMoto() {
        IModelo moto = ModeloFactory.obterModelo("Moto");
        assertNotNull(moto);
        assertTrue(moto instanceof Moto);
        assertEquals("Moto fabricada", moto.fabricar());
    }

    @Test
    void testFabricarCaminhao() {
        IModelo caminhao = ModeloFactory.obterModelo("Caminhao");
        assertNotNull(caminhao);
        assertTrue(caminhao instanceof Caminhao);
        assertEquals("Caminhão fabricado", caminhao.fabricar());
    }

    @Test
    void testModeloInexistente() {
        assertThrows(IllegalArgumentException.class, () -> {
            IModelo modelo = ModeloFactory.obterModelo("Aviao");
        });
    }
}
