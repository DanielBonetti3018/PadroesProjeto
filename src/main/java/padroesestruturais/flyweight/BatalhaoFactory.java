package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BatalhaoFactory {
    private static Map<String, Batalhao> batalhoes = new HashMap<>();

    public static Batalhao getBatalhao(String nomeBatalhao, String abreviacao){
        Batalhao batalhao = batalhoes.get(nomeBatalhao);
        if (batalhao== null){
            batalhao = new Batalhao(nomeBatalhao, abreviacao);
            batalhoes.put(nomeBatalhao, batalhao);
        }
        return batalhao;
    }
    public static int getTotalBatalhoes(){return batalhoes.size();}
}
