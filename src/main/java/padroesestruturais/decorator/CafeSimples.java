package padroesestruturais.decorator;

public class CafeSimples implements Cafe{
    public String descricao;

    public CafeSimples() {
    }

    public CafeSimples(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return "Café simples";
    }
    public double getCusto() {
        return 1;
    }
}
