package padroesestruturais.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyServidor implements ServidorRemoto {
    private Map<String, String> cache = new HashMap<>();
    private ServidorRemoto servidor = new ServidorRemotoImpl();
    public String SolicitarDados(String Chave) {
        if (!cache.containsKey(Chave)) {
            cache.put(Chave, servidor.SolicitarDados(Chave));
        }
        return cache.get(Chave);
    }
}
