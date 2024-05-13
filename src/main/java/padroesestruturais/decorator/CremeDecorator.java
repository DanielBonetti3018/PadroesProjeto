package padroesestruturais.decorator;

class CremeDecorator extends CafeDecorator {
    public CremeDecorator(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + ", com Creme";
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto() + 0.75;
    }
}
