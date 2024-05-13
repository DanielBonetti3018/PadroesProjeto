package abstractfactory;

public class Cliente {

    private Recibo recibo;
    private Contrato contrato;

    public Cliente (FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.recibo = fabrica.createRecibo();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirRecibo() {
        return this.recibo.emitir();
    }


}
