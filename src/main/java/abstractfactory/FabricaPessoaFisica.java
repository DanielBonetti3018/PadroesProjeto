package abstractfactory;

public class FabricaPessoaFisica implements FabricaAbstrata {

    @Override
    public Recibo createRecibo() {
        return new ReciboPessoaFisica();
    }

    @Override
    public Contrato createContrato() {
        return new ContratoPessoaFisica();
    }
}
