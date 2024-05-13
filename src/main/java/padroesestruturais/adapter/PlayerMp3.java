package padroesestruturais.adapter;

public class PlayerMp3 implements IPlayerdeMusica {
    @Override
    public void tocar(String tipo, String arquivo) {
        if (tipo.equalsIgnoreCase("MP3")) {
            System.out.println("Tocando arquivo MP3: " + arquivo);
        } else {
            System.out.println("Formato de arquivo não suportado");
        }
    }
}
