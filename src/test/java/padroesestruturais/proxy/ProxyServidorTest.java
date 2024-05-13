package padroesestruturais.proxy;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProxyServidorTest {
    @Test
    public void testSolicitarDadosComCache() {
        ServidorRemoto proxy = new ProxyServidor();

        String dados1 = proxy.SolicitarDados("chave1");
        String dados2 = proxy.SolicitarDados("chave2");
        String dados3 = proxy.SolicitarDados("chave1");
        assertEquals("Dados para chave1", dados1);
        assertEquals("Dados para chave2", dados2);
        assertEquals("Dados para chave1", dados3);
    }

    @Test
    public void testSolicitarDadosSemCache() {
        ServidorRemoto proxy = new ProxyServidor();

        String dados1 = proxy.SolicitarDados("chave1");
        String dados2 = proxy.SolicitarDados("chave2");

        assertEquals("Dados para chave1", dados1);
        assertEquals("Dados para chave2", dados2);
    }
}
