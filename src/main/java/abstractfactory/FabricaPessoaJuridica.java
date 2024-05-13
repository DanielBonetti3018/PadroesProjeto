package abstractfactory;

public class FabricaPessoaJuridica implements FabricaAbstrata {

    @Override
    public Recibo createRecibo() {return new ReciboPessoaJuridica(); }


    @Override
    public Contrato createContrato() {return new ContratoPessoaJuridica(); }


}
