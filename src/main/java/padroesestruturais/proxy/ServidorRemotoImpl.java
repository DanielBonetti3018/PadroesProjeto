package padroesestruturais.proxy;

public class ServidorRemotoImpl implements ServidorRemoto {
    public String SolicitarDados(String Chave){
        return "Dados para " + Chave;
    }
}
