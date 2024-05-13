package padroesestruturais.composite;
import java.util.ArrayList;
import java.util.List;

public class GrupoMilitar extends Militar {
    private List<Militar> militares = new ArrayList<>();

    public void adicionarMilitar(Militar militar) {
        militares.add(militar);
    }

    public void removerMilitar(Militar militar) {
        militares.remove(militar);
    }

    @Override
    public String seguirOrdem() {
        StringBuilder resultado = new StringBuilder();
        for (Militar militar : militares) {
            resultado.append(militar.seguirOrdem()).append("\n");
        }
        return resultado.toString();
    }
}
