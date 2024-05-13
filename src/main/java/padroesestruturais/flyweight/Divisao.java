package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Divisao {

    private List<Soldado> soldados = new ArrayList<>();

    public void cadastrar(String nomeSoldado, String nomeBatalhao, String abreviacao){
        Batalhao batalhao = BatalhaoFactory.getBatalhao(nomeBatalhao, abreviacao);
        Soldado soldado = new Soldado(nomeSoldado, batalhao);
        soldados.add(soldado);
    }
    public List<String> obterSoldados() {
        List<String> saida = new ArrayList<String>();
        for (Soldado soldado : this.soldados) {
            saida.add(soldado.obterSoldado());
        }
        return saida;
    }
}
