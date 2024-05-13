package abstractfactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
@Test
    void deveEmitirReciboPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Recibo Pessoa Fisica", cliente.emitirRecibo());
    }

    @Test
    void deveEmitirContratoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Fisica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirReciboPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Recibo Pessoa Juridica", cliente.emitirRecibo());
    }

    @Test
    void deveEmitirContratoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Juridica", cliente.emitirContrato());
    }

}
