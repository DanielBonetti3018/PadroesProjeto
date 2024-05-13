package padroesestruturais.decorator;

class LeiteDecorator extends CafeDecorator {
        public LeiteDecorator(Cafe cafeDecorado) {
            super(cafeDecorado);
        }
        @Override
        public String getDescricao() {
            return cafeDecorado.getDescricao() + ", com Leite";
        }
        @Override
        public double getCusto() {
            return cafeDecorado.getCusto() + 0.5;
        }
}
