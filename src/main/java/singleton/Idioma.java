package singleton;

public class Idioma {
    private static Idioma instance = new Idioma();
    public static Idioma getInstance() {
        return instance;
    }

    private String idiomaSelecionado;

    public String getIdiomaSelecionado() {
        return idiomaSelecionado;
    }

    public void setIdiomaSelecionado(String idiomaSelecionado) {
        this.idiomaSelecionado = idiomaSelecionado;
    }

}
